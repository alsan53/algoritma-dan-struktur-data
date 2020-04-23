/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;

import java.util.LinkedList;

class Node {
   String nama;
   Node next;
}
public class percobaan3 {
    public static void main(String[] args) {
        
        LinkedList<String> linkedlist = new LinkedList<String>();
        
        Node current = null;
        Node satu = new Node(); 
        Node dua = new Node();
        Node tiga = new Node();
        Node empat = new Node(); 
        Node lima = new Node();
        Node enam = new Node();
        Node tuju = new Node(); 
        Node delapan = new Node();
        Node sembilan = new Node();
        Node sepuluh = new Node(); 
        Node sebelas = new Node();
        Node duabelas = new Node();
/*
 * Isi node dengan data kemudian tautkan ke node berikutnya
 *
 */
        linkedlist.add("2018      2019      2020   ");
        System.out.println("bulan ke - " + linkedlist);
        
        satu.nama = "1           475544    2412307   3743756";
        satu.next = dua;
        dua.nama = "2           1985572   878734    3398320";
        dua.next = tiga;
        tiga.nama = "3           2076432   2346836   923498";
        tiga.next = empat;
        empat.nama = "4           2165239   2546836   923498";
        empat.next = lima;
        lima.nama = "5           2283546   2436456   2845672";
        lima.next = enam;
        enam.nama = "6           2344460   1943656   3456566";
        enam.next = tuju;
        tuju.nama = "7           2635040   2453425   2341653";
        tuju.next = delapan;
        delapan.nama = "8           2958672   2754240   2734562";
        delapan.next = sembilan;
        sembilan.nama = "9           3047626   3256404   2534400";
        sembilan.next = sepuluh;
        sepuluh.nama = "10          2843543   3454645   2346307";
        sepuluh.next = sebelas;
        sebelas.nama = "11          2734526   3698200   943734";
        sebelas.next = duabelas;
        duabelas.nama = "12          2523400   4138479   2234544";
        duabelas.next = null;
        current = satu; //Set pointer to node first
        while(current != null) {
	    System.out.println(current.nama);
            current = current.next;
	};
    }

}
