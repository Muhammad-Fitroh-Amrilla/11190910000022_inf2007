package id.fitroh_amri.pertemuan.ketujuh;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class Segitiga {
    private float alas, tinggi, luas;
    Scanner in = new Scanner(System.in);
    public void Segitiga(){
        System.out.println("Masukan nilai alas ");
        alas = in.nextFloat();
        System.out.println("Masukan nilai tinggi ");
        tinggi = in.nextFloat();
        luas = (alas*tinggi)/2;
        System.out.println("Luas = "+luas);
        
    }
}
