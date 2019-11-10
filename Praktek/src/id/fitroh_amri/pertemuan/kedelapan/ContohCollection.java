package id.fitroh_amri.pertemuan.kedelapan;

import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author FITROH_08
 */
public class ContohCollection {

    public static void main(String[] args) {
        System.out.println("--- list ---");
        List NamaList = new ArrayList();
        NamaList.add(1);
        NamaList.add(1);
        NamaList.add(2);
        for (int i = 0; i < NamaList.size(); i++) {
            System.out.println(NamaList.get(i));
        }

        System.out.println("--- Set ---");
        Set namaset = new HashSet();
        namaset.add(1);
        namaset.add(1);
        namaset.add(2);
        
        for (Object o : namaset) {
            System.out.println(o.toString());
        }

        System.out.println("--- Map ---");
        Map namaMap = new HashMap();
        namaMap.put(0, "1");
        namaMap.put(1, "2");
        namaMap.put(3, "3");
        namaMap.forEach((k, v) -> {
            System.out.println("Key : " + k + " Value :" + v);
        });
    }

}
