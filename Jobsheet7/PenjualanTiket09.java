import java.util.Scanner;

public class PenjualanTiket09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int HARGA_TIKET = 50000;
        int totalTiket = 0, jumlahBeli;
        double totalPendapatan = 0;

        System.out.println("=== SISTEM PENJUALAN TIKET BIOSKOP ===");

        while (true) {
            System.out.print("\nMasukkan jumlah tiket yang dibeli (0 untuk keluar): ");
            jumlahBeli = input.nextInt();

            if (jumlahBeli == 0) {
                System.out.println("Input dihentikan.");
                break;
            }

            if (jumlahBeli < 0) {
                System.out.println("Jumlah tiket tidak valid! Coba lagi.");
                continue;
            }

            // hitung harga total dan diskon
            double hargaSebelumDiskon = jumlahBeli * HARGA_TIKET;
            double potongan = 0;

            if (jumlahBeli > 10) {
                potongan = hargaSebelumDiskon * 0.15;
                System.out.println("Anda mendapatkan diskon 15%!");
            } else if (jumlahBeli > 4) {
                potongan = hargaSebelumDiskon * 0.10;
                System.out.println("Anda mendapatkan diskon 10%!");
            } else {
                System.out.println("Tidak ada diskon untuk pembelian ini.");
            }

            double hargaAkhir = hargaSebelumDiskon - potongan;

            // tampilkan hasil transaksi
            System.out.println("Harga sebelum diskon : Rp " + (int) hargaSebelumDiskon);
            System.out.println("Potongan harga       : Rp " + (int) potongan);
            System.out.println("Total yang harus dibayar : Rp " + (int) hargaAkhir);

            // akumulasi total
            totalTiket += jumlahBeli;
            totalPendapatan += hargaAkhir;
        }

        // tampilkan ringkasan akhir
        System.out.println("\n=== LAPORAN PENJUALAN HARI INI ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total pendapatan    : Rp " + (int) totalPendapatan);
    }
}
