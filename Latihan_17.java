/**
 *
 * @author user
 * NAMA     : Afsani Wahyu Mawardi
 * KELAS    : TI RegPagi
 * NIM      : 23215058
 * Dekskipsi 
 * Progam   : Progam ini untuk menampilkan Operato,If
 *          Progam Tunjangan
 */
import java.util.Scanner;

public class Latihan_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------Program Tunjangan=====------");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = scanner.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = scanner.next();

        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = gajiPokok*0.35;
        }

        double totalGaji = gajiPokok + tunjangan;

        System.out.println("\nHasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok\t: Rp " + gajiPokok);
        System.out.println("Tunjangan\t: Rp " + tunjangan);
        System.out.println("Total Gaji\t: Rp " + totalGaji);
        System.out.println("(Developed by : Rizki Adam Kurniawan)");
    }
}