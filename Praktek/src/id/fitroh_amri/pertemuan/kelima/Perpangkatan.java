package id.fitroh_amri.pertemuan.kelima;

import java.util.Scanner;

/**
 *
 * @author revimaulana
 */
public class Perpangkatan {
    public static void main(String[] args) {
        float a, p = 1 ;
        int n, i;
         Scanner in = new Scanner(System.in);
         a = in.nextFloat();
         n = in.nextInt();
         for (i = 1; i <= n; i++ ){
             p = p * a;
         }
         System.out.println(p);
    }
    
}
