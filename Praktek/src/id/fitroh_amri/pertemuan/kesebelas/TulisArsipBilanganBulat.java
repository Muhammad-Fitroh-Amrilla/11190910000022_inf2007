package id.fitroh_amri.pertemuan.kesebelas;

import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class TulisArsipBilanganBulat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n, i;
        try {
            File file = new File("D:\\Gitlab\\bil.txt");
            PrintWriter print = new PrintWriter(file);
            System.out.println("Masukan nilai : ");
            n = in.nextInt();
            for (i = 1; i <= n; i++) {
                print.println(i);
            }
            print.close();
        }catch(IOException e){
            System.out.println("Error I/O : " + e);
    }
    }
}
