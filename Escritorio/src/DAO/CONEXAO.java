package DAO;

import java.sql.*;
import javax.swing.JOptionPane;


public class CONEXAO {
    
    public static Connection con(){
    
           java.sql.Connection conecta = null;
           
           String driver = "com.mysql.jdbc.Driver";
           /*String url = "jdbc:mysql://34.28.138.188:3306/bd_EscritorioMaia?characterEncoding=utf-8";*/
           String url = "jdbc:mysql://localhost:3306/bd_EscritorioMaia?characterEncoding=utf-8";
           String user = "root";
           String senha = "semsenha";
           
           try {
               
               Class.forName(driver);
               conecta = DriverManager.getConnection(url,user,senha);
               
                return conecta;
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e);
                return null;
        }
        
    }
    
}
