package id.fitroh_amri.pertemuan.kedelapan;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class CariNilaiX {

    static int Cari(int[] Array, int nilaix) {
        int i;
        for (i = 0; i < Array.length; i++) {
            if (Array[i] == nilaix) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int i, n,nilaix,hasil;
        Scanner in = new Scanner(System.in);
        System.out.println("ukuran efektif larik");
        n = in.nextInt();
        int[] Array = new int[n];

        System.out.println("input nilai-nilai larik");
        for (i = 0; i < n; i++) {
            Array[i] = in.nextInt();
        }
        System.out.println("Masukan nilai X ");
        nilaix = in.nextInt();
        
        hasil = Cari(Array, nilaix);
        if (hasil == 0) {
            System.out.println("Indeks 0");
        } else {
            System.out.println("X Urutan ke " + Cari(Array, nilaix)
                    + " dari larik" );
        }
    }
}
