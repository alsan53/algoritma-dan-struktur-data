/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasJobsheet3;

import java.util.Scanner;

/**
 *
 * @author fajar
 */
public class MainTugas2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner huruf= new Scanner(System.in);
         System.out.println("======= PROGRAM PERHITUNGAN NILAI AKHIR ========");
         System.out.print("Jumlah mahasiswa: ");
         int jmlh= sc.nextInt();
         Tugas2[] a=new Tugas2[jmlh];
         for(int i=0; i<jmlh;i++){   
             System.out.println("Nilai mahasiswa ke " + (i+1));
            a[i]= new Tugas2();
             System.out.print("Masukkan nama mahasiswa : ");
             a[i].namaMhs= huruf.nextLine();
            System.out.print("Masukkan nilai tugas : ");
            a[i].nilaiTugas= sc.nextInt();
            System.out.print("Masukkan nilai kuis : ");
            a[i].nilaiKuis= sc.nextInt();
            System.out.print("Masukkan nilai UTS : ");
            a[i].nilaiUTS= sc.nextInt();
            System.out.print("Masukkan nilai UAS : ");
            a[i].nilaiUAS= sc.nextInt();
             System.out.println();
         }
         
        for(int i=0; i<jmlh;i++){
             System.out.println("total Nilai " +a[i].namaMhs+" adalah " 
                     +a[i].hitungTotalNilai());
        }
    }
}
