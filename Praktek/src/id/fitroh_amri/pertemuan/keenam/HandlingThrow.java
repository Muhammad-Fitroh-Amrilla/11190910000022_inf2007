package id.fitroh_amri.pertemuan.keenam;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class HandlingThrow {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Masukan angka:");
            int num = in.nextInt();
            if (num > 10) {
                throw new Exception();
            }
            System.out.println("Angka kurang dari atau sama dengan 10");
        } catch (Exception error) {
            System.out.println("Angka lebih dari 10 ");
        }
        System.out.println("Selesai");
    }
}
