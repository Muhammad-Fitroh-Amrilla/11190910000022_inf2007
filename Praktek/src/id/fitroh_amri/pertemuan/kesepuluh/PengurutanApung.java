package id.fitroh_amri.pertemuan.kesepuluh;

import java.util.Arrays;
/**
 *
 * @author FITROH_08
 */
public class PengurutanApung {
     int [] getPengurutanApung(int[]L, int n){
    int i, k, temp;
        for (i = n-1; i >= 0; i--) {
            for (k = 0; k < n-1; k++) {
                System.out.println("i : " + i + " k : " + (k + 1) + " --> " + L[k + 1]);
                if (L[k] < L[k + 1]) {
                    temp = L[k];
                    L[k] = L[k + 1];
                    L[k + 1] = temp;
                }
            }

        }
        return L;
     }
     
     public static void main(String[] args) {
        PengurutanApung sort = new PengurutanApung();
        int[] L = {25, 27, 10, 8, 76, 21};
        int n;
        n = L.length;
        System.out.println("Larik yang belum diurutkan");
        System.out.println(Arrays.toString(L));
        sort.getPengurutanApung(L, n);
        System.out.println("Larik yang sudah diurutkan");
        System.out.println(Arrays.toString(L));
        
    }
}
