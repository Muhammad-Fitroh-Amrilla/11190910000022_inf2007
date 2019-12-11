package id.fitroh_amri.pertemuan.keduabelas;

/**
 *
 * @author ASUS
 */
public class KalenderTest {
    public static String getTime(Kalender kalender) {
        return kalender.getTanggal()+"-"+kalender.getBulan()+"-"+kalender.getTahun();
    }
    public static void main(String[] args) {
        Kalender k = new Kalender(8);
        System.out.println("Waktu awal : "+getTime(k));
        k.setTanggal(9);
        System.out.println("1 Hari setelah waktu awal : " +getTime(k));
        k = new Kalender(6, 2021);
        System.out.println("waktu berubah : " +getTime(k));
        k.setBulan(7);
        System.out.println("1 bulan setelah itu : " +getTime(k));
        k = new Kalender(20, 10, 2022);
        System.out.println("waktu berubah : " +getTime(k));
        k.setTahun(2023);
        System.out.println("1 tahun setelah itu : "+getTime(k));
    }
}
