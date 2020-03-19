
package testsearching;

import java.util.Scanner;
public class SearchingMain2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] data = new int [8];
        for (int i=0; i<8; i++) {          
            System.out.print("Nilai Array Indeks ke-" +i+ " = ");
            
        data [i] = sc.nextInt(); 
        }
     
    System.out.println();   
    Searching2 pencarian = new Searching2 (data, 8);
    System.out.println (" ISI ARRAY ");
    pencarian.TampilData();
    
    int cari = 30;
    
        System.out.println(" Menggunakan Sequential Search ");
        int posisi = pencarian.FindSeqSearch(cari);
        pencarian.TampilPosisi(cari, posisi); 
        
        System.out.println(" ================================ ");
        System.out.println(" Menggunakan Binary Search ");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length-1); 
        pencarian.TampilPosisi(cari, posisi);
    }
}

