/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acc;

/**
 *
 * @author ASUS
 */
public class ACBeraksi {
    public static void main(String[] args) {
        ACImpl ac = new ACImpl();

        // Menghidupkan AC
        ac.hidupkanAC();

        // Mendinginkan AC
        ac.dinginkanAC();

        // Memanaskan AC
        ac.panaskanAC();

        // Mematikan AC
        ac.matikanAC();

        // Mencoba mendinginkan AC saat mati
        ac.dinginkanAC();

        // Mencoba memanaskan AC saat mati
        ac.panaskanAC();
    }
}
