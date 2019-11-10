package id.fitroh_amri.pertemuan.kedelapan;

/**
 *
 * @author FITROH_08
 */
public class Mahasiswa {
private int nim;
private String nama;
private double nilai;

    public Mahasiswa(int nim, String nama, double nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

   

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}
