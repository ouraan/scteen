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
public abstract class Menu {
    private String nama_menu;
    private int harga_menu;
    public void setNamaMenu(String nm){
        nama_menu = nm;
    }
    public String getNamaMenu(){
        return nama_menu;
    }
    public void setHargaMenu(int hm){
        harga_menu = hm;
    }
    public int getHargaMenu(){
        return harga_menu;
    }
}
