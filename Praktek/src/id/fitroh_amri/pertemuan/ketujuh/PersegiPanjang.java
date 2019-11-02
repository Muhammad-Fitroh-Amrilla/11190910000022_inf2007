package id.fitroh_amri.pertemuan.ketujuh;

/**
 *
 * @author FITROH_08
 */
public class PersegiPanjang {

    private double panjang;
    private double lebar;

    public PersegiPanjang() {
        System.out.println("Konstruktor persegi panjang");
    }
    public PersegiPanjang(double panjang, double lebar){
    this.panjang  = panjang;
    this.lebar = lebar;    
    }
    public double getLuas(){
        return panjang * lebar;
    }
    public double getKeliling(){
        return 2*(panjang+lebar);
    }
    public void getInfo(){
        System.out.println("Kelas persegi panjang");
    }
}

