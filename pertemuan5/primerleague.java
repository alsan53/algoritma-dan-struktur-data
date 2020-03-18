/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs5dua;
public class primerleague {
    String pemain;
    int urutan;
    int poin;
    
    primerleague(String s, int i,int i2){
        pemain = s;
        urutan = i;
        poin = i2;
    }
    
    void tampil(){
        System.out.println("Nama club = " + pemain);
        System.out.println("Nomor urutan = " + urutan);
        System.out.println("Poin akhir = " + poin);
    }
}