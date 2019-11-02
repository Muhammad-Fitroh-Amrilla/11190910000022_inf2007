package id.fitroh_amri.pertemuan.ketujuh;

/**
 *
 * @author FITROH_08
 */
public class Kabisat {

    private int th;

    public boolean Kabisat(int th) {
        if ((th % 4 == 0) && (th % 100 != 0) || (th % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}
