package id.fitroh_amri.pertemuan.ketujuh;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class SegitigaParameter {

    private float alas, tinggi, luas;
    

    public SegitigaParameter (float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void getLuas() {
        luas = (alas * tinggi) / 2;
        System.out.println("Luas = " + luas);

    }
}

