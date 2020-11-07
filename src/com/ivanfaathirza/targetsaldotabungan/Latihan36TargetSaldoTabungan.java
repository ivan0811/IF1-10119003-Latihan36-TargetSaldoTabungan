package com.ivanfaathirza.targetsaldotabungan;

import java.util.Scanner;

/**
 *
 * @author Ivan
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung target saldo tabungan
 * dan berbasis objek dengan instansiasi objek saldo
 */

public class Latihan36TargetSaldoTabungan {
    static Scanner scan = new Scanner(System.in);
    private static Double saldoAwal, bungaAwal, targetSaldo;


    private static void masukkanSaldo(){
        System.out.print("Saldo Awal : Rp. ");
        saldoAwal =  Double.parseDouble(scan.next().replaceAll("[$,.]", ""));
        System.out.print("Bunga/Bulan(%) : ");
        bungaAwal = scan.nextDouble();
        System.out.print("Saldo Target : Rp. ");
        targetSaldo = Double.parseDouble(scan.next().replaceAll("[$,.]", ""));
    }

    public static void main(String[] args) {
        Saldo saldo = new Saldo();
        masukkanSaldo();
        saldo.hitungSaldo(bungaAwal, saldoAwal, targetSaldo);
        System.out.println("Developed by : Ivan Faathirza");
    }
}
