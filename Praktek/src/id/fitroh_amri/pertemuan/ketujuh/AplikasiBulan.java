package id.fitroh_amri.pertemuan.ketujuh;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class AplikasiBulan {
    public static void main(String[] args) {
        Bulan bulan = new Bulan();
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan nomor bulan");
        int NoBulan = in.nextInt();
        System.out.println("Nama bulan " +bulan.NamaBulan(NoBulan) );
    }
    
}
