/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs5dua;
import java.util.Scanner;
public class sorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        daftarPrimerLeague data = new daftarPrimerLeague();
        int jmlclassement = 5;

        for (int i2 = 0; i2 < jmlclassement; i2++) {
            System.out.println("Nama club pemain = ");
            String pemain = sc2.nextLine();
            System.out.println("Nomor urutan = ");
            int nomor = sc.nextInt();
            System.out.println("Jumlah poin akhir = ");
            int poin = sc.nextInt();
            
            primerleague m = new primerleague(pemain, nomor, poin);
            data.tambah(m);
        }
        System.out.println("Data primerleague sebelum sorting = ");
        data.tampil();
        
        System.out.println("Data Setelah Di Insertion Sort = ");
        data.insertionSort();
        data.tampil();
    }
}