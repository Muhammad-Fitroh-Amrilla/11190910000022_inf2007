package id.fitroh_amri.pertemuan.kesepuluh;
import java.util.Arrays;
/**
 *
 * @author FITROH_08
 */
public class SelectionSort {
    int[] getSelectionMaks(int[] L, int n) {
        int i, j, temp, imaks;
        for (i = n - 1; i > 0; i--) {
     
            imaks = 1;
            
            for (j = 0; j <= i; j++) {
                System.out.println("i : " + i + " k : " + j + " --> " + L[j]);
                if (L[j] > L[imaks]) {
                    imaks = j;
                }
            }
            temp = L[i];
            L[i] = L[imaks];
            L[imaks] = temp;
        }
        return L;
    }
    int[] getSelectionMin(int[] L, int n) {
        int i, j, temp, imin;
        for (i = 0; i < n - 1; i++) {
            imin = i;
            for (j = i; j <= n - 1; j++) {
                System.out.println("i : " + i + " k : " + j + " --> " + L[j]);
                if (L[j] < L[imin]) {
                    imin = j;
                }
            }
            temp = L[i];
            L[i] = L[imin];
            L[imin] = temp;
        }
        return L;
    }
    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int[] L = {29, 27, 10, 8, 76, 21};
        int n;
        n = L.length;
        System.out.println("Larik yang belum diurutkan");
        System.out.println(Arrays.toString(L));
        
        sort.getSelectionMaks(L, n);
        System.out.println("Larik yang belum diurutkan berdasarkan nilai maks");
        System.out.println(Arrays.toString(L));
        
        sort.getSelectionMin(L, n);
        System.out.println("Larik yang sudah diurutkan berdasarkan nilai min");
        System.out.println(Arrays.toString(L));
    }
}
