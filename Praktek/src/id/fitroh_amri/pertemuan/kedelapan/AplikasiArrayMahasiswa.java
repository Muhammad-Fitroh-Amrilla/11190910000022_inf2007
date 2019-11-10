package id.fitroh_amri.pertemuan.kedelapan;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class AplikasiArrayMahasiswa {
    public static void main(String[] args) {
        int jumlahdata,nim;
        String nama;
        double nilai;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan jumlah array = ");
        jumlahdata = in.nextInt();
        
        
        Mahasiswa[] mahasiswas = new Mahasiswa[jumlahdata];
        for (int i = 0; i <= jumlahdata-1; i++) {
            System.out.println("Mahasiswa ke : " + (i+1));
            System.out.println("Masukan NIM = ");
            nim= in.nextInt();
            System.out.println("Masukan nama = ");
            nama = in.next();
            System.out.println("Masukan nilai = ");
            nilai = in.nextDouble();
            
            mahasiswas[i] = new Mahasiswa(nim, nama, nilai);
        }
        System.out.println("Data Mahasiswa pada array");
        for (Mahasiswa mahasiswa : mahasiswas) {
            System.out.println("NIM : " + mahasiswa.getNim()+ "\tNama : "
            + mahasiswa.getNama()+ "\tNilai : "+ mahasiswa.getNilai());
        }
    }
    
}
