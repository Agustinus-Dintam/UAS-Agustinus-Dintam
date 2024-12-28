/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author ASUS
 */
public class Bank {
    private double saldo;

    // Konstruktor
    public Bank(double saldo) {
        this.saldo = saldo;
    }

    // Method untuk menyimpan uang
    public void simpanUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
        System.out.println("Saldo saat ini: Rp. " + getSaldo());
    }

    // Method untuk mengambil uang
    public void ambilUang(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
            System.out.println("Saldo saat ini: Rp. " + getSaldo());
        } else {
            System.out.println("Saldo tidak cukup untuk mengambil Rp. " + jumlah);
        }
    }

    // Method untuk mendapatkan saldo
    public double getSaldo() {
        return saldo;
    }
}