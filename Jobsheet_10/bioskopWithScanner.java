package Jobsheet_10;

import java.util.Scanner;
public class bioskopWithScanner {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[10][9];
        int menu;

        do {
            System.out.println("\n=== Menu Bioskop ===");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {

                case 1:

                    while (true) {
                        System.out.print("Masukkan Nama Penonton: ");
                        String nama = sc.nextLine();

                        int baris, kolom;

                        while (true) {
                            System.out.print("Masukkan Baris (1-10): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan Kolom (1-9): ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if (baris < 1 || baris > 10 || kolom < 1 || kolom > 9) {
                                System.out.println("Kursi Tidak Tersedia, Coba Lagi");
                                continue;
                            }

                            if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi Sudah Terisi, Silahkan Pilih Ulang!!");
                            } else {
                                break;
                            }
                        }

                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data Penonton Berhasil Disimpan!!");

                        System.out.print("Input Penonton Lainnya? (y/n): ");
                        String next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }

                    break;

                case 2:

                    System.out.println("\n === Daftar Penonton ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print(" - ");
                            } else {
                                System.out.print(penonton[i][j] + " ");
                            }
                        }

                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("\n === Keluar Dari Program ===");
                    break;

                default:
                    System.out.println("Menu Tidak Tersedia! Pilih Angka 1-3.");
            }
        } while (menu != 3);
    }
}
