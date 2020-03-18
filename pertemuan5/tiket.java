/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs5;
public class tiket {
    String maskapai;
    int transitCount;
    int flighttime;
    float harga;
    
    tiket(String s, int i,int i2,float f){
        maskapai = s;
        transitCount = i;
        flighttime = i2;
        harga = f;
    }
    
    void tampil(){
        System.out.println("nama maskapai = " + maskapai);
        System.out.println("jumlah transit = " + transitCount);
        System.out.println("waktu penerbangan = " + flighttime);
        System.out.println("harga tiket = " + harga);
    }
}
