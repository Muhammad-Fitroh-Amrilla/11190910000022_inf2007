package id.fitroh_amri.pertemuan.ketujuh;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class AplikasiBilanganGenap {
    public static void main(String[] args) {
        int bilangan;
        BilanganGenap bilangangenap = new BilanganGenap();
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan bilangan bulat");
        bilangan = in.nextInt();
        if (bilangangenap.getHasil(bilangan)){
              System.out.println("Bilangan genap");
        }else{
            System.out.println("Bukan bilangan genap");
        }
    }
}
