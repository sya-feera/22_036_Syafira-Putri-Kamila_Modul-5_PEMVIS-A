/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prakt5;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
public class koneksi {
    private static Connection mysqlkonek;
    public static Connection koneksiDB()throws SQLException{
        try{
        String db="jdbc:mysql://localhost:3307/datapenjualan";
        String user ="root";
        String pw ="";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        mysqlkonek = (Connection) DriverManager.getConnection(db,user,pw);
//        JOptionPane.showMessageDialog(null,"Koneksi Berhasil");s
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Koneksi Gagal"+e.getMessage());
        
    }
        return mysqlkonek;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try{
            java.sql.Connection conn = koneksiDB();
            if(conn != null){
                System.out.print("Koneksi Berhasil");
            }else{
                System.out.println("Koneksi Gagal");
            }
        }catch (Exception e){
            System.out.println("Terjadi Kesalahan :"+e.getMessage());
        }
    }
    
}
