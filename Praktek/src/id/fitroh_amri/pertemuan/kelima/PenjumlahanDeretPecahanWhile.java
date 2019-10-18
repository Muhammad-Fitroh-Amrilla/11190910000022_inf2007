
package id.fitroh_amri.pertemuan.kelima;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class PenjumlahanDeretPecahanWhile {
    public static void main(String[] args) {
        float s;
        s = 0;
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        while (x != -1){
            s =  s + (float) 1/x;
            x = in.nextInt();            
        }
        System.out.println(s);
    }
}
