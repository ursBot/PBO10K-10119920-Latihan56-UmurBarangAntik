/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan56.umurbarangantik;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class UmurBarangAntik {

    public static void main(String[] args) {
        
        Radio r = new Radio(234);
        r.setName("Radio AM");
        
        System.out.println("Nama barang Antik : " + r.getName());
        r.tampilUmur();
    }
    
}
