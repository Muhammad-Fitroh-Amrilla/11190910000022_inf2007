package id.fitroh_amri.pertemuan.ketujuh;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */

public class NilaiRatarata {
    private float i, jumlah;
    private float rerata, nilai;

    public void NilaiRatarata(float nilai) {
        this.nilai = nilai;
        Scanner in = new Scanner(System.in);
        while (nilai != -1) {
            i = i + 1;
            jumlah = jumlah + nilai;
            nilai = in.nextFloat();
        }
        if (i != 0) {
            rerata = jumlah / i;
            System.out.println("Nilai rata-rata");
            System.out.println(rerata);
        } else {
            System.out.println("tidak ada nilai ujian yang dimasukkan");

        }
    }
}
