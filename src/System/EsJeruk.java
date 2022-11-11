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
public class EsJeruk extends MenuMinuman{
    public int hitung_minuman(){
        int total_minuman = this.getHargaMenu() * this.getJumlahMinuman();
        return total_minuman;
    }
}
