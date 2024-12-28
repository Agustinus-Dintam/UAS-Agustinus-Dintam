/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huumatematika;

/**
 *
 * @author ASUS
 */
class MatematikaBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih math = new MatematikaCanggih();

        // Uji operasi dengan pecahan
        System.out.println("Pertambahan (pecahan): " + math.pertambahan(12.5, 28.7, 14.2)); 
        System.out.println("Pertambahan (integer): " + math.pertambahan(12, 28, 14)); 
        System.out.println("Pertambahan (double): " + math.pertambahan(23.0, 34.0)); 
        System.out.println("Pertambahan (double): " + math.pertambahan(3.4, 4.9)); 

        // Uji operasi pecahan
        double hasilPecahan = math.operasiPecahan(12.5, 28.7, 14.2);
        System.out.println("Hasil Operasi Pecahan: " + hasilPecahan);
    }
}
