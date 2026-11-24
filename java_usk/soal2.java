/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.mycompany.usk;
import java.util.Scanner;

/**
 *
 * @author chari
 */
public class soal2 {
     public static void main(String[] args) {
         //creating new scanner
        Scanner scan = new Scanner(System.in);
        
        System.out.println("------SOAL 2------");
        
        System.out.print("HARGA BARANG: ");
        double harga = scan.nextDouble();
        
        System.out.print("DISKON: " + "%");
        double diskon = scan.nextDouble();
        
        double rpdiskon = harga * diskon/100;
        double totalharga = harga - rpdiskon;
        
        System.out.println("DISKON(Rp.): Rp." + rpdiskon);
        
        double total = harga - rpdiskon;
        System.out.println("HARGA: Rp." + total); 
        System.out.println("TOTAL HARGA: " + totalharga);
        
    scan.close();
     }
}
