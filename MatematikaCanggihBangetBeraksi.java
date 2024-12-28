/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinomatematika;

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget mathCanggihBanget = new MatematikaCanggihBanget();
        
        // Memanggil method pertambahan
        int hasilPertambahan = mathCanggihBanget.pertambahan(20, 30);
        System.out.println("Pertambahan: 20 + 30 = " + hasilPertambahan);
        
        // Memanggil method perkalian
        int hasilPerkalian = mathCanggihBanget.perkalian(10, 20);
        System.out.println("Perkalian: 10 * 20 = " + hasilPerkalian);
        
        // Memanggil method modulus
        int hasilModulus = mathCanggihBanget.modulus(21, 4);
        System.out.println("Modulus: 21 % 4 = " + hasilModulus);
        
        // Memanggil method pertambahanTiga
        int hasilPertambahanTiga = mathCanggihBanget.pertambahanTiga(5, 10, 15);
        System.out.println("Pertambahan Tiga: 5 + 10 + 15 = " + hasilPertambahanTiga);
    }
}  

