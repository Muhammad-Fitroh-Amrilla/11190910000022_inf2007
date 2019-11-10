package id.fitroh_amri.pertemuan.kedelapan;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class ArrayMinimum {
    private static int getMin(int[] A, int n) {
        int i, min;
        min = 9999;
        for (i = 0; i < n; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        return min;
    }

    public static void main(String[] args) { 
        int i, n;
        Scanner in = new Scanner(System.in);
        System.out.println("Jumlah elemen larik");
        n = in.nextInt();
        int [] A = new int [n];
        
        System.out.println("Masukan nilai-nilai larik");
        for (i = 0; i < n;i++){
            A[i]= in.nextInt();
        }
        System.out.println("Elemen Terkecil = " + getMin(A, n));
    }
}
