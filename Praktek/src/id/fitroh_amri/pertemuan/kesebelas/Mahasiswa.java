package id.fitroh_amri.pertemuan.kesebelas;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ASUS
 */
public class Mahasiswa implements Serializable{
    private static final long serialVersionUID = 1L;
 private String NIM;
    private String Nama;
    private String KodeMK;
    private int SKS;
    private char Nilai;    

    public Mahasiswa() {
    }

    public Mahasiswa(String NIM, String Nama, String KodeMK, int SKS, char Nilai) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.KodeMK = KodeMK;
        this.SKS = SKS;
        this.Nilai = Nilai;
    }
    
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getKodeMK() {
        return KodeMK;
    }

    public void setKodeMK(String KodeMK) {
        this.KodeMK = KodeMK;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public char getNilai() {
        return Nilai;
    }

    public void setNilai(char Nilai) {
        this.Nilai = Nilai;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "NIM=" + NIM + ", Nama=" + Nama + ", KodeMK=" +
                KodeMK + ", SKS=" + SKS + ", Nilai=" + Nilai + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.NIM);
        hash = 79 * hash + Objects.hashCode(this.Nama);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mahasiswa other = (Mahasiswa) obj;
        if (!Objects.equals(this.NIM, other.NIM)) {
            return false;
        }
        if (!Objects.equals(this.Nama, other.Nama)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
