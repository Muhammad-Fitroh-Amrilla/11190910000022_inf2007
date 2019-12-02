package id.fitroh_amri.pertemuan.kesepuluh;

import java.util.Arrays;
/**
 *
 * @author FITROH_08
 */
public class ShellSort {
    
    int []getShellSort(int[]L,int n){
        int i, j, y, step, start;
        boolean ketemu;
        step = n-1;
        while (step > 1){
            step = (step/3)+1;
            for (start = 0;start  < step; start++) {
                i = start+step;
                while(i<= n-1){
                    y = L[i];
                    j = i-step;
                    ketemu = false;
                    System.out.println("i : " + i + " k : " + j + " --> " + L[j]);
                    while  ((j>=0)&&(!ketemu)){
                        if (y < L[j]){
                            L[j+step]=L[j];
                            j= j-step;
                        }else{
                            ketemu = false;
                        }
                    }
                    L[j+step]=y;
                    i=i+step;
                }
            }
        }
        return L;
    }
    public static void main(String[] args) {
        ShellSort sort = new ShellSort();
        int []L={81,94,11,96, 12, 35,17,95,28,58,41,75,15};
        int n;
        n= L.length;
        System.out.println("Larik yang belum diurutkan");
        System.out.println(Arrays.toString(L));
        sort.getShellSort(L, n);
        System.out.println("Larik yang belum diurutkan");
        System.out.println(Arrays.toString(L));
    }
    
}
