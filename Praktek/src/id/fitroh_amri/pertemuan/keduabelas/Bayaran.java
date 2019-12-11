package id.fitroh_amri.pertemuan.keduabelas;

/**
 *
 * @author ASUS
 */
public class Bayaran {
    public int  hitungBayaran(Pegawai pegawai){
        int uang = pegawai.infogaji();
        if (pegawai instanceof Manager){
            uang += ((Manager)pegawai).infoTunjangan();
        }else if(pegawai instanceof Programmer) {
            uang += ((Programmer)pegawai).infoBonus();
        }
        return uang;
    }
    
    public static void main(String[] args) {
        Manager m = new Manager("Budi", 800, 50);
        Programmer p = new Programmer("Cecep", 600, 30);
         Bayaran upah = new Bayaran();
         System.out.println("Upah Manager : "+upah.hitungBayaran(m));
         System.out.println("Upah Programmer : "+upah.hitungBayaran(p));
    }
}
