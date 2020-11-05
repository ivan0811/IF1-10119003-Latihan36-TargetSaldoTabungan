package com.ivanfaathirza.targetsaldotabungan;

import java.util.Scanner;

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
        Saldo saldoTarget = new Saldo();
        masukkanSaldo();
        saldoTarget.hitungSaldo(bungaAwal, saldoAwal, targetSaldo);
        System.out.println("Developed by : Ivan Faathirza");
    }
}
