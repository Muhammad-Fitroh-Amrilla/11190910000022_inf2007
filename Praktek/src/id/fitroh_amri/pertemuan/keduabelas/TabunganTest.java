 package id.fitroh_amri.pertemuan.keduabelas;

/**
 *
 * @author ASUS
 */
public class TabunganTest {
    public static void main(String[] args) {
        Tabungan t = new Tabungan(5000);
        System.out.println("Saldo awal : "+t.saldo);
        t.ambilUang(2300);
        System.out.println("Jumlah uang yang diambil : 2300");
        System.out.println("Saldo sekarang : "+ t.saldo);
    }
}
