package id.fitroh_amri.pertemuan.keempat;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class HurufVokal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char k = in.next().charAt(0);
       if ((k == 'a') || (k == 'i') || (k == 'u') || (k == 'e') || (k == 'o')){
           System.out.println("huruf vokal");
       }   
    }
}
