/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan05;

/**
 *
 * @author acer
 */
public class main {
    public static void main(String[] args) {
        Helmet helmet = new Helmet();
        helmet.merk = "NJS Kairoz";
        helmet.warna = "Putih";
        helmet.ukuran = "L";
        
        Helmet helmet2 = new Helmet();
        helmet.merk = "KYT Kyoto";
        helmet.warna = "Hitam";
        helmet.ukuran = "XL";
        
        Helmet helmet3 = new Helmet();
        helmet.merk = "Shoei";
        helmet.warna = "Abu-abu";
        helmet.ukuran = "M";
        
        helmet.info();
        helmet2.info();
        helmet3.info();
        
    }
    
}
