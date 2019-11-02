package id.fitroh_amri.pertemuan.ketujuh;


import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class AplikasiJarak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X1, X2, Y1,Y2;
        System.out.println("Masukan nilai x1");
        X1 = in.nextInt();
        System.out.println("Masukan nilai x2");
        X2 = in.nextInt();
        System.out.println("Masukan nilai y1");
        Y1 = in.nextInt();
        System.out.println("Masukan nilai y2");
        Y2 = in.nextInt();
        Jarak jarak = new Jarak();
        System.out.println("jarak titik 1 dengan titik 2 = "+(jarak.Jarak(X1,X2,Y1,Y2)));
    }
    
}
