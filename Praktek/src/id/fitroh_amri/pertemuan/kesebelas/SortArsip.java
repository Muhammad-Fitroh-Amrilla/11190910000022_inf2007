package id.fitroh_amri.pertemuan.kesebelas;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SortArsip {
    public int[] Sort(String Arsip, int n) {
        int[] L = new int[n];
        int i = 0, k, temp;

        try {
            
            BufferedReader file = new BufferedReader(new FileReader(Arsip));
            Scanner line = new Scanner(file);
            i = 0;
            while (line.hasNextInt()) {
                L[i] = line.nextInt();
                i++;
            }
        } catch (IOException e) {
            System.err.println("Error : " + e.getMessage());
        }
             
            n = i;
        for (i = 0; i < n - 1; i++) {
            for (k = n - 1; k > i; k--) {
                if (L[k] < L[k - 1]) {
                    temp = L[k];
                    L[k] = L[k - 1];
                    L[k - 1] = temp;
                }
            }
        }
        return L;
    }

    public static void main(String[] args) {
        int a, i, n;
        String Arsip = "D:\\SortArsip.txt";
        Scanner in = new Scanner(System.in);
        SortArsip app = new SortArsip();
        System.out.print("masukkan Jumlah angka: ");
        n = in.nextInt();

        try {
            PrintWriter outFile = new PrintWriter(new FileOutputStream(Arsip));
            for (i = 1; i <= n; i++) {
                System.out.print("Masukkan Angka: ");
                a = in.nextInt();
                outFile.println(a);
            }
            outFile.close();
        } catch (IOException e) {
            System.err.println("Error : " + e.getMessage());
        }
        System.out.println(Arrays.toString(app.Sort(Arsip, n)));
    }
}
