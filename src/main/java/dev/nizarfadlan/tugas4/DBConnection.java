/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.nizarfadlan.tugas4;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MyWindows10
 */
public class DBConnection {
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/praktikum";
    private final String USER = "root";
    private final String PASS = "nizar";

    public Connection conn;
    public void connection() throws ClassNotFoundException, SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }
    
    public Statement openConnection() throws SQLException{
        return conn.createStatement();
    }
}
