package id.fitroh_amri.pertemuan.kesebelas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class MahasiswaAction {

    private final static String ArsipNilai = "D:\\ArsipNilai.ser";
    private final Scanner in = new Scanner(System.in);
    private String NIM;
    private String Nama;
    private String KodeMK;
    private int SKS;
    private char Nilai;

    public String getInput(String input) {
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(input);
        System.out.flush();

        try {
            return bufIn.readLine();
        } catch (IOException e) {
            return "Error : " + e.getMessage();
        }
    }

    public void setDataMahasiswa(String Arsip) {
        Mahasiswa KuliahMhs = new Mahasiswa();
        try {
            System.out.print("Masukkan NIM: ");
            NIM = in.next();
            while (!(NIM.equals("9999"))) {
                ObjectOutputStream Kul = new ObjectOutputStream(new FileOutputStream(Arsip, true));
                System.out.print("Masukkan Nama: ");
                Nama = in.next();
                System.out.print("Masukkan Kode MK: ");
                KodeMK = in.next();
                System.out.print("Masukkan jumlah SKS: ");
                SKS = in.nextInt();
                System.out.print("Masukkan Nilai: ");
                Nilai = in.next().charAt(0);

                KuliahMhs.setNIM(NIM);
                KuliahMhs.setNama(Nama);
                KuliahMhs.setKodeMK(KodeMK);
                KuliahMhs.setSKS(SKS);
                KuliahMhs.setNilai(Nilai);

                Kul.writeObject(KuliahMhs);
                System.out.print("Masukkan NIM: ");
                NIM = in.next();
                Kul.close();
            }

        } catch (IOException e) {
            System.err.println("Error : " + e.getMessage());
        }
    }

    public void GetDaftarNilaiNIM(String Arsip, String nim) {
        Mahasiswa KuliahMhs = new Mahasiswa();
        Object object;
        int no;
        boolean ketemu = false;

        try {
            FileInputStream infile = new FileInputStream(Arsip);
            ObjectInputStream Kul = new ObjectInputStream(infile);
            ketemu = false;
            object = Kul.readObject();
            while (((object = Kul.readObject()) != null) && (!ketemu)) {
                Mahasiswa k = (Mahasiswa) object;
                if (k.getNIM().equals(nim)) {
                    ketemu = true;
                    KuliahMhs = k;
                }
            }
            Kul.close();
            infile.close();
        } catch (Exception e) {
            System.err.println(e);
        }

        if (ketemu) {
            System.out.println("      Daftar Nilai Mata Kuliah");
            System.out.println("\t    NIM: " + KuliahMhs.getNIM());
            System.out.println("\tNama: " + KuliahMhs.getNama());
            System.out.println("-----------------------------------");
            System.out.println("No\tMata Kuliah\tSKS   Nilai  ");
            System.out.println("-----------------------------------");
            no = 1;

            try {
                FileInputStream inFile = new FileInputStream(Arsip);
                ObjectInputStream in = new ObjectInputStream(inFile);

                Object o = null;
                while ((o = in.readObject()) != null) {
                    Mahasiswa m = (Mahasiswa) o;
                    if (m.getNIM().equals(nim)) {
                        System.out.println(no + "\t" + m.getKodeMK() + "\t\t" + m.getSKS() + "\t" + m.getNilai());
                        no++;
                    }
                }
                inFile.close();
                in.close();
            } catch (IOException e) {
//                System.err.println(e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MahasiswaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("-----------------------------------");
        } else {
            System.out.println("data Mahasiswa dengan NIM: " + nim + " Tidak Ada");
        }
    }

    public void getDaftarNilai(String Arsip) {
        Mahasiswa KuliahMhs = new Mahasiswa();
        int no;
        String nim;

        try {
            FileInputStream infile = new FileInputStream(Arsip);
            ObjectInputStream Kul = new ObjectInputStream(infile);

            Object object = new Object();
            while (((object = Kul.readObject()) != null)) {
                Mahasiswa k = (Mahasiswa) object;
                KuliahMhs = k;
                System.out.println("      Daftar Nilai Mata Kuliah");
                System.out.println("\t    NIM: " + KuliahMhs.getNIM());
                System.out.println("\tNama: " + KuliahMhs.getNama());
                System.out.println("-----------------------------------");
                System.out.println("No\tMata Kuliah\tSKS   Nilai  ");
                System.out.println("-----------------------------------");
                no = 1;
                System.out.println(no + "\t" + KuliahMhs.getKodeMK() + "\t\t" +
                        KuliahMhs.getSKS() + "\t" + KuliahMhs.getNilai());
                nim = KuliahMhs.getNIM();

                do {
                    object = Kul.readObject();
                    Mahasiswa k2 = (Mahasiswa) object;
                    no++;
                    KuliahMhs = k2;
//                    System.out.println(KuliahMhs.getNIM());
                    if (KuliahMhs.getNIM().equals(nim)) {
                        System.out.println(no + "\t" + KuliahMhs.getKodeMK() + 
                                "\t\t" + KuliahMhs.getSKS() + "\t" + KuliahMhs.getNilai());
                    } else {
                        System.out.println("-----------------------------------\n");
                        System.out.println("      Daftar Nilai Mata Kuliah");
                        System.out.println("\t    NIM: " + KuliahMhs.getNIM());
                        System.out.println("\tNama: " + KuliahMhs.getNama());
                        System.out.println("-----------------------------------");
                        System.out.println("No\tMata Kuliah\tSKS   Nilai  ");
                        System.out.println("-----------------------------------");
                        no = 1;
                        System.out.println(no + "\t" + KuliahMhs.getKodeMK() + 
                                "\t\t" + KuliahMhs.getSKS() + "\t" + KuliahMhs.getNilai());
                        nim = KuliahMhs.getNIM();
                    }
                } while (KuliahMhs.getNIM().equals(nim));
                System.out.println("-----------------------------------\n");
            }
            Kul.close();
            infile.close();
        } catch (Exception e) {
//            System.err.println(e);
        }
        System.out.println("-----------------------------------");
    }

    public void getPesertaMataKuliah(String Arsip, String mk) {
        Mahasiswa KuliahMhs = new Mahasiswa();
        int no;

        try {
            FileInputStream infile = new FileInputStream(Arsip);
            ObjectInputStream Kul = new ObjectInputStream(infile);

            System.out.println("      Daftar Peserta Mata Kuliah");
            System.out.println("\tKode Mata Kuliah: " + mk);
            System.out.println("-----------------------------------");
            System.out.println("No     NIM \t    Nama      Nilai  ");
            System.out.println("-----------------------------------");
            no = 1;

            Object object = new Object();
            object = Kul.readObject();
            while (((object = Kul.readObject()) != null)) {
                Mahasiswa k = (Mahasiswa) object;
                KuliahMhs = k;
                if (KuliahMhs.getKodeMK().equals(mk)) {
                    System.out.println(no + "    " + KuliahMhs.getNIM() + "\t"
                            + KuliahMhs.getNama() + "\t" + KuliahMhs.getNilai());
                    no++;
                }
            }
            Kul.close();
            infile.close();
        } catch (Exception e) {
//            System.err.println(e);
        }
        System.out.println("-----------------------------------");

    }

    public void getNilaiRerata(String Arsip) {
        Mahasiswa KuliahMhs = new Mahasiswa();
        String nim = null;
        int totalNilai;
        int angka = 0;
        int totalSKS;
        int no = 0;
        float NR = 0;
        String nama = null;

        try {

            FileInputStream infile = new FileInputStream(Arsip);
            ObjectInputStream Kul = new ObjectInputStream(infile);

            System.out.println("  Daftar Nilai Rata-Rata Mahasiswa");
            System.out.println("-----------------------------------");
            System.out.println("No     NIM \t     Nama      \tNR  ");
            System.out.println("-----------------------------------");
            no = 1;

            Object object = new Object();
            while (((object = Kul.readObject()) != null)) {
                Mahasiswa k = (Mahasiswa) object;
                KuliahMhs = k;

                angka = 0;
                totalNilai = 0;
                totalSKS = 0;
                nim = KuliahMhs.getNIM();
                nama = KuliahMhs.getNama();

                switch (KuliahMhs.getNilai()) {
                    case 'A':
                        angka = 4;
                        break;
                    case 'B':
                        angka = 3;
                        break;
                    case 'C':
                        angka = 2;
                        break;
                    case 'D':
                        angka = 1;
                        break;
                    case 'E':
                        angka = 0;
                        break;
                }

                totalNilai = totalNilai + (angka * KuliahMhs.getSKS());
                totalSKS = totalSKS + KuliahMhs.getSKS();
                NR = (float) totalNilai / totalSKS;
//                
                do {
                    object = Kul.readObject();
                    Mahasiswa k2 = (Mahasiswa) object;
                    KuliahMhs = k2;

                    if (KuliahMhs.getNIM().equals(nim)) {
                        switch (KuliahMhs.getNilai()) {
                            case 'A':
                                angka = 4;
                                break;
                            case 'B':
                                angka = 3;
                                break;
                            case 'C':
                                angka = 2;
                                break;
                            case 'D':
                                angka = 1;
                                break;
                            case 'E':
                                angka = 0;
                                break;
                        }

                        totalNilai = totalNilai + (angka * KuliahMhs.getSKS());
                        totalSKS = totalSKS + KuliahMhs.getSKS();
                        NR = (float) totalNilai / totalSKS;

                    } else {
                        System.out.println(no + "    " + nim + "\t" + nama + "\t" + NR);
                        no++;
                        angka = 0;
                        totalNilai = 0;
                        totalSKS = 0;
                        nim = KuliahMhs.getNIM();
                        nama = KuliahMhs.getNama();

                        switch (KuliahMhs.getNilai()) {
                            case 'A':
                                angka = 4;
                                break;
                            case 'B':
                                angka = 3;
                                break;
                            case 'C':
                                angka = 2;
                                break;
                            case 'D':
                                angka = 1;
                                break;
                            case 'E':
                                angka = 0;
                                break;
                        }

                        totalNilai = totalNilai + (angka * KuliahMhs.getSKS());
                        totalSKS = totalSKS + KuliahMhs.getSKS();
                        NR = (float) totalNilai / totalSKS;
                        nim = KuliahMhs.getNIM();
                        nama = KuliahMhs.getNama();
                    }
                } while (KuliahMhs.getNIM().equals(nim));
            }

            Kul.close();
            infile.close();

        } catch (Exception e) {
//            System.err.println(e);
        }
        System.out.println(no + "    " + nim + "\t" + nama + "\t" + NR);
        no++;
        System.out.println("-----------------------------------");
    }

    public void setManual() {
        try {
            FileOutputStream fileOut = new FileOutputStream("D:\\ArsipNilai.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            List<Mahasiswa> ms = new ArrayList<>();
            ms.add(new Mahasiswa("1359601", "Ezra Ibrahim", "TI451", 3, 'A'));
            ms.add(new Mahasiswa("1359601", "Ezra Ibrahim", "KU301", 2, 'B'));
            ms.add(new Mahasiswa("1359601", "Ezra Ibrahim", "IF321", 3, 'B'));
            ms.add(new Mahasiswa("1359606", "Agus Purwoko", "KU302", 2, 'C'));
            ms.add(new Mahasiswa("1359606", "Agus Purwoko", "IF400", 4, 'B'));
            ms.add(new Mahasiswa("1359607", "Leyla Khodra", "IF323", 3, 'C'));
            ms.add(new Mahasiswa("1359607", "Leyla Khodra", "IF321", 3, 'A'));
            ms.add(new Mahasiswa("1359607", "Leyla Khodra", "IF400", 4, 'A'));
            ms.add(new Mahasiswa("1359607", "Leyla Khodra", "IF401", 2, 'B'));
            ms.add(new Mahasiswa("1359609", "Ahmad Baiquni", "IF221", 3, 'C'));
            ms.add(new Mahasiswa("1359610", "Arif Bramantoro", "IF400", 4, 'A'));

            for (Mahasiswa m : ms) {
                System.out.println(m);
                out.writeObject(m);
            }
            out.close();
            fileOut.close();
            System.out.println("\nSerialization Successful... Checkout your specified output file..\n");

        } catch (FileNotFoundException e) {
            System.out.println("Error File Not Found : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error I/O : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        MahasiswaAction mahasiswa = new MahasiswaAction();
//        mahasiswa.setManual();
//        mahasiswa.setDataMahasiswa(ArsipNilai);
//        mahasiswa.GetDaftarNilaiNIM(ArsipNilai, "1359601");
//        mahasiswa.getDaftarNilai(ArsipNilai);
//        mahasiswa.getPesertaMataKuliah(ArsipNilai, "IF400");
//        mahasiswa.getNilaiRerata(ArsipNilai);
    }
}