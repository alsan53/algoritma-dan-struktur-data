/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsearching;

public class searching1 {
    public int [] data;
    public int jumData; 
    
public searching1(int[] Data, int jmlData){
    this.jumData = jmlData;
    data = new int[jmlData];
    for (int i=0; i<jumData; i++){
        data[i] = Data[i];
        }
    }
public int FindSeqSearch(int cari){
    int posisi = -1;
    for(int j=0; j<jumData; j++){
        if(data[j] == cari){
            posisi = j;
            break;
        }
    }
    return posisi;
    }
public void TampilData(){
    for (int i=0; i<jumData; i++){
        System.out.print(data[i] +" ");
        System.out.print("");
    }
    System.out.println();
    }
}
