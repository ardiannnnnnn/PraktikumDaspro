package Jobsheet_9;

import java.util.Scanner;

public class pemesananCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar menu dan harga
        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                               "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};

        // Array untuk menyimpan jumlah pesanan tiap menu
        int[] daftarPesanan = new int[daftarMenu.length];

        double totalBayar = 0;
        int jumlahPesanan;

        System.out.print("Masukkan jumlah pesanan (ketik 0 untuk keluar): ");
        jumlahPesanan = sc.nextInt();
        sc.nextLine(); // membersihkan newline

        while (jumlahPesanan != 0) {
            for (int i = 0; i < jumlahPesanan; i++) {
                System.out.print("Masukkan menu ke-" + (i + 1) + ": ");
                String namaMenu = sc.nextLine();
                System.out.print("Masukkan jumlah: ");
                int jumlahItem = sc.nextInt();
                sc.nextLine(); // membersihkan newline

                // Linear search untuk mencari menu
                boolean ditemukan = false;
                for (int j = 0; j < daftarMenu.length; j++) {
                    if (daftarMenu[j].equalsIgnoreCase(namaMenu)) {
                        daftarPesanan[j] += jumlahItem;
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Menu \"" + namaMenu + "\" tidak tersedia di kafe.");
                }
            }

            // Hitung total harga
            totalBayar = 0;
            for (int i = 0; i < daftarMenu.length; i++) {
                totalBayar += daftarPesanan[i] * daftarHarga[i];
            }

            System.out.println("=================================");
            System.out.println("Daftar Pesanan Anda:");
            for (int i = 0; i < daftarMenu.length; i++) {
                if (daftarPesanan[i] > 0) {
                    System.out.println(daftarMenu[i] + " x" + daftarPesanan[i] + 
                                       " = Rp" + (daftarPesanan[i] * daftarHarga[i]));
                }
            }
            System.out.println("---------------------------------");
            System.out.println("Total yang harus dibayar: Rp" + totalBayar);
            System.out.println("=================================");

            System.out.print("\nMasukkan jumlah pesanan lagi (ketik 0 untuk keluar): ");
            jumlahPesanan = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nTerima kasih telah memesan di Kafe kami!");
        sc.close();
    }
}
