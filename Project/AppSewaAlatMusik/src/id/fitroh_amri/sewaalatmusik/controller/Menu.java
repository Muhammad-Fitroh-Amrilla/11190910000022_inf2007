package id.fitroh_amri.sewaalatmusik.controller;

import id.fitroh_amri.sewaalatmusik.model.Info;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Menu {
    private final Scanner in = new Scanner(System.in);
    private int noMenu;
    
    
    public void getMenuAwal() {
        Info info = new Info();

        System.out.println("=================================================");
        System.out.println(info.getAplikasi());
        System.out.println(info.getVersi());
        System.out.println(info.getKarya());
        System.out.println("-------------------------------------------------");

        System.out.println("DAFTAR MENU");
        System.out.println("1. Menu Penyewaan Alat Musik");
        System.out.println("2. Menu Pengembalian Alat Musik");
        System.out.println("3. Laporan Mingguan");
        System.out.println("4. Keluar Aplikasi");
        System.out.println("=================================================");
        System.out.print("Pilih Menu (1/2/3/4) : ");

        do {
            while (!in.hasNextInt()) {
                String input = in.next();
                System.out.printf("\"%s\" silakan isi dengan angka.\n", input);
                System.out.print("Pilih Menu (1/2/3/4) : ");
            }
            noMenu = in.nextInt();
        } while (noMenu < 0);
        setPilihMenu();
    }
    public void setPilihMenu() {
        SewaAlatMusikController sc = new SewaAlatMusikController();
        switch (noMenu) {
            case 1:
                sc.setPenyewaanAlatMusik();
                break;
            case 2:
                sc.setPengembalianAlatMusik();
                break;
            case 3:
                sc.getDataSewaAlatMusik();
                break;
            case 4:
                System.out.println("Terima kasih telah menggunakan aplikasi ini \nSampai jumpa :)");
                System.exit(0);
                break;
        }
    }
}
