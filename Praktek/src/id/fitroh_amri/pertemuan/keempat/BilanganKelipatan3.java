package id.fitroh_amri.pertemuan.keempat;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class BilanganKelipatan3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bilangan = in.nextInt();
        if (bilangan % 3 == 0) 
            System.out.println("Kelipatan 3");
    }
}
