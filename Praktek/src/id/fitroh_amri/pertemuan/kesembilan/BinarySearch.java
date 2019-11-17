package id.fitroh_amri.pertemuan.kesembilan;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class BinarySearch {

    public int getBinarySearch(int L[], int n, int x) {
        int i = 0, j = n - 1, k = 0;

        boolean ketemu = false;
        while ((i <= j) && (!ketemu)) {
            k = (i + j) / 2;
            if (L[k] == x) {
                ketemu = true;
            } else {
                if (L[k] < x) {
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
        int L[] = {13, 14, 15, 18, 20, 21};
        int n, x;
        n = L.length;
        System.out.println("Masukan angka yang ingin dicari");
        x = in.nextInt();
        BinarySearch seq = new BinarySearch();
        System.out.println("indeks ke "+seq.getBinarySearch(L, n, x));
    }
}
