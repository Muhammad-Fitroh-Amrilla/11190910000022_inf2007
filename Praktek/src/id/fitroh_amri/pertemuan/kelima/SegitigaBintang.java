package id.fitroh_amri.pertemuan.kelima;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class SegitigaBintang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N,i,j;
        N = in.nextInt();
        for (i=1;i<= N;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        } 
    } 
}
