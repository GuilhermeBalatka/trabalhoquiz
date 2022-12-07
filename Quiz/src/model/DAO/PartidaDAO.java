
package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.sql.PreparedStatement;


public class PartidaDAO {
    
    private Connection con;
    private ArrayList<Pergunta> listaPerguntas = new ArrayList<>();
    private Statement stmt;
    private int total_acertos;
    private int total_perguntas_repondidas;
    private int total_perguntas;
    private String area;
    private String dificuldade;
    private float porcentagem_acertos;
    private String nome;
    private int total_perguntas_requesicoes;

  
    
    
    

    public PartidaDAO(String nome, String area, String dificuldade, int total_perguntas) {
        this.con = ConexaoBD.conectar();
        this.nome = nome;
        this.area = area;
        this.dificuldade = dificuldade;
        this.total_perguntas = total_perguntas;
        this.total_perguntas_requesicoes = this.total_perguntas;
        this.CriarListaPerguntas();
        
    }
    
      public int getTotal_acertos() {
        return total_acertos;
    }

    public int getTotal_perguntas_requesicoes() {
        return total_perguntas_requesicoes;
    }

  
    public void CriarListaPerguntas(){
        String comandoSQL = "select * from pergunta where area = '"+this.area+"' and dificuldade = '"+this.dificuldade+"'";
        ResultSet rs = null;
         try{
            stmt = con.createStatement();
            rs = stmt.executeQuery(comandoSQL);
                                                     
            while(rs.next()){
                Pergunta pergunta = new Pergunta(rs.getInt("id_pergunta"), rs.getString("titulo"), rs.getString("alternativa_a"), rs.getString("alternativa_b"), rs.getString("alternativa_c"), rs.getString("alternativa_d"), rs.getString("area"), rs.getString("dificuldade"), rs.getString("resposta_certa"));
                listaPerguntas.add(pergunta);
            }                  
            stmt.close();
            rs.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public Pergunta RetornarPergunta(){
        Random random = new Random();
        int numero_pergunta; //gerar numero aleatorio interio entra 0 e tamanha da lista de perguntas - 1
        numero_pergunta = random.nextInt(listaPerguntas.size());
        Pergunta pergunta_escolhida = listaPerguntas.get(numero_pergunta);
        listaPerguntas.remove(numero_pergunta);
        this.total_perguntas--;
        return pergunta_escolhida;
       
    }
    
    public int VereficarPergunta(String alternativa_respondida, String alternativa_correta){
        if(alternativa_respondida.equals(alternativa_correta)){
            this.total_acertos++;
        }
        this.total_perguntas_repondidas++;
        this.porcentagem_acertos = 100* this.total_acertos / this.total_perguntas_repondidas;
        return this.total_perguntas_repondidas;
    }
    
    public void SalvarPartida(){
        String comandoInserirJogador = "insert into jogador(nome_jogador) values ('"+this.nome+"');";
        String comandoInserirPartida = "insert into partida(id_jogador, area, dificuldade, total_acertos, total_perguntas) values ((select count(1) from jogador),'"+this.area+"','"+this.dificuldade+"',"+this.total_acertos+","+this.total_perguntas_requesicoes+");";
        //String comandoInserirPartida = "insert into jogador(nome_jogador) values ('"+this.nome+"');";
        
        
         try{
            PreparedStatement stmt1 = con.prepareStatement(comandoInserirJogador);
            PreparedStatement stmt2 = con.prepareStatement(comandoInserirPartida);
            stmt1.execute();                             
            stmt2.execute();  
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
  
    
    
 /*   public void cadatrarPartida(){
         String sql = "insert into produto (nome, valor, frete) values (?,?,?)";        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getValor());
            stmt.setDouble(3, produto.getFrete());
            
            return stmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();            
        }        
           
    }*/
    
    
    
}
