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
public class soal3 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "------SOAL 3------"); 

        String strNilai1 = JOptionPane.showInputDialog("Nilai 1 :");
        String strNilai2 = JOptionPane.showInputDialog("Nilai 2 :");
        String strNilai3 = JOptionPane.showInputDialog("Nilai 3 :");

        // Konversi String ke Double
        double nilai1 = Double.parseDouble(strNilai1);
        double nilai2 = Double.parseDouble(strNilai2);
        double nilai3 = Double.parseDouble(strNilai3);

        // Menghitung rata-rata
        double rata = (nilai1 + nilai2 + nilai3) / 3;
        String hasil;

        // Logika kelulusan
        if (rata >= 60) {
            hasil = "LULUS";
        } else {
            hasil = "GAGAL";
        }

        // Menampilkan output di message dialog
        String pesan = "Nilai 1 : " + nilai1 + 
                       "\nNilai 2 : " + nilai2 + 
                       "\nNilai 3 : " + nilai3 + 
                       "\nRata    = " + rata + 
                       "\n\nHasil   = " + hasil;
                       
        JOptionPane.showMessageDialog(null, pesan);
    }
    
}
