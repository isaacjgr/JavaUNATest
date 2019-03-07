/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author isaacjgr
 */
public class PostgreSQLConn {
    private final String url = "jdbc:postgresql://localhost:5432/dvdrental";
    private final String user = "postgres";
    private final String password = "1234";
    
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
