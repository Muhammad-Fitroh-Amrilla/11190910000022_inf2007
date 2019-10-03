package id.fitroh_amri.pertemuan.ketiga;
import java.util.Scanner;
/**
 *
 * @author FITROH_08
 */
public class TukaranPecahan {
    public static void main(String args[]) {
        int nilaiuang, sisa;
        int pecahan1 = 1000, pecahan2 = 500, pecahan3 = 100, pecahan4 = 50, pecahan5 = 25;
        int jmlpecahan1, jmlpecahan2, jmlpecahan3, jmlpecahan4, jmlpecahan5;
        Scanner in = new Scanner(System.in);
        nilaiuang = in.nextInt();
        jmlpecahan1 = nilaiuang / pecahan1;
        sisa = nilaiuang % pecahan1;
        jmlpecahan2 = sisa / pecahan2;
        sisa = nilaiuang % pecahan2;
        jmlpecahan3 = sisa / pecahan3;
        sisa = nilaiuang % pecahan3;
        jmlpecahan4 = sisa / pecahan4;
        sisa = nilaiuang % pecahan4;
        jmlpecahan5 = sisa / pecahan5;

        System.out.println(jmlpecahan1 + " lembar 1000");
        System.out.println(jmlpecahan2 + " lembar 500");
        System.out.println(jmlpecahan3 + " lembar 100");
        System.out.println(jmlpecahan4 + " lembar 50");
        System.out.println(jmlpecahan5 + " lembar 25");
    }
}
