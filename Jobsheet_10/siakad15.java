package Jobsheet_10;

import java.util.Scanner;

public class siakad15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();

        System.out.print("Masukkan Jumlah Matkul: ");
        int jmlMatkul = sc.nextInt();

        int[][] nilai = new int[jmlMahasiswa][jmlMatkul];

        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.println("\nInput Nilai Mahasiswa Ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jmlMatkul; j++) {
                System.out.print("Nilai Mata Kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai Rata-Rata: " + (totalPerSiswa / jmlMatkul));
        }

        System.out.println("Rata-Rata Nilai Setiap Mata Kuliah: ");

        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jmlMahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + (totalPerMatkul / jmlMahasiswa));
        }
    }
}
