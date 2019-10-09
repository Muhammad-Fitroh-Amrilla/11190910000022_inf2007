package id.fitroh_amri.pertemuan.keempat;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class UpahKaryawan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama = in.next();
        int JJK = in.nextInt();
        int lembur, upah; 
        if (JJK <= 48){
            upah = JJK * 2000;
        }else{
            lembur = JJK - 48;
            upah = 48 * 2000 + lembur * 3000;
        }
        System.out.println(nama + " " + upah);
    }
}
