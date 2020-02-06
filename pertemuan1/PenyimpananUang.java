/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;
public class PenyimpananUang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int bulan = 0;
        double uang = 1000000, bunga = 0.02; 
    
        System.out.printf("uang anda sebesar = Rp%,.2f\n", uang);
    
        for (bulan = 0; uang < 1500000; bulan++){
            uang += uang * bunga;
        }
        System.out.printf("Dalam Waktu \t: %d bulan \n Uang Anda \t: Rp%,.2f", bulan,uang);
    }
}    