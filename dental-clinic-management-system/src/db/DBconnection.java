/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Isranjan
 */
public class DBconnection {
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName(
            "com.mysql.jdbc.Driver");

            con = (Connection) DriverManager.getConnection(
            "jdbc:mysql://localhost/Dentaldb",
            "root",
            "");
            
            System.out.println("Database Connected");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return con;

    }
}
