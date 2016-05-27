package br.com.siag.util;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException; 

public class ConnectionFactory {
    
    public static Connection getConnection() throws ClassNotFoundException{  
        String driver = "com.mysql.jdbc.Driver";
        //String user = "sisagenda";
        //String pwd = "s1s4g3nd4";
        //String url    = "jdbc:mysql://179.188.16.12:3306/sisagenda";
        String url      = "jdbc:mysql://localhost:3306/sisagenda";
        String user     = "root";
        String pwd      = "sql123";
        
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url,user,pwd);  
        } catch(SQLException | ClassNotFoundException excecao) {  
            throw new RuntimeException(excecao);  
        }
    }
    
}
