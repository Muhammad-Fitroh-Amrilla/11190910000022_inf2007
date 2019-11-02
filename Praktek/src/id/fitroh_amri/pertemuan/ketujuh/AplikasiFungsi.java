package id.fitroh_amri.pertemuan.ketujuh;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class AplikasiFungsi {

    public static void main(String[] args) {
        float x;
        Fungsi fungsi = new Fungsi();

        System.out.println("--------------------");
        System.out.println("    x       f(x)    ");
        System.out.println("--------------------");

        x = 10;
        while (x <= 15) {
            System.out.println(x + "     " + fungsi.f(x));
            x = x + (float) 0.2;
        }

        System.out.println("--------------------");
    }

}
