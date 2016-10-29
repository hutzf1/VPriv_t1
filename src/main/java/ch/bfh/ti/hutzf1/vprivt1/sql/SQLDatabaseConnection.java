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

public class SQLDatabaseConnection {  

    // Connect to your database.  
    // Replace server name, username, and password with your credentials  
    public static void main(String[] args) {        
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
    }  
}  
