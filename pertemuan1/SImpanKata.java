/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;
public class SImpanKata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String kalimat = null ;
        int panjangKalimat, jumlahHuruf = 1;
        
        System.out.println("Masukan Kalimat : ");
        kalimat = sc.nextLine(); 
        
        char[] arrHuruf = kalimat.toCharArray(); 
        panjangKalimat = arrHuruf.length;
        
        for(int i = 0; i < panjangKalimat; i++){
            for(int j = 0; j < panjangKalimat; j++){ 
                if(arrHuruf[i]!=' '){ 
                    if(i!=j&&(arrHuruf[i]==arrHuruf[j])){ 
                        jumlahHuruf++; 
                        arrHuruf[j]=' '; 
                    }
                    if(j==panjangKalimat-1){ 
                        System.out.println("Jumlah huruf '"+arrHuruf[i]+"' = "+jumlahHuruf); 
                        jumlahHuruf=1; 
                    }
         
                }  
            }
        }
    }
}
    