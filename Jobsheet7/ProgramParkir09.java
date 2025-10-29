import java.util.Scanner;

public class ProgramParkir09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenisKendaraan, durasi;
        int totalBayar = 0;

        System.out.println("=== PROGRAM PARKIR KENDARAAN ===");

        do {
            System.out.print("\nMasukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Selesai): ");
            jenisKendaraan = input.nextInt();

            if (jenisKendaraan == 0) {
                System.out.println("Input selesai. Menghitung total pembayaran...");
                break;
            }

            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Jenis kendaraan tidak valid! Coba lagi.");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = input.nextInt();

            if (durasi <= 0) {
                System.out.println("Durasi parkir tidak valid! Masukkan angka lebih dari 0.");
                continue;
            }

            int biaya = 0;

            if (durasi > 5) {
                biaya = 12500;
            } else if (jenisKendaraan == 1) {
                biaya = durasi * 3000; // mobil
            } else {
                biaya = durasi * 2000; // motor
            }

            totalBayar += biaya;

            System.out.println("Biaya parkir kendaraan ini: Rp " + biaya);
        } while (true);

        System.out.println("\n=== RINGKASAN PARKIR HARI INI ===");
        System.out.println("Total pendapatan parkir: Rp " + totalBayar);

        input.close();
    }
}
