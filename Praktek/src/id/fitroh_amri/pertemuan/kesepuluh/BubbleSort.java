package id.fitroh_amri.pertemuan.kesepuluh;

import java.util.Arrays;

/**
 *
 * @author FITROH_08
 */
public class BubbleSort {

    int[] getBubbleSort(int[] L, int n) {
        int i, k, temp;
        for (i = 0; i <= n - 1; i++) {
            for (k = n - 1; k > i; k--) {
                System.out.println("i : " + i + " k : " + (k - 1) + " --> " + L[k - 1]);
                if (L[k] < L[k - 1]) {
                    temp = L[k];
                    L[k] = L[k - 1];
                    L[k - 1] = temp;
                }
            }

        }
        return L;
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] L = {25, 27, 10, 8, 76, 21};
        int n;
        n = L.length;
        System.out.println("Larik yang belum diurutkan");
        System.out.println(Arrays.toString(L));
        sort.getBubbleSort(L, n);
        System.out.println("Larik yang sudah diurutkan");
        System.out.println(Arrays.toString(L));
        
    }
}
