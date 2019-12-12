package id.fitroh_amri.pertemuan.kesebelas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class KataTerpanjang {

    String getCariKata(FileReader K) {
        String[] L = new String[100];
        String Kata = null;
        Scanner line = new Scanner(new BufferedReader(K));
        int n = 0;
        while (line.hasNext()) {
            L[n] = line.next();
            n++;
        }
        for (int i = 0; i < n - 1; i++) {
            if (L[i].length() < L[i + 1].length()) {
                Kata = L[i + 1]; 
            }
        }
        return Kata;
    }

    public static void main(String[] args) {
        KataTerpanjang baca = new KataTerpanjang();
        String a;
        try {
            a = baca.getCariKata(new FileReader("D:\\Gitlab\\K.txt"));
            System.out.println("Kata terpanjang = " + a);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArsipTeks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
