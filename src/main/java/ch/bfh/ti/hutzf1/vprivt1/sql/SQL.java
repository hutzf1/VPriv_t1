/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bfh.ti.hutzf1.vprivt1.sql;

import java.sql.*;

/**
 *
 * @author fh
 */

public class SQL {
    
    public Connection connect() {
        // Connect to database.
        String connectionString = 
            "jdbc:sqlserver://btdev.database.windows.net:1433;"
            + "database=btdev;"
            + "user=btdev@btdev;"
            + "password=abcd1234$$$$;"
            + "encrypt=true;"
            + "trustServerCertificate=false;"
            + "hostNameInCertificate=*.database.windows.net;"
            + "loginTimeout=30;";
        
        // Declare the JDBC objects.  
        Connection connection = null;  
        Statement stmt = null;  
        ResultSet rs = null; 
        
        try {  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(connectionString);  
        }  
        catch (Exception e) {  
            e.printStackTrace();  
        }  
        finally {  
            if (connection != null) try { connection.close(); } catch(Exception e) {}  
        }  
        
        return connection;
    }
    
    public void disconnect(Connection connection) throws SQLException {
        connection.close();
    }
    
    public void insert(Connection connection, String query) throws SQLException {
        // Create and execute an SQL statement that returns some data.  
        //String SQL = "SELECT TOP 10 * FROM Test";  
        //String SQL = "INSERT INTO Test VALUES (1)";
        Statement stmt = connection.createStatement();  
        //ResultSet rs = 
        stmt.executeQuery(query);  
    }
}
