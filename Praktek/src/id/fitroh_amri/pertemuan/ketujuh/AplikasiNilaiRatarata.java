package id.fitroh_amri.pertemuan.ketujuh;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class AplikasiNilaiRatarata {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan nilai (untuk mengakhiri masukan -1)");
        float nilai = in.nextFloat();
        NilaiRatarata nilairatarata = new NilaiRatarata();
        nilairatarata.NilaiRatarata(nilai);
    }
    
}
