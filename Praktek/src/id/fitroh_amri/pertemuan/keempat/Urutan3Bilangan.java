package id.fitroh_amri.pertemuan.keempat;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class Urutan3Bilangan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bilangan1, bilangan2, bilangan3;
        bilangan1 = in.nextInt();
        bilangan2 = in.nextInt();
        bilangan3 = in.nextInt();
        System.out.println("Urutan bilangan dari yang terkecil");
        if ((bilangan1 <= bilangan2) && (bilangan2 <= bilangan3)) {
            System.out.println(bilangan1 + " " + bilangan2 + " " + bilangan3);
        } else if ((bilangan1 <= bilangan3) && (bilangan3 <= bilangan2)) {
            System.out.println(bilangan1 + " " + bilangan3 + " " + bilangan2);
        } else if ((bilangan2 <= bilangan1) && (bilangan1 <= bilangan3)) {
            System.out.println(bilangan2 + " " + bilangan1 + " " + bilangan3);
        } else if ((bilangan2 <= bilangan3) && (bilangan3 <= bilangan1)) {
            System.out.println(bilangan2 + " " + bilangan3 + " " + bilangan1);
        } else if ((bilangan3 <= bilangan1) && (bilangan1 <= bilangan2)) {
            System.out.println(bilangan3 + " " + bilangan1 + " " + bilangan2);
        } else {
            System.out.println(bilangan3 + " " + bilangan2 + " " + bilangan1);
        }
    }
}
