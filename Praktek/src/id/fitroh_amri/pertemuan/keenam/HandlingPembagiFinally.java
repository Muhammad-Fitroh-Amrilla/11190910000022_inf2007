package id.fitroh_amri.pertemuan.keenam;

/**
 *
 * @author FITROH_08
 */
public class HandlingPembagiFinally {
    public static void main(String[] args) {
        try{
            int a = 10, b = 0, c = a / b;
            System.out.println("Hasil: " + c);
        }catch (Throwable error){
            System.out.print("Ups, terjadi error: ");
            System.out.println(error.getMessage());
        }finally{
            System.out.println("Pasti akan dijalankan");
        }
    }
}
