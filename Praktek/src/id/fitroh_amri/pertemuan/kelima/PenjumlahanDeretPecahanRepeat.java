
package id.fitroh_amri.pertemuan.kelima;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class PenjumlahanDeretPecahanRepeat {
    public static void main(String[] args) {
        int x;
        float s = 0;
         Scanner in = new Scanner(System.in);
         x = in.nextInt();
         do{
         s = s +(float) 1/x;
         x = in.nextInt();
         } while (x != -1);
         System.out.println(s);
    }
}
