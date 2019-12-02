package id.fitroh_amri.pertemuan.kesepuluh;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author FITROH_08
 */
public class LarikMultidimensi {
    
    int [][]getLarikMultidimensi(int[][]L, int nbar, int nkol){
        
        int i, j, temp, tambah = 0;
        int ntotal = nbar*nkol;              //ntotal = panjang larik penampung
        int [] Array = new int [ntotal];     //membuat larik penampung semua nilai
        
        //memasukan nilai larik kedalam larik penampung
        for (i = 0;i  < nbar; i++) {
            for (j = 0; j < nkol; j++) {
                Array[tambah]= L[i][j];
                tambah++;
            }
        }
        System.out.println("nilai-nilai larik penampung");
        System.out.println(Arrays.toString(Array));
        
        //bubble sort
        for (i = 0; i <= ntotal -1; i++) {
            for (j = ntotal - 1; j > i; j--) {
                if (Array[j] < Array[j - 1]) {
                    temp = Array[j];
                    Array[j] = Array[j - 1];
                    Array[j - 1] = temp;
                }
            }
        }
        
        System.out.println("nilai larik penampung yang terurut");
        System.out.println(Arrays.toString(Array));
        
        //mengembalikan nilai larik dari larik penampung
        tambah = 0;
        for (i = 0;i  < nbar; i++) {
            for (j = 0; j < nkol; j++) {
                L[i][j]= Array[tambah];
                tambah++;
            }
        }
        return L;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LarikMultidimensi sort = new LarikMultidimensi();
        int nbar,nkol;
        int i,j;
        System.out.println("Masukan jumlah baris");
        nbar = in.nextInt();
        System.out.println("Masukan jumlah kolom");
        nkol= in.nextInt();
        int [][]L=new int [nbar][nkol];
        for (i = 0; i < nbar; i++) {
            System.out.println("Masukan nilai larik baris ke "+ (i+1));
            for (j = 0; j < nkol;j++) {
                L[i][j]= in.nextInt();
            }
        }
        System.out.println("Larik yang belum diurutkan");
        System.out.println(Arrays.deepToString(L));
        sort.getLarikMultidimensi(L, nbar, nkol);
        System.out.println("Larik yang sudah diurutkan");
        System.out.println(Arrays.deepToString(L));
        
    }
}
