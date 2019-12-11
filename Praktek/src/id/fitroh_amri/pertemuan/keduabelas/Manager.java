package id.fitroh_amri.pertemuan.keduabelas;

/**
 *
 * @author ASUS
 */
public class Manager extends Pegawai{
    private int tunjangan;
    
    public Manager (String nama,int gaji,int tunjangan){
        super(nama,gaji);
        this.tunjangan=tunjangan;
    }
    
    public int infoGaji(){
        return this.gaji;
    }
    
    public int infoTunjangan(){
        return this.tunjangan;
    }
}
