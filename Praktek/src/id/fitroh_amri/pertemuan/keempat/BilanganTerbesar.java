package id.fitroh_amri.pertemuan.keempat;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class BilanganTerbesar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bilangan1 = in.nextInt();
        int bilangan2 = in.nextInt();
        int bilangan3 = in.nextInt();
        int maks = 0;
        if (bilangan1 > bilangan2) {
            maks = bilangan1;
        } else if (bilangan2 >= bilangan1) {
            maks = bilangan2;
        }
        if (bilangan3 > maks) {
            maks = bilangan3;
        }
        System.out.println("Bilangan terbesar = " + maks);
    }
}
