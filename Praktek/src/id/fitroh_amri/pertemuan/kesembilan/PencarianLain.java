package id.fitroh_amri.pertemuan.kesembilan;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class PencarianLain {
    public int getSeqSearch(int L[], int n, int x) {
        int i = 0;
        int idx = L[n-1];               //nilai array akhir ditampung ke idx
        L[n-1]= x ;                     //nilai array akhir diganti dengan nilai x
        while (L[i] != x) {
            i=i+1;
        }
        L[n-1]=idx ;                    //mengambalikan nilai array akhir dari idx
        if (x == L[n-1]||(i<n-1)) {
            return idx = i;
        } else {
            return idx = -1;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L[] = {13, 16, 14, 21, 76, 15};
        int n, x;
        n = L.length;
        System.out.println("Masukan angka yang ingin dicari");
        x = in.nextInt();
        PencarianLain seq = new PencarianLain();
        System.out.println("Indeks ke "+seq.getSeqSearch(L, n, x));
    }
}
