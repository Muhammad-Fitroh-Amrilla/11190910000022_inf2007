package id.fitroh_amri.pertemuan.kelima;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class ValidasiSandi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password = "abc123", sandi;
        boolean sah = false;
        int count = 1;
        while ((!sah) && (count <= 3)) {
            sandi = in.next();
            if (sandi.equals(password)) {
                sah = true;
            } else {
                count = count + 1;
            }
        }

    }
}
