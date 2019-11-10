package id.fitroh_amri.pertemuan.kedelapan;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class PerkalianMatriks3x5 {

    private static int Cetak(int[][] Array) {

        for (int i = 0; i < 3; i++) {
            System.out.print("[");
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + Array[i][j] + " ");
            }
            System.out.println("]");
        }
        return 0;
    }

    private static int kali(int[][] Array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                Array[i][j] = Array[i][j] * 3;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] Array = new int[3][5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukan nilai larik baris ke " + (i + 1));
            for (int j = 0; j < 5; j++) {
                Array[i][j] = in.nextInt();
            }
        }
        System.out.println("Matriks 3x5");
        Cetak(Array);
        kali(Array);
        System.out.println("Matriks 3x5 setelah dikali 3");
        Cetak(Array);
    }
}
