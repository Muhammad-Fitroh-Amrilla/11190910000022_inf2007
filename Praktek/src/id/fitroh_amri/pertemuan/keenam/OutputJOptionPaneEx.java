package id.fitroh_amri.pertemuan.keenam;

import javax.swing.JOptionPane;

/**
 *
 * @author FITROH_08
 */
public class OutputJOptionPaneEx {
    public static void main(String[] args) {
        int bilangan;
        String box =JOptionPane.showInputDialog("Masukan bilangan: ");
        bilangan = Integer.parseInt (box);
        
        JOptionPane.showMessageDialog(null,"Bilangan " + bilangan,
                "Hasil input", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
