/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs5dua;
public class daftarPrimerLeague {
   primerleague listjwl[] = new primerleague[5];
        int idx;
        void tambah(primerleague m){
            if(idx<listjwl.length){
                listjwl[idx] = m;
                idx++;
            }else{
                System.out.println("Data sudah penuh!!");
            }
        }
        void tampil(){
            for(primerleague m : listjwl){
                m.tampil();
                System.out.println("------------------");
                
                
            }
        } 
        void insertionSort(){
        int i2, j;
        for(i2=1;i2<listjwl.length;i2++){
            primerleague tmp = listjwl[i2];
            j=i2;
            while((j>0)&&(listjwl[j-1].poin>tmp.poin)){
                listjwl[j]=listjwl[j-1];
                j--;
            }
            listjwl[j]= tmp;
        }
    }                                                                                                                                                                  
}