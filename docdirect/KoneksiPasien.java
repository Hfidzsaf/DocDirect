/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docdirect;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author Hafidz
 */
public class KoneksiPasien {
    public static Connection koneksiDB() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/datapasiendb";
            String user = "root"; 
            String password = ""; 
            conn = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
        }
        return conn;
    }
}
