import java.util.ArrayList;
import java.util.Scanner;

public class cafe15 {
    
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        switch (pilihanMenu) {
            case 1, 2, 3, 4, 5, 6:
                break; // valid
            default:
                System.out.println("Menu tidak valid!");
                return 0;
        }

        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static int applyPromo(int total, String kodePromo) {

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Diskon 50%");
            return total / 2;
        } 
        else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Diskon 30%");
            return (int)(total * 0.7);
        }

        System.out.println("Kode promo invalid! Tidak ada diskon.");
        return total;
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("Kode Promo: " + kodePromo);
        System.out.println();

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Budi", true, "DISKON30");

        ArrayList<Integer> totalPesanan = new ArrayList<>();

        String lanjut;

        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan : ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item yang ingin dipesan : ");
            int banyakItem = sc.nextInt();

            int totalSatuPesanan = hitungTotalHarga(pilihanMenu, banyakItem);
            totalPesanan.add(totalSatuPesanan);

            System.out.println("Total untuk pesanan ini : Rp" + totalSatuPesanan);

            System.out.print("Apakah Anda ingin memesan menu lain? (y/n): ");
            lanjut = sc.next();

        } while (lanjut.equalsIgnoreCase("y"));

        sc.nextLine(); 

        System.out.print("\nMasukkan kode promo (DISKON50 / DISKON30 / lainnya): ");
        String kodePromo = sc.nextLine();

        int totalKeseluruhan = 0;
        for (int harga : totalPesanan) {
            totalKeseluruhan += harga;
        }

        System.out.println("\nTotal sebelum promo : Rp" + totalKeseluruhan);

        int totalSetelahPromo = applyPromo(totalKeseluruhan, kodePromo);

        System.out.println("Total keseluruhan setelah promo : Rp" + totalSetelahPromo);
    }
}
