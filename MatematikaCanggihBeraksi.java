/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matemaikaaatino;

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mathCanggih = new MatematikaCanggih();
        
        // Memanggil method pertambahan
        int hasilPertambahan = mathCanggih.pertambahan(20, 30);
        System.out.println("Pertambahan: 20 + 30 = " + hasilPertambahan);
        
        // Memanggil method perkalian
        int hasilPerkalian = mathCanggih.perkalian(10, 20);
        System.out.println("Perkalian: 10 * 20 = " + hasilPerkalian);
        
        // Memanggil method modulus
        int hasilModulus = mathCanggih.modulus(21, 4);
        System.out.println("Modulus: 21 % 4 = " + hasilModulus);
    }
}