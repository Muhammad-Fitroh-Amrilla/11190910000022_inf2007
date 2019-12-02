/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.fitroh_amri.pertemuan.kesebelas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FITROH_08
 */
public class ArsipTeks {

    int getHitungKarakter(FileReader T) {
        int n;
        char[] c;

        n = 0;
        Scanner line = new Scanner(new BufferedReader(T));
        while (line.hasNext()) {
            c = line.next().toCharArray();
            for (char d : c) {
                if (d == 'a') {
                    n = n + 1;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        ArsipTeks baca = new ArsipTeks();
        int a;
        try {
            a = baca.getHitungKarakter(new FileReader("D:\\Gitlab\\T.txt"));
            System.out.println(a);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArsipTeks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
