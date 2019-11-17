package id.fitroh_amri.pertemuan.kesembilan;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class SequentialSearch {

    public boolean getSeqSearchBoolean(int L[], int n, int x) {
        int i = 0;
        while ((i < n - 1) && (L[i] != x)) {
            if (i == 0) {
                System.out.println("posisi ke " + i + " isi " + L[i]);
            }
            i = i + 1;
            System.out.println("posisi ke " + i + " isi " + L[i]);
        }
        return L[i] == x;
    }

    public int getSearchOutIndeks(int L[], int n, int x) {
        int i = 0;
        while ((i < n - 1) && (L[i] != x)) {

            if (i == 0) {
                System.out.println("posisi ke " + i + " isi " + L[i]);
            }
            i = i + 1;
            System.out.println("posisi ke " + i + " isi " + L[i]);
        }

        if (L[i] == x) {
            return i;
        } else {
            return -1;
        }
    }

    public boolean getSearchInBoolean(int L[], int n, int x) {
        int i = 0;
        boolean ketemu = false;
        while ((i < n - 1) && (!ketemu)) {
            if (i == 0) {
                System.out.println("posisi ke " + i + " isi " + L[i]);
            }
            if (L[i] == x) {
                ketemu = true;
            } else {
                i = i + 1;
                System.out.println("posisi ke " + i + " isi " + L[i]);
            }
        }
        return ketemu;
    }

    public int getSearchInIndeks(int L[], int n, int x) {
        int i = 0;
        boolean ketemu = false;
        while ((i < n - 1) && (!ketemu)) {
            if (i == 0) {
                System.out.println("posisi ke " + i + " isi " + L[i]);
            }
            if (L[i] == x) {
                ketemu = true;
            } else {
                i = i + 1;
                System.out.println("posisi ke " + i + " isi " + L[i]);
            }
        }
        if (ketemu) {
            return i;

        } else {
            return -1;
        }
    }

    public int getSeqSearchSentinel(int L[], int n, int x) {
        int i = 0;
        int idx;
        L[n + 1] = x;
        while (L[i] != x) {
            i++;
        }
        if (i == n + 1) {
            return idx = -1;
        } else {
            return idx = i;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L[] = {13, 16, 14, 21, 76, 15};
        int n, x;
        SequentialSearch seq = new SequentialSearch();

        n = L.length;
        System.out.println("Masukan angka yang ingin dicari");
        x = in.nextInt();

       // pencarian beruntun menggunakan boolean dengan hasil indeks
//        System.out.println("indeks ke "+seq.getSearchInIndeks(L, n, x));
        
        //pencarian beruntun dengan hasil boolean
//        System.out.println(seq.getSeqSearchBoolean(L, n, x));
        
        //pencarian beruntun dengan hasil indeks
//        System.out.println("indeks ke "+seq.getSearchOutIndeks(L, n, x));
        
        //pencarian beruntun menggunakan boolean dengan hasil boolean
//        System.out.println(seq.getSearchInBoolean(L, n, x));
        
        //pencarian dengan sentinel
//        int L[] = new int[7];
//        int n, x;
//        L[0] = 13;
//        L[1] = 16;
//        L[2] = 14;
//        L[3] = 21;
//        L[4] = 76;
//        L[5] = 15;
//        n = L.length - 2;
//        System.out.println("indeks ke " + seq.getSeqSearchSentinel(L, n, x));
    }
}
