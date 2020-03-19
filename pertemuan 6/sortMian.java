/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsearching;
public class sortMian {
    public static void main(String[] args) {
        
        int data[]= {10, 40, 30, 50, 70, 20, 100, 90};
        
        System.out.println(" Sorting Dengan Merge Sort ");
        MergeSorting msort= new MergeSorting();
        System.out.println(" Data Awal ");
        msort.printArray(data);
        msort.mergeSort(data);
        System.out.println(" Setelah Diurutkan ");
        msort.printArray(data);
    }
}
