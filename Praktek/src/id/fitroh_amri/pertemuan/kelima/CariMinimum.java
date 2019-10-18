package id.fitroh_amri.pertemuan.kelima;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class CariMinimum {

    public static void main(String[] args) {
        int N, x, min, i;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        x = in.nextInt();
        min = x;
        for (i = 2; i <= N; i++) {
            x = in.nextInt();
            if (x < min) {
                min = x;
            }
        }
        System.out.println(min);
    }

}
