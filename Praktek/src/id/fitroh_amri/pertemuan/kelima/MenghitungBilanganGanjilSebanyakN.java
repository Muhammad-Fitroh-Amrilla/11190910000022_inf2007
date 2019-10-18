package id.fitroh_amri.pertemuan.kelima;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class MenghitungBilanganGanjilSebanyakN {
    public static void main(String[] args) {
        int N, i = 1, jumlah = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("masukan nilai bilangan ganjil pertama");
        N = in.nextInt();
        N = N * 2;
        while (i <= N){
            jumlah = jumlah + i;
            i = i + 2;
        }
        System.out.println("Jumlah nilai bilangan ganjil = "+jumlah);
    }
    
}
