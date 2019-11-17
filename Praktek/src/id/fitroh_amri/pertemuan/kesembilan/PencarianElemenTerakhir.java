package id.fitroh_amri.pertemuan.kesembilan;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class PencarianElemenTerakhir {

    public int getSearch(int L[], int n, int x) {
        int i = n - 1;
        boolean ketemu = false;
        while ((i > -1) && (i <= n - 1) && (!ketemu)) {
            if (i <= n - 1) {
                System.out.println("posisi ke " + i + " isi " + L[i]);
            }
            if (L[i] == x) {
                ketemu = true;
            } else {
                i = i - 1;
            }
        }
        if (ketemu) {
            return i;

        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L[] =  {13, 16, 14, 21, 76, 15};
        int n, x;
        n = L.length;
        System.out.println("Masukan angka yang ingin dicari");
        x = in.nextInt();
        PencarianElemenTerakhir seq = new PencarianElemenTerakhir();
        System.out.println(seq.getSearch(L, n, x));
    }
}
