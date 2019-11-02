package id.fitroh_amri.pertemuan.ketujuh;

import static java.lang.Math.sqrt;


/**
 *
 * @author FITROH_08
 */
public class Jarak {

    private int x1, x2, y1, y2, jarak;
    public int Jarak(int x1, int x2, int y1, int y2) {
        return jarak = (int) sqrt (((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
    }
}
