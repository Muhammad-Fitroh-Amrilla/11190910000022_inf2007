package id.fitroh_amri.pertemuan.kesembilan;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class PencarianString {
    int  SequentialSearch (String Array[],int n,String x){
        int i = 0;
        while ((i < n - 1) && (!x.equals(Array[i]))) {
            i = i + 1;
        }
        if (x.equals(Array[i])) {
            return i;
        } else {
            return -1;
        }
        
    }
    
    int BinarySearch(String[] Array,int n, String x) { 
        int i = 0, j = n - 1, k=0;
        
        boolean ketemu = false;
        while ((i <= j) && (!ketemu)) {
            k = (i + j) / 2;
            if (x.equals(Array[k])) {
                ketemu = true;
            } else {
                if (x.compareTo(Array[k]) > 0) {
                    i = k + 1;
                } else {
                    j = k - 1;
                }
            }           
        }
        if (ketemu) {
            return k;
        } else {
            return -1;
        }
    } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A [] ={"arya","fitroh"};
        int n;
        n = A.length;
        String x;
        System.out.println("Masukan nama");
        x = in.next();
        PencarianString cari = new PencarianString();
        System.out.println("Hasil Pencarian beruntun");
        System.out.println("indeks ke "+cari.SequentialSearch(A,n, x));
        System.out.println("Hasil Pencarian bagi dua");
        System.out.println("indeks ke "+cari.BinarySearch(A, n,x));
    }
}
