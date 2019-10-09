package id.fitroh_amri.pertemuan.keempat;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class JenisBilanganBulat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bilangan = in.nextInt();
        if (bilangan > 0){
            System.out.println("positif");
        }else if (bilangan < 0){
            System.out.println("negatif");
        }else if (bilangan == 0){
            System.out.println("nol");
        }
    }
}
