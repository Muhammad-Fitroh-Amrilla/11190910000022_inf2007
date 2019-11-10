package id.fitroh_amri.pertemuan.kedelapan;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class AplikasiMatriks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Matriks matriks = new Matriks();
        int nbar, nkol;
        int i, j;
        System.out.println("Masukan jumlah baris");
        nbar = in.nextInt();
        System.out.println("Masukan jumlah kolom");
        nkol = in.nextInt();
        int[][] Array1 = new int[nbar][nkol];
        int[][] Array2 = new int[nbar][nkol];

        for (i = 0; i < nbar; i++) {
            System.out.println("Masukan nilai larik 1 baris ke " + (i + 1));
            for (j = 0; j < nkol; j++) {
                Array1[i][j] = in.nextInt();
            }
        }

        for (i = 0; i < nbar; i++) {
            System.out.println("Masukan nilai larik 2 baris ke " + (i + 1));
            for (j = 0; j < nkol; j++) {
                Array2[i][j] = in.nextInt();
            }
        }
        
        System.out.println("Matriks ke 1");
        for (i = 0; i < nbar; i++) {
            System.out.print("[");
            for (j = 0; j < nkol; j++) {
                System.out.print(" " + Array1[i][j] + " ");
            }
            System.out.println("]");
        }

        System.out.println("Matriks ke 2");
        for (i = 0; i < nbar; i++) {
            System.out.print("[");
            for (j = 0; j < nkol; j++) {
                System.out.print(" " + Array2[i][j] + " ");
            }
            System.out.println("]");
        }

        System.out.println("Matriks hasil penjumlahan");
        matriks.getPenambahanMatriks(Array1, Array2, nbar, nkol);

    }
}
