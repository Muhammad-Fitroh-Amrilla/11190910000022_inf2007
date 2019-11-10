package id.fitroh_amri.pertemuan.kedelapan;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class ArrayMaksimum {
    private static int getMaks(int[] A, int n) {
        int i, maks;
        maks = -9999;
        for (i = 1; i <= n; i++) {
            if (A[i] > maks) {
                maks = A[i];
            }
        }
        return maks;
    }

    public static void main(String[] args) {
        int [] A = new int [100];
        int i, n;
        Scanner in = new Scanner(System.in);
        System.out.println("ukuran efektif larik");
        n = in.nextInt();
        System.out.println("input nilai-nilai larik");
        for (i = 1; i <= n;i++){
            A[i]= in.nextInt();
        }
        System.out.println("Elemen Terbesar = " + getMaks(A, n));
    }
}
