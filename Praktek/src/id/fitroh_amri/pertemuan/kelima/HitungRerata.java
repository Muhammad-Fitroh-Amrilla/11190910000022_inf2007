
package id.fitroh_amri.pertemuan.kelima;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class HitungRerata {
    public static void main(String[] args) {
        int i = 0,  jumlah = 0;
        float rerata;
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        while (x != -1){
            i = i +1;
            jumlah = jumlah + x;
            x = in.nextInt();
        }
        if (i != 0){
            rerata= jumlah /i;
            System.out.println(rerata);
        } else {
            System.out.println("tidak ada nilai ujian yang dimasukkan");
        }
            
    }
}
