package id.fitroh_amri.pertemuan.kedelapan;

import java.util.Arrays;

/**
 *
 * @author FITROH_08
 */
public class Matriks {

    public static int [][] getPenambahanMatriks(int[][] A, int[][] B, int nbar, int nkol) {
        int i, j ;
        int[][] C = new int[nbar][nkol];
        for (i = 0; i < nbar; i++) {
            for (j = 0; j < nkol; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        
        
        for (i = 0; i < nbar; i++) {

            System.out.print("[");
            for (j = 0; j < nkol; j++) {
                System.out.print(" " + C[i][j] + " ");
            }
            System.out.println("]");
        }
        return C;
    }
}
