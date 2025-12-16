package Jobsheet_13;

import java.util.Scanner;

public class beasiswa15 {

    //maksimal data
    static final int MAX = 100;

    //array pendaftar
    static String[] nama = new String[MAX];
    static String[] nim = new String[MAX];
    static double[] ipk = new double[MAX];
    static String[] jenis = new String[MAX];
    static int[] penghasilan = new int[MAX];

    static int jumlahData = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n----- MENU UTAMA -----");
            System.out.println("1. Tambah Data Pendaftar");
            System.out.println("2. Tampilkan Semua Data");
            System.out.println("3. Cari Data Berdasarkan Jenis Beasiswa");
            System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambahData(sc);
                    break;

                case 2:
                    tampilkanSemua();
                    break;

                case 3:
                    cariDataPerJenis(sc);
                    break;

                case 4:
                    hitungRataIpk();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

    }

    // -------------------------------------------
    // FUNGSI 1: Tambah Data
    // -------------------------------------------
    public static void tambahData(Scanner sc) {

        if (jumlahData >= MAX) {
            System.out.println("Data sudah penuh!");
            return;
        }

        System.out.print("Nama mahasiswa: ");
        nama[jumlahData] = sc.nextLine();

        System.out.print("NIM: ");
        nim[jumlahData] = sc.nextLine();

        System.out.print("IPK: ");
        ipk[jumlahData] = sc.nextDouble();
        sc.nextLine();

        // Validasi jenis beasiswa
        String jb;
        while (true) {
            System.out.print("Jenis beasiswa (Reguler/Unggulan/Riset): ");
            jb = sc.nextLine();
            if (jb.equalsIgnoreCase("Reguler")
                    || jb.equalsIgnoreCase("Unggulan")
                    || jb.equalsIgnoreCase("Riset")) {
                break;
            }
            System.out.println("Jenis beasiswa tidak valid!");
        }
        jenis[jumlahData] = jb;

        // Validasi penghasilan
        int gaji;
        while (true) {
            System.out.print("Penghasilan orang tua (maks 2000000): ");
            gaji = sc.nextInt();
            if (gaji <= 2000000) {
                break;
            }
            System.out.println("Penghasilan melebihi batas!");
        }
        penghasilan[jumlahData] = gaji;

        jumlahData++;
        System.out.println("Data berhasil ditambahkan!");
    }

    // -------------------------------------------
    // FUNGSI 2: Tampilkan Semua Data
    // -------------------------------------------
    public static void tampilkanSemua() {
        if (jumlahData == 0) {
            System.out.println("Tidak ada data.");
            return;
        }

        System.out.println("\n=== DATA PENDAFTAR BEASISWA ===");
        System.out.printf("%-20s %-12s %-5s %-10s %-10s\n",
                "Nama", "NIM", "IPK", "Jenis", "Gaji");

        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("%-20s %-12s %-5.2f %-10s %-10d\n",
                    nama[i], nim[i], ipk[i], jenis[i], penghasilan[i]);
        }
    }

    // -------------------------------------------
    // FUNGSI 3: Cari Data Berdasarkan Jenis
    // -------------------------------------------
    public static void cariDataPerJenis(Scanner sc) {
        if (jumlahData == 0) {
            System.out.println("Tidak ada data.");
            return;
        }

        System.out.print("Masukkan jenis beasiswa yang dicari: ");
        String cari = sc.nextLine();

        System.out.println("\nHasil pencarian untuk: " + cari);
        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {
            if (jenis[i].equalsIgnoreCase(cari)) {
                System.out.printf("%-20s %-12s %-5.2f %-10s %-10d\n",
                        nama[i], nim[i], ipk[i], jenis[i], penghasilan[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada data dengan jenis tersebut.");
        }
    }

    // -------------------------------------------
    // FUNGSI 4: Hitung Rata-rata IPK
    // -------------------------------------------
    public static void hitungRataIpk() {
        if (jumlahData == 0) {
            System.out.println("Tidak ada data.");
            return;
        }

        hitungRata("Reguler");
        hitungRata("Unggulan");
        hitungRata("Riset");
    }

    public static void hitungRata(String jenisBea) {
        double total = 0;
        int count = 0;

        for (int i = 0; i < jumlahData; i++) {
            if (jenis[i].equalsIgnoreCase(jenisBea)) {
                total += ipk[i];
                count++;
            }
        }

        if (count > 0) {
            System.out.printf("Rata-rata IPK %s: %.2f\n", jenisBea, total / count);
        } else {
            System.out.printf("Tidak ada pendaftar untuk beasiswa %s\n", jenisBea);
        }
    }
}
