/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobilnewpackage;

/**
 *
 * @author ASUS
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilTino = new Mobil();
        
        mobilTino.Warna = "Biru";
        mobilTino.tahunProduksi =2005;
        
        System.out.println("Warna: " + mobilTino.Warna);
        System.out.println("tahunProduksi: " + mobilTino);
    }
    
}
