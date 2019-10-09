package id.fitroh_amri.pertemuan.keempat;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class DiskonHarga {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalbelanja = in.nextInt();
        int diskon, nilaibelanja;

        if (totalbelanja > 120000) {
            diskon = totalbelanja * 7 / 100;
            nilaibelanja = totalbelanja - diskon;
            System.out.println("Diskon = " + diskon + "\n" + "nilai belanja = " + nilaibelanja);
        } else {
            nilaibelanja = totalbelanja;
            System.out.println("nilai belanja = " + nilaibelanja);
        }
    }
}
