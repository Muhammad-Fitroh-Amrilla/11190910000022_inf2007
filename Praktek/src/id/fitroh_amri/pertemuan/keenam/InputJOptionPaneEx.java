package id.fitroh_amri.pertemuan.keenam;

import javax.swing.JOptionPane;

/**
 *
 * @author FITROH_08
 */
public class InputJOptionPaneEx {
    public static void main(String[] args) {
        int bilangan;
        String box =JOptionPane.showInputDialog("Masukan bilangan: ");
        bilangan = Integer.parseInt (box);
        System.out.println("Bilangan "+ bilangan);
    }
    
}
