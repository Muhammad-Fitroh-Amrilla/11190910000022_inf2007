package id.fitroh_amri.pertemuan.keduabelas;

/**
 *
 * @author ASUS
 */
public class Programmer extends Pegawai {
    private int bonus;
    
    public Programmer (String nama,int gaji,int bonus){
        super(nama,gaji);
        this.bonus=bonus;
    }
    
    public int infoGaji(){
        return this.gaji;
    }
    
    public int infoBonus(){
        return this.bonus;
    }
}
