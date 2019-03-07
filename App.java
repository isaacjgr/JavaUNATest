/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import database.PostgreSQLConn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isaacjgr
 */
public class App {
    public static void main(String[] args) {
        App app = new App();
        PostgreSQLConn conn = new PostgreSQLConn();
        Connection connection = conn.connect();
        
        try {
            Statement stm = connection.createStatement();
            ResultSet result = stm.executeQuery("select * from customer");
            while(result.next()){
                System.out.println(result.getString(1) + " - " + result.getString(2));
            }
            connection.close();
            result.close();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
