package id.fitroh_amri.pertemuan.kesepuluh;

import java.util.Arrays;

/**
 *
 * @author FITROH_08
 */
public class InsertionSort {
    
    int []getInsertionSort(int []L, int n){
        int i, j ,y;
        boolean ketemu;
        for (i = 1; i < n; i++) {
            y = L[i];
            j= i-1;
            ketemu = false;
            System.out.println("i : " + i + " k : " + j + " --> " + L[j]);
            while ((j>=0)&& (!ketemu)){
                if (y< L[j]){
                    L[j+1]=L[j];
                    j=j-1;
                }else{
                    ketemu = true;
                }
            }
            L[j+1]= y;
        }
        return L;
    }
    
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int[] L = {29, 27, 10, 8, 76, 21};
        int n;
        n = L.length;
        System.out.println("Larik yang belum diurutkan");
        System.out.println(Arrays.toString(L));
        sort.getInsertionSort(L, n);
        System.out.println("Larik yang belum diurutkan");
        System.out.println(Arrays.toString(L));
    }
}
