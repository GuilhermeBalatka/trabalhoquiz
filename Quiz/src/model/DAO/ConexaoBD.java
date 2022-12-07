
package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBD {
    

    
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost/quiz";
    private static final String usuario = "root";
    private static final String senha = "root";
    
    
   
    public static Connection conectar(){
        Connection con = null;
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("conexao com sucesso");
        }catch(ClassNotFoundException e){
            System.out.println("Erro no driver de conexão.");
            //e.printStackTrace();
        }catch(SQLException e){
            System.out.println("Erro na conexão com o servidor.");
        }
        
        return con;
    }
    
    
    public static void main(String[] args) {
        ConexaoBD.conectar();
    }
}

