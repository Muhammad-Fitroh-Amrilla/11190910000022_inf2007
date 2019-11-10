package id.fitroh_amri.pertemuan.kedelapan;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class ArrayHitungRerata {
public static void main(String[] args) {
        int[] x = new int[6];
        int i;
        float jumlah = 0, u;
        Scanner in = new Scanner(System.in);
        for (i = 0; i < x.length; i++) {
            System.out.println("Masukan nilai ke " + (i+1));
            x [i] = in.nextInt();
        }
        
        for (i = 0; i < x.length; i++) {
            System.out.print(x[i]+", ");
        }
        for (i = 0; i < x.length; i++) {
            jumlah = jumlah + x[i];
        }
        u = jumlah/6;
        System.out.println("\nNilai rata-rata = " + u);
    }    
}
