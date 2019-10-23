package id.fitroh_amri.pertemuan.keenam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author FITROH_08
 */
public class InputStreamReaderEx {
    public static void main(String[] args) {
        int bilangan;
        BufferedReader in = new BufferedReader (new
         InputStreamReader (System.in));
        System.out.println("Masukan bilangan: ");
        try {
            bilangan = Integer.parseInt(in.readLine());
            
            System.out.println("Bilangan " + bilangan);
        } catch (IOException ex) {
            System.out.println("error: " + ex.toString());
        }
    }
    
}
