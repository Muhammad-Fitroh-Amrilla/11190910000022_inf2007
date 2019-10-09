package id.fitroh_amri.pertemuan.keempat;
import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class KonversiAngkaKeTeks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        switch (angka) {
            case 1:
                System.out.println("satu");
                break;
            case 2:
                System.out.println("dua");
                break;
            case 3:
                System.out.println("tiga");
                break;
            case 4:
                System.out.println("empat");
                break;
            default:
                System.out.println("angka yang dimasukan salah");
        }
    }
}
