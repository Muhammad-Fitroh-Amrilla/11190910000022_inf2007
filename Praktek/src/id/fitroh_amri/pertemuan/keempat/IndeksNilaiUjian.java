package id.fitroh_amri.pertemuan.keempat;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class IndeksNilaiUjian {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nilai = in.nextInt();
        char indeks;
        
        if (nilai >= 80){
            indeks = 'A';
        } else if ((nilai >= 70) && (nilai < 80)){
            indeks = 'B';
        }else if ((nilai >= 55)&&(nilai < 70)){
            indeks = 'C';
        }else if ((nilai >= 40)&&(nilai < 50)){
            indeks = 'D';
        }else{
            indeks = 'E';
        }
        System.out.println(indeks);
    }
}
