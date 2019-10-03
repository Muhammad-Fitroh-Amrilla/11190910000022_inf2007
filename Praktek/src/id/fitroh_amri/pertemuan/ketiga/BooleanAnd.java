package id.fitroh_amri.pertemuan.ketiga;

/**
 *
 * @author FITROH_08
 */
public class BooleanAnd {
    public static void main (String args[]){
        int a = 8, b = 7;
        if ((a < 2) & (b++ < 10)){
            b += 2;
        }
        System.out.println(b);
    }
}
