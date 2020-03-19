/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsearching;

public class searchingMain1 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        
    searching1 pencarian = new searching1 (data, 8);
    
    System.out.println (" ISI ARRAY ");
    pencarian.TampilData();
    
    int cari = 30;
        
        System.out.println("Sequential search");
        int posisi=pencarian.FindSeqSearch(cari);
        if(posisi!= -1){
            System.out.println("Data : " + cari + " ditemukan pada indeks " + posisi );
            
        }else{
            System.out.println("Data " + cari + "tidak ditemukan");
        }
    }
}
