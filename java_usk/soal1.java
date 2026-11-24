/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

// package com.mycompany.soal_usk;

import java.util.Scanner;

/**
 *
 * @author chari
 */
public class soal1 {
     public static void main(String[] args) {
         //creating new scanner
        Scanner scan = new Scanner(System.in);
         
        System.out.println("------SOAL 1------");
            System.out.print("NAMA ANDA: ");
            String name = scan.nextLine();

            System.out.print("NIM ANDA: ");
            String nim = scan.nextLine();

            System.out.println("NAMA: " + name);
            System.out.println("NIM: " + nim);
            
            // cuts a part of the name
            String potonganNama = name.substring(3, 7);
            System.out.println("4 CHARACTERS: " + potonganNama ); 
        
        scan.close();
        }
}

