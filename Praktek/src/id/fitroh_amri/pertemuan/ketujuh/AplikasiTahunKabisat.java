package id.fitroh_amri.pertemuan.ketujuh;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class AplikasiTahunKabisat {
    public static void main(String[] args) {
        int tahun;
        Kabisat kabisat = new Kabisat();
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan Tahun");
        tahun = in.nextInt();
        if (kabisat.Kabisat(tahun)){
            System.out.println("Tahun Kabisat");
        }else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
    
}
