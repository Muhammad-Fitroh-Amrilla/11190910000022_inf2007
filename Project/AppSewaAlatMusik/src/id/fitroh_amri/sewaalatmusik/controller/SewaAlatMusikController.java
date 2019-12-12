/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.fitroh_amri.sewaalatmusik.controller;

import com.google.gson.Gson;
import id.fitroh_amri.sewaalatmusik.model.SewaAlatMusik;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author ASUS
 */
public class SewaAlatMusikController {
    private static final String FILE = "D:\\SewaAlatMusik.json";
    private SewaAlatMusik sewaAlatMusik;
    private final Scanner in;
    private int jenis;
    private String nama;
    private String alamat;
    private String noHP;
    private int lamasewa;
    private LocalDateTime waktuAwal;
    private LocalDateTime waktuAkhir;
    private BigDecimal biaya;
    private final DateTimeFormatter dateTimeFormat;
    private int pilihan;

    public SewaAlatMusikController() {
        in = new Scanner(System.in);
        waktuAwal = LocalDateTime.now();
        waktuAkhir = LocalDateTime.now();
        dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    }

    //Method untuk menu penyewaan
    public void setPenyewaanAlatMusik() {

        System.out.println("Pilih jenis alat musik yang ingin dipinjam");
        System.out.println("1. Gitar \t 2. Drum \t 3. Keyboard \t 4. Bass");
        System.out.println("Masukan jenis alat musik : ");
        while (!in.hasNextInt()) {
            String input = in.next();
            System.out.printf("\"%s\" Silakan isi dengan angka.\n", input);
            System.out.print("Masukkan jenis alat musik : ");
        }
        jenis = in.nextInt();

        System.out.print("Nama penyewa : ");
        nama = in.next();

        System.out.print("Alamat penyewa : ");
        alamat = in.next();

        System.out.print("No Handphone penyewa : ");
        noHP = in.next();

        System.out.print("Lama hari sewa : ");
        lamasewa = in.nextInt();

        String formatWaktuAwal = waktuAwal.format(dateTimeFormat);
        System.out.println("Waktu awal sewa : " + formatWaktuAwal);
        if (lamasewa > 0) {
            biaya = new BigDecimal(lamasewa);
            if (jenis == 1) {
                biaya = biaya.multiply(new BigDecimal(200000));
            } else if (jenis == 2) {
                biaya = biaya.multiply(new BigDecimal(500000));
            } else if (jenis == 3) {
                biaya = biaya.multiply(new BigDecimal(350000));
            } else {
                biaya = biaya.multiply(new BigDecimal(200000));
            }
        }
        System.out.println("Biaya : " + biaya);
        sewaAlatMusik = new SewaAlatMusik();
        sewaAlatMusik.setJenis(jenis);
        sewaAlatMusik.setNama(nama);
        sewaAlatMusik.setAlamat(alamat);
        sewaAlatMusik.setNoHP(noHP);
        sewaAlatMusik.setLamasewa(lamasewa);
        sewaAlatMusik.setBiaya(biaya);
        sewaAlatMusik.setWaktuAwal(waktuAwal);

        System.out.println("Proses bayar ? ");
        System.out.print("1) Ya, 2) Tidak, 3) Keluar : ");
        pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                setWriteSewaAlatMusik(FILE, sewaAlatMusik);
                break;
            case 2:
                setPenyewaanAlatMusik();
                break;
            default:
                Menu m = new Menu();
                m.getMenuAwal();
                break;
        }

        System.out.println("Apakah mau Input kembali?");
        System.out.print("1) Ya, 2) Tidak : ");
        pilihan = in.nextInt();
        if (pilihan == 2) {
            Menu m = new Menu();
            m.getMenuAwal();
        } else {
            setPenyewaanAlatMusik();
        }
    }

    public List<SewaAlatMusik> getReadSewaAlatMusik(String file) {
        List<SewaAlatMusik> sewaAlatMusiks = new ArrayList<>();

        Gson gson = new Gson();
        String line = null;
        try (Reader reader = new FileReader(file)) {
            BufferedReader br = new BufferedReader(reader);
            while ((line = br.readLine()) != null) {
                SewaAlatMusik[] sw = gson.fromJson(line, SewaAlatMusik[].class);
                sewaAlatMusiks.addAll(Arrays.asList(sw));
            }
            br.close();
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SewaAlatMusikController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SewaAlatMusikController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sewaAlatMusiks;
    }

    public void setWriteSewaAlatMusik(String file, SewaAlatMusik sewaAlatMusik) {
        Gson gson = new Gson();

        List<SewaAlatMusik> sewaAlatMusiks = getReadSewaAlatMusik(file);
        sewaAlatMusiks.remove(sewaAlatMusik);
        sewaAlatMusiks.add(sewaAlatMusik);

        String json = gson.toJson(sewaAlatMusiks);
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(json);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(SewaAlatMusikController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setPengembalianAlatMusik() {
        System.out.print("Cari nama penyewa : ");
        nama = in.next();

        SewaAlatMusik s = getSearch(nama);
        if (s != null) {
            waktuAkhir = LocalDateTime.now();
            s.setWaktuAkhir(waktuAkhir);
            System.out.println("Nama penyewa : " + s.getNama());
            System.out.println("Alamat : " + s.getAlamat());
            System.out.println("No Handphone :" + s.getNoHP());
            if (s.getJenis() == 1) {
                System.out.println("Alat yang disewa : Gitar");
            } else if (s.getJenis() == 2) {
                System.out.println("Alat yang disewa : Drum");
            } else if (s.getJenis() == 3) {
                System.out.println("Alat yang disewa : Keyboard");
            } else if (s.getJenis() == 4) {
                System.out.println("Alat yang disewa : Bass");
            }

            System.out.println("Waktu Sewa awal : " + s.getWaktuAwal().format(dateTimeFormat));
            System.out.println("Kembalikan alat?");
            System.out.print("1) Ya, 2) Tidak : ");
            pilihan = in.nextInt();
            if (pilihan == 2) {
                setPengembalianAlatMusik();
            } else {
                s.setKeluar(true);
                System.out.println("Waktu Pengambilan : " + s.getWaktuAkhir().format(dateTimeFormat));
                setWriteSewaAlatMusik(FILE, s);
            }

            System.out.println("Masih ingin mencari data?");
            System.out.print("1) Ya, 2) Tidak : ");
            pilihan = in.nextInt();
            if (pilihan == 2) {
                Menu m = new Menu();
                m.getMenuAwal();
            } else {
                setPengembalianAlatMusik();
            }
        } else {
            System.out.println("Data tidak ditemukan");
            System.out.println("Masih ingin mencari data?");
            System.out.print("1) Ya, 2) Tidak : ");
            pilihan = in.nextInt();
            if (pilihan == 2) {
                Menu m = new Menu();
                m.getMenuAwal();
            } else {
                setPengembalianAlatMusik();
            }
        }

    }

    public SewaAlatMusik getSearch(String nama) {
        List<SewaAlatMusik> sewaAlatMusiks = getReadSewaAlatMusik(FILE);

        SewaAlatMusik s = sewaAlatMusiks.stream().filter(ss -> nama.equalsIgnoreCase(ss.getNama()))
                .findAny().orElse(null);

        return s;
    }

    public void getDataSewaAlatMusik() {
        List<SewaAlatMusik> sewaAlatMusiks = getReadSewaAlatMusik(FILE);
        Predicate<SewaAlatMusik> isKeluar = e -> e.isKeluar() == true;
        Predicate<SewaAlatMusik> isDate = e -> e.getWaktuAkhir().toLocalDate().equals(LocalDate.now());

        List<SewaAlatMusik> sResults = sewaAlatMusiks.stream().filter(isKeluar.and(isDate)).collect(Collectors.toList());
        BigDecimal total = sResults.stream()
                .map(SewaAlatMusik::getBiaya)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Nama penyewa \tJenis alat musik \tTanggal sewa \t\tTanggal pengembalian \t\t biaya");
        System.out.println("------------ \t---------------- \t------------ \t\t-------------------- \t\t------");
        sResults.forEach((s) -> {
            if (s.getJenis() == 1) {
                System.out.println(s.getNama() + "\t\t" + "Gitar" + "\t\t\t" + s.getWaktuAwal().format(dateTimeFormat) + "\t" + s.getWaktuAkhir().format(dateTimeFormat) + "\t\t" + s.getBiaya());
            } else if (s.getJenis() == 2) {
                System.out.println(s.getNama() + "\t\t" + "Drum" + "\t\t\t" + s.getWaktuAwal().format(dateTimeFormat) + "\t" + s.getWaktuAkhir().format(dateTimeFormat) + "\t\t" + s.getBiaya());
            } else if (s.getJenis() == 3) {
                System.out.println(s.getNama() + "\t\t" + "Keyboard" + "\t\t\t" + s.getWaktuAwal().format(dateTimeFormat) + "\t" + s.getWaktuAkhir().format(dateTimeFormat) + "\t\t" + s.getBiaya());
            } else if (s.getJenis() == 4) {
                System.out.println(s.getNama() + "\t\t" + "Bass" + "\t\t\t" + s.getWaktuAwal().format(dateTimeFormat) + "\t" + s.getWaktuAkhir().format(dateTimeFormat) + "\t\t" + s.getBiaya());
            }
        });

        System.out.println("------------ \t---------------- \t------------ \t\t-------------------- \t\t------");
        System.out.println("====================================");
        System.out.println("Pendapatan Total = Rp. " + total);
        System.out.println("====================================");

        System.out.println("Lihat laporan lagi?");
        System.out.print("1) Ya, 2) Tidak : ");
        pilihan = in.nextInt();
        if (pilihan == 2) {
            Menu m = new Menu();
            m.getMenuAwal();
        } else {
            getDataSewaAlatMusik();
        }
    }
}
