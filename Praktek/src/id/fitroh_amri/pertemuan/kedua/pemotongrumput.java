package id.fitroh_amri.pertemuan.kedua;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class pemotongrumput {
    public static void main(String args[]) {
        double a, b, c, d, e, f;
        Scanner in = new Scanner(System.in);
        a = in.nextInt(); //Panjang tanah
        b = in.nextInt(); //Lebar tanah
        c = in.nextInt(); //Panjang rumah
        d = in.nextInt(); //Lebar rumah
        e = 2.5; //Kecepatan
        
        f = ((a*b)-(c*d))/e;
        
        System.out.println("Waktu yang dibutuhkan = " + f + " menit");         
    }
}
