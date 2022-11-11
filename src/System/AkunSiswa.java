/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import Database.Koneksi;
import View.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Rizha Alfianita
 */
public class AkunSiswa extends Akun{
    AppRegisterSiswa ags = new AppRegisterSiswa();
    @Override
    public void add(){
        try {
            String sql = "insert into akun(tipe_akun, nama_depan, nama_belakang, username, telepon, email, password) value(?,?,?,?,?,?,?)";
            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1, getTipeAkun());
            pst.setString(2, getNamaDepan());
            pst.setString(3, getNamaBelakang());
            pst.setString(4, getUsername());
            pst.setString(5, getTelepon());
            pst.setString(6, getEmail());
            pst.setString(7, getPassword());
            pst.executeUpdate();
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, "Oopss...something went wrong. User registration failed. " + e.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);            
        }
    }
    
    @Override
    public void select() {
        try{
            String sql = "SELECT * FROM akun WHERE tipe_akun = 'Student'";
            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                String[] data = new String[6];
                data[0] = res.getString("nama_depan");
                data[1] = res.getString("nama_belakang");
                data[2] = res.getString("username");
                data[3] = res.getString("telepon");
                data[4] = res.getString("email");
                data[5] = res.getString("password");
                
                setNamaDepan(data[0]);
                setNamaBelakang(data[1]);
                setUsername(data[2]);
                setTelepon(data[3]);
                setEmail(data[4]);
                setPassword(data[5]);
            }
        } 
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data not found \n" + e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update() {
        
    }
}
