package id.fitroh_amri.pertemuan.ketiga;

import java.util.Scanner;

/**
 *
 * @author FITROH_08
 */
public class KonversiJarak {
  public static void main(String args[]) {
      int jarak, km, cm, m, sisajarak;
      int m1 = 100, km1 = 100000;
      
      Scanner in = new Scanner(System.in);
      jarak = in.nextInt();
        km = jarak/km1;
        sisajarak = jarak % km1;
        m = sisajarak/m1;
        sisajarak = jarak % m1;
        cm = sisajarak;
        
         System.out.println(km + " km " + m + " m " + cm + " cm ");
        
                
              
  }  
}
