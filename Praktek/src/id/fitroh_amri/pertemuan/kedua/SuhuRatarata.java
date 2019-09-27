package id.fitroh_amri.pertemuan.kedua;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class SuhuRatarata {

    public static void main(String args[]) {
        int x, y, z;
        Scanner in = new Scanner(System.in);
        x = in.nextInt(); //suhu minimal
        y = in.nextInt(); //suhu maksimal
        z = (x + y)/2;
        
        System.out.println("Suhu rata-rata = " + z);
    }
}
