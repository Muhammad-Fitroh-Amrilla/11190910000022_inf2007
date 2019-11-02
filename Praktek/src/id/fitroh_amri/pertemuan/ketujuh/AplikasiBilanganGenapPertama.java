package id.fitroh_amri.pertemuan.ketujuh;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class AplikasiBilanganGenapPertama {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan jumlah buah bilangan genap yang akan dihitung");
        int N = in.nextInt();
        BilanganGenapPertama bilangangenappertama = new BilanganGenapPertama();
        bilangangenappertama.BilanganGenapPertama(N);
    }
}
