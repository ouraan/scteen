/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

/**
 *
 * @author Rizha Alfianita
 */
public abstract class Akun {
    private String tipe_akun;
    private String nama_depan;
    private String nama_belakang;
    private String username;
    private String telepon;
    private String email;
    private String password;
    public void setTipeAkun(String ta){
        tipe_akun = ta;
    }
    public String getTipeAkun(){
        return tipe_akun;
    }
    public void setNamaDepan(String nd){
        nama_depan = nd;
    }
    public String getNamaDepan(){
        return nama_depan;
    }
    public void setNamaBelakang(String nb){
        nama_belakang = nb;
    }
    public String getNamaBelakang(){
        return nama_belakang;
    }
    public void setUsername(String u){
        username = u;
    }
    public String getUsername(){
        return username;
    }
    public void setTelepon(String t){
        telepon = t;
    }
    public String getTelepon(){
        return telepon;
    }
    public void setEmail(String e){
        email = e;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword(String p){
        password = p;
    }
    public String getPassword(){
        return password;
    }
    public abstract void add();
    public abstract void select();
    public abstract void update();

}
