/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divideAndConquer;
public class Quis1AlfinNurHasan {
    public static void main(String[] args) {
        int n = 4; //jumlah gelang
        towerOfHanoi(n,'A','C','B');//A,B and C adalah nama tower
    }
        public static void towerOfHanoi(int a, char c, char c0, char c1){
            
            if (a > 1){
                towerOfHanoi(a-1, c, c1, c0);
                System.out.println("pindah 1 gelang dari tower " + c + " ke tower " + c1);
  
            }
            if (a > 1){
                towerOfHanoi(a-1, c1, c0, c);
                System.out.println("pindah gelang " + a + " dari tower " + c + " ke tower " + c0);
                return;
            }
        }
}        