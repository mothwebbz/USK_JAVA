/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.mycompany.usk;
import javax.swing.JOptionPane;

/**
 *
 * @author chari
 */
public class soal4 {
     public static void main(String[] args) {
            JOptionPane.showMessageDialog(null, "------SOAL 4------"); 
        
        double nilai1 = Double.parseDouble(
            JOptionPane.showInputDialog("Masukkan Nilai 1:")
        );

        double nilai2 = Double.parseDouble(
            JOptionPane.showInputDialog("Masukkan Nilai 2:")
        );

        double hasil = nilai1 * nilai2 ;

        String pesan =
            "Nilai 1 : " + nilai1 +
            "\nNilai 2 : " + nilai2 +
            "\nHasil : " + hasil;

        JOptionPane.showMessageDialog(null, pesan);
    }
    
}
