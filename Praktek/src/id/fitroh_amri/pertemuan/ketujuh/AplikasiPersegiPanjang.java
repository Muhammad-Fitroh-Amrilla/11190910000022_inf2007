package id.fitroh_amri.pertemuan.ketujuh;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class AplikasiPersegiPanjang {

    public static void main(String[] args) {
        PersegiPanjang persegipanjang2 = new PersegiPanjang();
        Scanner in = new Scanner(System.in);
        double panjang, lebar;

        System.out.print("Masukan panjang ");
        panjang = in.nextDouble();

        System.out.print("Masukan lebar ");
        lebar = in.nextDouble();

        PersegiPanjang persegipanjang = new PersegiPanjang(panjang, lebar);
        persegipanjang.getInfo();
        System.out.println("Luas : " + persegipanjang.getLuas());
        System.out.println("Keliling : " + persegipanjang.getKeliling());
    }
}
