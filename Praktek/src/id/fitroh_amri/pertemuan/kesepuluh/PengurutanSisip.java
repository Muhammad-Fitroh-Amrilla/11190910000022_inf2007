package id.fitroh_amri.pertemuan.kesepuluh;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class PengurutanSisip {

    int[] getPengurutanSisip(int[] L, int n) {
        Scanner in = new Scanner(System.in);
        int i, j, k, y;
        boolean ketemu;
        for (k = n - 1; k >= 0; k--) {
            L[k] = in.nextInt();
            for (i = 1; i < n; i++) {
                y = L[i];
                j = i - 1;
                ketemu = false;
                while ((j >= 0) && (!ketemu)) {
                    if (y < L[j]) {
                        L[j + 1] = L[j];
                        j = j - 1;
                    } else {
                        ketemu = true;
                    }
                }
                L[j + 1] = y;
            }
            System.out.println(Arrays.toString(L));
        }
        return L;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PengurutanSisip sort = new PengurutanSisip();
        int n;
        System.out.println("Masukan panjang larik");
        n = in.nextInt();
        int[] L = new int[n];
        sort.getPengurutanSisip(L, n);
    }
}
