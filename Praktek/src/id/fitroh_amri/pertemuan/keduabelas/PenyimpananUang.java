package id.fitroh_amri.pertemuan.keduabelas;

/**
 *
 * @author ASUS
 */
public class PenyimpananUang extends Tabungan{
    private double tingkatBunga;

    public PenyimpananUang(int saldo,double tingkatBunga) {
        super(saldo);
        this.tingkatBunga=tingkatBunga;
    }
    
    public double cekUang (){
        this.saldo= (int) (saldo + (saldo*tingkatBunga));
        return this.saldo;
    }
}
