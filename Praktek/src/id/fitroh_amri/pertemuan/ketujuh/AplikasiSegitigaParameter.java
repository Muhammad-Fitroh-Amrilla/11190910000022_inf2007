package id.fitroh_amri.pertemuan.ketujuh;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class AplikasiSegitigaParameter {

    public static void main(String[] args) {
        int i, N;
        float a, t;
        //SegitigaParameter Segitiga ;
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan jumlah buah segitiga");
        N = in.nextInt();
        for (i = 1; i <= N; i++) {
            System.out.println("Masukan nilai alas ");
            a = in.nextFloat();
            System.out.println("Masukan nilai tinggi");
            t = in.nextFloat();
            SegitigaParameter Segitiga = new SegitigaParameter(a, t);
            Segitiga.getLuas();
        }
    }
}
