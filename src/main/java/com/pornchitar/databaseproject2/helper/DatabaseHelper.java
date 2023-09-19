/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pornchitar.databaseproject2.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class DatabaseHelper {
    private static Connection conn = null;
    private static String URL = "jdbc:sqlite:dcoffe.db";
    static{
        getConnect();
    }
    public static synchronized Connection getConnect(){
        if(conn==null){
            try {
                conn = DriverManager.getConnection(URL);
                System.out.println("Connection to SQLite has been establish.");
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conn;
    }
    
    public static synchronized void close(){
        if(conn!=null){
            try{
                conn.close();
                conn = null;
            }catch (SQLException ex) {
                Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
