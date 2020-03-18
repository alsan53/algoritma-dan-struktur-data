/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs5;

import java.util.Scanner;

public class pemanggilanTiket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        daftarTiket data = new daftarTiket();
        int jmlTerbang = 5;

        for (int f = 0; f < jmlTerbang; f++) {
            System.out.println("Nama Maskapai = ");
            String maskapai = sc2.nextLine();
            System.out.println("jumlah transit = ");
            int transit = sc.nextInt();
            System.out.println("waktu berangkat = ");
            int time = sc.nextInt();
            System.out.println("harga tiket= ");
            float harga = sc.nextFloat();
            
            tiket m = new tiket(maskapai, transit, time, harga);
            data.tambah(m);
        }
        System.out.println("Data penerbangan sebelum sorting = ");
        data.tampil();
        
        System.out.println("Data penerbangan setelah sorting desc berdasar harga = ");
        data.bubbleSort();
        data.tampil();
        
        System.out.println("Data penerbangan setelah sorting asc berdasar harga = ");
        data.selectionSort();
        data.tampil();
    } 
}