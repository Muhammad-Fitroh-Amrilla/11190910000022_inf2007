package id.fitroh_amri.pertemuan.kelima;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class Faktorial {
    public static void main(String[] args) {
        int n, fak = 1, i;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
       for (i = 1; i <= n; i++){
           fak = fak *i;
       }
        System.out.println(fak);
    }
    
}
