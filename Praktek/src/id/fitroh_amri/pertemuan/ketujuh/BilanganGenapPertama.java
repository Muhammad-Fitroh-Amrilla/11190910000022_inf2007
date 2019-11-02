package id.fitroh_amri.pertemuan.ketujuh;

/**
 *
 * @author FITROH_08
 */
public class BilanganGenapPertama {

    private int N, jumlah,i, angka;
    

    public void BilanganGenapPertama(int N){
        this.N=N;
        for (i = 1; i <= N; i++) {
             jumlah = jumlah + angka;
             angka = angka + 2;
            }
        System.out.println("Jumlah bilangan genap pertama = "+ jumlah);
    }

}
