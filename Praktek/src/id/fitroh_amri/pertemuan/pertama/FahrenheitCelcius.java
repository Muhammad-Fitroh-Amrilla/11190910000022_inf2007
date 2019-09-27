package id.fitroh_amri.pertemuan.pertama;

import java.util.Scanner;
public class FahrenheitCelcius {

    public static void main(String[] args) {

        /*DEKLARASI*/
        float F, C;
        int x, y, step;

        /* ALGORITMA */
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        step = in.nextInt();

        F = x;
        while (F <= y) {
            System.out.print("5/9 ; " + 5 / 9);
            //C = (5 / 9) * (F - 32);
            C = (float) (5.0 / 9.0) * (F - 32);
            //C = 5 * (F - 32) /9;
            System.out.printf("%3.0f  %6.1f \n", F, C);
            F = F + step;
        }
    }
}
