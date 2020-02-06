/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;
public class waralaba {
    public static String harga;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        String JenisPaket1, JenisPaket2;
        int daftar, susunan, total, i, j, k, jumlah[][];
        int harga1, harga2;
        
        System.out.print("Masukkan Jumlah susunan: ");
        susunan = sc.nextInt();
        jumlah = new int[susunan][1];
        System.out.println();
        
        System.out.println("Paket Chiken");
        System.out.println("Chiken A = 12000");
        System.out.println("Chiken B = 15000");
        System.out.println("Chiken C = 20000");
        System.out.println("Paket Oke");
        System.out.println("Oke A = 10000");
        System.out.println("Oke B = 12000");
        System.out.println("Oke C = 15000");
        System.out.println();
        
        int[][] nilai = new int[susunan][1];
        String[][] kategori = new String[susunan][1];
                
                System.out.println("Masukkan Nama Paket 1: ");
                JenisPaket1 = sc2.nextLine();
                System.out.println("Masukkan harga Paket 1: ");
                harga1 = sc.nextInt();
                System.out.println("Masukkan Nama Paket 2: ");
                JenisPaket2 = sc2.nextLine();
                System.out.println("Masukkan harga Paket 2: ");
                harga2 = sc.nextInt();
                
                total = harga1 + harga2; 
                
                System.out.println("total harga: " + total);
    }
}
    
