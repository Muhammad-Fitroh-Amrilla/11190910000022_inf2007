package id.fitroh_amri.pertemuan.ketujuh;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class AplikasiSegitiga {

    public static void main(String[] args) {
        int i, N;
        Segitiga segitiga = new Segitiga();
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan jumlah buah segitiga");
        N = in.nextInt();
        for (i = 1; i <= N; i++) {
            segitiga.Segitiga();
        }

    }

}
