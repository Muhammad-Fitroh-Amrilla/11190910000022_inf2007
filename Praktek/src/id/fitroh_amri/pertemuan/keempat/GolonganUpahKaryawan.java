package id.fitroh_amri.pertemuan.keempat;
import java.util.Scanner;
public class GolonganUpahKaryawan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jamNormal = 48;
        int upahLembur = 3000;
        String nama = in.next();
        char gol = in.next().charAt(0);
        int JJK = in.nextInt();
        int jamLembur, upahPerJam = 0, upahTotal;

        if (gol == 'a') {
            upahPerJam = 4000;
        } else if (gol == 'b') {
            upahPerJam = 5000;
        } else if (gol == 'c') {
            upahPerJam = 6000;
        } else if (gol == 'd') {
            upahPerJam = 7500;
        }
        if (JJK <= jamNormal ){
            upahTotal = JJK * upahPerJam;
        }else {
            jamLembur = JJK - jamNormal;
            upahTotal = jamNormal * upahPerJam + jamLembur * upahLembur;
        }
        System.out.println(nama + " " + upahTotal);
    }
}
