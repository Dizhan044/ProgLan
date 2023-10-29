import java.util.Scanner;

/**
 * Program KonversiJarak adalah aplikasi sederhana yang mengkonversi jarak dari satu unit ke unit lainnya.
 * Ini mendukung konversi antara kilometer (km), mil (mi), dan meter (m).
 */
public class KonversiJarak {
    /**
     * Metode utama program. Menerima input jarak, unit awal, dan unit tujuan,
     * kemudian menghitung dan mencetak hasil konversi.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak: ");
        double jarak = input.nextDouble();
        input.nextLine();

        System.out.print("Dari unit (km/mi/m): ");
        String dariUnit = input.nextLine().toLowerCase();

        System.out.print("Ke unit (km/mi/m): ");
        String keUnit = input.nextLine().toLowerCase();

        double hasilKonversi = 0;

        if (dariUnit.equals("km") && keUnit.equals("mi")) {
            hasilKonversi = jarak * 0.621371;
        } else if (dariUnit.equals("mi") && keUnit.equals("km")) {
            hasilKonversi = jarak * 1.60934;
        } else if (dariUnit.equals("km") && keUnit.equals("m")) {
            hasilKonversi = jarak * 1000;
        } else if (dariUnit.equals("m") && keUnit.equals("km")) {
            hasilKonversi = jarak * 0.001;
        } else if (dariUnit.equals("mi") && keUnit.equals("m")) {
            hasilKonversi = jarak * 1609.34;
        } else if (dariUnit.equals("m") && keUnit.equals("mi")) {
            hasilKonversi = jarak * 0.000621371;
        } else {
            System.out.println("Unit jarak tidak valid");
            System.exit(0);
        }

        System.out.println(jarak + " " + dariUnit + " sama dengan " + hasilKonversi + " " + keUnit);
    }
}
