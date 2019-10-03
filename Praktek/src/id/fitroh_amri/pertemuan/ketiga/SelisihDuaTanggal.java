package id.fitroh_amri.pertemuan.ketiga;
import java.util.Scanner;
/**
 * @author FITROH_08
 */
public class SelisihDuaTanggal {
    public static void main(String args[]) {
    int tanggal1, tanggal2, tanggal3, SelisihHari;
    int bulan1, bulan2, bulan3;
    int tahun1, tahun2, tahun3;
    Scanner in = new Scanner(System.in);    
    System.out.println("masukan tanggal pertama");
    tanggal1 = in.nextInt();
    System.out.println("masukan bulan pertama");
    bulan1 = in.nextInt();
    System.out.println("masukan tahun pertama");
    tahun1 = in.nextInt();
    System.out.println("masukan tanggal kedua");
    tanggal2 = in.nextInt();
    System.out.println("masukan bulan kedua");
    bulan2 = in.nextInt();
    System.out.println("masukan tahun kedua");
    tahun2 = in.nextInt();
    SelisihHari = tanggal2-tanggal1 + (bulan2-bulan1)*30 + (tahun2-tahun1)*365;
    tahun3 = SelisihHari / 365;
    bulan3 = (SelisihHari % 365)/30;
    tanggal3 = (SelisihHari % 365) % 30;
        System.out.println(tahun3 + " tahun " + bulan3 + " bulan " + tanggal3 + " hari ");
    }
}