package id.fitroh_amri.pertemuan.kesebelas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BacaArsipBilangan {

    public static void main(String[] args)  {
        int x;
        try {
        File file = new File("D:\\Gitlab\\bil.txt");
         BufferedReader print = new BufferedReader(new FileReader(file));
            Scanner line = new Scanner(print);
            while (line.hasNextInt()) {
                x = line.nextInt();
                System.out.println(x);
            }
            print.close();
        } catch (IOException e) {
            System.out.println("Error I/O : " + e);
        }
    }
}
