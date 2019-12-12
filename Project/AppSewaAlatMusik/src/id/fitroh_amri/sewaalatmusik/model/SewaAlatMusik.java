package id.fitroh_amri.sewaalatmusik.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author ASUS
 */
public class SewaAlatMusik implements Serializable {
     private static final long serialVersionUID = -999999999999999999L;
    private int jenis;
    private String nama;
    private String alamat;
    private String noHP;
    private int lamasewa;
    private LocalDateTime waktuAwal;
    private LocalDateTime waktuAkhir;
    private BigDecimal biaya;
    private boolean keluar = false;
    public SewaAlatMusik(){
        
    }
    public SewaAlatMusik(int jenis, String nama, String alamat, String noHP, int lamasewa, 
            LocalDateTime waktuAwal, LocalDateTime waktuAkhir, BigDecimal biaya) {
        this.jenis = jenis;
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
        this.lamasewa = lamasewa;
        this.waktuAwal = waktuAwal;
        this.waktuAkhir = waktuAkhir;
        this.biaya = biaya;
    }

    public int getJenis() {
        return jenis;
    }

    public void setJenis(int jenis) {
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public int getLamasewa() {
        return lamasewa;
    }

    public void setLamasewa(int lamasewa) {
        this.lamasewa = lamasewa;
    }

    public LocalDateTime getWaktuAwal() {
        return waktuAwal;
    }

    public void setWaktuAwal(LocalDateTime waktuAwal) {
        this.waktuAwal = waktuAwal;
    }

    public LocalDateTime getWaktuAkhir() {
        return waktuAkhir;
    }

    public void setWaktuAkhir(LocalDateTime waktuAkhir) {
        this.waktuAkhir = waktuAkhir;
    }

    public BigDecimal getBiaya() {
        return biaya;
    }

    public void setBiaya(BigDecimal biaya) {
        this.biaya = biaya;
    }

    public boolean isKeluar() {
        return keluar;
    }

    public void setKeluar(boolean keluar) {
        this.keluar = keluar;
    }

    @Override
    public String toString(){
        return "Sewa{"+"jenis="+jenis+", nama="+nama+", alamat="+alamat+", noHP="+noHP+", lamaSewa="+lamasewa+", waktuAwal="+waktuAwal+", waktuAkhir="+waktuAkhir+", biaya="+biaya+", keluar="+keluar+"}";
    }
}
