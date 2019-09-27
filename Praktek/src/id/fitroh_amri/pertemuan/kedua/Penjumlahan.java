package id.fitroh_amri.pertemuan.kedua;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class Penjumlahan {

    public static void main(String args[]) {
        int a, b, c, d;
        
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = a + b + c;
        System.out.println("Hasil penjumlahan 3 bilangan = " + d);
    }
}
