/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlydiem_doanck;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author pk115
 */
public class SQLServerConnection {
    public static Connection getSQLServerConnection() throws ClassNotFoundException, SQLException{
        String hostName = "localhost";
        String databaseName = "QLYDIEMHS";
        String port = "1433";
        String username = "sa";
        String password = "123";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //String connectionString = "Server=localhost//SQLEXPRESS;Database=QLYDIEMHS;Trusted_Connection=True;";
        String connectionString = "jdbc:sqlserver://"+hostName+":"+port+";DatabaseName="+databaseName+";encrypt=true;trustServerCertificate=true;"; 
        Connection sqlConnect = DriverManager.getConnection(connectionString,username,password);
        return sqlConnect;
    }
}
