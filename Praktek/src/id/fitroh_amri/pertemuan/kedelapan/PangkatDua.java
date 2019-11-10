package id.fitroh_amri.pertemuan.kedelapan;

/**
 *
 * @author FITROH_08
 */
public class PangkatDua {
     public static void main(String[] args) {
        int [] pangkat = new int [10];
        int i, k = 0;
        for (i = 0; i < 10; i++) {
                k = i + 1;
                pangkat[i]=k*k;
                System.out.println("Pangkat Dua dari "+(i+1)+ " = "+pangkat[i]);
            }
    }
}
