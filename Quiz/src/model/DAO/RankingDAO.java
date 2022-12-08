/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.VO.ItemRanking;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author Guilherme
 */
public class RankingDAO {
    private ArrayList<ItemRanking>listaRanking = new ArrayList<>();
    private Connection con;
    private Statement stmt;
    
    public RankingDAO(){
        this.con = ConexaoBD.conectar();
    }
    
    
    public ArrayList<ItemRanking> RetornarListaRanking(){ 
        String query = "select nome_jogador, maximo_pontos from jogador order by maximo_pontos desc;";
        
        ResultSet rs = null;
         try{
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
                                                     
            while(rs.next()){
                ItemRanking itemRanking = new ItemRanking(rs.getString("nome_jogador"), rs.getInt("maximo_pontos"));
                this.listaRanking.add(itemRanking);
            }                  
            stmt.close();
            rs.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return this.listaRanking;
    }
}