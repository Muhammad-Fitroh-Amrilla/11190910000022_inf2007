/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.fitroh_amri.pertemuan.kesebelas;

import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class TulisArsipBilanganBulat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        

        int n, i;
        try {
            File file = new File("D:\\Gitlab\\bil.txt");
            PrintWriter print = new PrintWriter(file);
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
