/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs5;
public class daftarTiket {
    tiket listTkt[] = new tiket[5];
        int idx;
        void tambah(tiket m){
            if(idx<listTkt.length){
                listTkt[idx] = m;
                idx++;
            }else{
                System.out.println("Data sudah penuh!!");
            }
        }
        void tampil(){
            for(tiket m : listTkt){
                m.tampil();
                System.out.println("------------------");
            }
        }
        void bubbleSort(){
            for(int f=0; f<listTkt.length-1;f++){
                for(int j=1;j<listTkt.length-f;j++){
                    if(listTkt[j].harga>listTkt[j-1].harga){
                        tiket tmp = listTkt[j];
                        listTkt[j] = listTkt[j-1];
                        listTkt[j-1] = tmp;
                    }
                }
            }
        }
    
    void selectionSort(){
        for(int f=0;f<listTkt.length-1;f++){
            int idxMin = f;
            for(int j=f+1;j<listTkt.length; j++){
                if(listTkt[j].harga <listTkt[idxMin].harga){
                    idxMin = j;
                }
            }
            tiket tmp = listTkt[idxMin];
            listTkt[idxMin] = listTkt[f];
            listTkt[f] = tmp;
        }
    }
}
