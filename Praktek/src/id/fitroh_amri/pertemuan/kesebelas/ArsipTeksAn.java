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
public class ArsipTeksAn {

    boolean getCariKarakter(FileReader B) {
        boolean ketemu = false;
        char[] L;
        Scanner line = new Scanner(new BufferedReader(B));
        while (line.hasNext()) {
            L = line.next().toCharArray();
            for (int i = 0; i < L.length-1;i++){
                if (L[i]=='a'){
                    if (L[i+1]=='n'){
                        ketemu = true;
                    }
                }
            }
        }
        return ketemu;
    }

    public static void main(String[] args) {
        ArsipTeksAn baca = new ArsipTeksAn();
        boolean a;
        try {
            a = baca.getCariKarakter(new FileReader("D:\\Gitlab\\B.txt"));
            System.out.println("Ada kata an = " + a);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArsipTeks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
