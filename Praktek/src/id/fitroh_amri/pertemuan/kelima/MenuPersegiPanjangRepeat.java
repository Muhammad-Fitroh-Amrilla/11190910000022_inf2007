package id.fitroh_amri.pertemuan.kelima;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class MenuPersegiPanjangRepeat {

    public static void main(String[] args) {
        int noMenu;
        float luas, keliling, diagonal, panjang, lebar;
        do {
            System.out.println("Menu empat persegi panjang");
            System.out.println("1. Hitung Luas ");
            System.out.println("2. Hitung Keliling ");
            System.out.println("3. Hitung Panjang Diagonal ");
            System.out.println("4. Keluar Program ");
            System.out.println("Masukan pilihan anda (1/2/3/4) ? ");
           
            Scanner in = new Scanner(System.in);
            noMenu = in.nextInt();
                       
            switch (noMenu) {
                case 1: {
                    System.out.println("masukan nilai panjang");
                    panjang = in.nextInt();
                    System.out.println("masukan nilai lebar");
                    lebar = in.nextInt();
                    luas = panjang * lebar;
                    System.out.println(luas);
                }
                break;
                case 2: {
                    System.out.println("masukan nilai panjang");
                    panjang = in.nextInt();
                    System.out.println("masukan nilai lebar");
                    lebar = in.nextInt();
                    keliling = 2 * panjang + 2 * lebar;
                    System.out.println(keliling);
                }
                break;
                case 3: {
                    System.out.println("masukan nilai panjang");
                    panjang = in.nextInt();
                    System.out.println("masukan nilai lebar");
                    lebar = in.nextInt();
                    diagonal = panjang * panjang + lebar * lebar;
                    System.out.println(diagonal);
                }
                break;
                case 4:
                    System.out.println("Keluar program...sampai jumpa");
            }

        }while (noMenu != 4);
        
    }
}
