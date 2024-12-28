/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matek;

/**
 *
 * @author ASUS
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika math = new Matematika();
        
        // Menampilkan hasil pertambahan
        int hasilPertambahan = math.pertambahan(20, 20);
        System.out.println("Pertambahan: 20 + 20 = " + hasilPertambahan);
        
        // Menampilkan hasil pengurangan
        int hasilPengurangan = math.pengurangan(10, 5);
        System.out.println("Pengurangan: 10 - 5 = " + hasilPengurangan);
        
        // Menampilkan hasil perkalian
        int hasilPerkalian = math.perkalian(10, 20);
        System.out.println("Perkalian: 10 * 20 = " + hasilPerkalian);
        
        // Menampilkan hasil pembagian
        int hasilPembagian = math.pembagian(21, 2);
        System.out.println("Pembagian: 21 / 2 = " + hasilPembagian);
    }
}