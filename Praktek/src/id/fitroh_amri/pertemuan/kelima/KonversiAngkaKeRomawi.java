package id.fitroh_amri.pertemuan.kelima;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class KonversiAngkaKeRomawi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka = 0;
        while (angka != -1) {
            do {
                angka = in.nextInt();
                if (angka < -1 || angka > 50000000) {
                    System.out.print("Error");
                } else {
                    while (angka >= 1000) {
                        System.out.print("M");
                        angka = angka - 1000;
                    }
                    if (angka >= 500) {
                        if (angka >= 900) {
                            System.out.print("CM");
                            angka = angka - 900;
                        } else {
                            System.out.print("D");
                            angka = angka - 500;
                        }
                    }
                    while (angka >= 100) {
                        if (angka >= 400) {
                            System.out.print("CD");
                            angka = angka - 400;
                        } else {
                            System.out.print("C");
                            angka = angka - 100;
                        }
                    }
                    if (angka >= 50) {
                        if (angka >= 90) {
                            System.out.print("XC");
                            angka = angka - 90;
                        } else {
                            System.out.print("L");
                            angka = angka - 50;
                        }
                    }
                    while (angka >= 10) {
                        if (angka >= 40) {
                            System.out.print("XL");
                            angka = angka - 40;
                        } else {
                            System.out.print("X");
                            angka = angka - 10;
                        }
                    }
                    if (angka >= 5) {
                        if (angka == 9) {
                            System.out.print("IX");
                            angka = angka - 9;
                        } else {
                            System.out.print("V");
                            angka = angka - 5;
                        }
                    }
                    while (angka >= 1) {
                        if (angka == 4) {
                            System.out.print("IV");
                            angka = angka - 4;
                        } else {
                            System.out.print("I");
                            angka = angka - 1;
                        }

                    }
                }
                System.out.println("");
            } while (angka == 1);
        }
    }

}
