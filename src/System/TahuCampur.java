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
public class TahuCampur extends MenuMakanan{
     public int hitung_makanan(){
        int total_makanan = this.getHargaMenu() * this.getJumlahMakanan();
        return total_makanan;
    }
}
