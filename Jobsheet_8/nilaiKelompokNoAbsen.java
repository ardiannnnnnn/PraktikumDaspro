package Jobsheet_8;

import java.util.Scanner;

public class nilaiKelompokNoAbsen{
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nilai, totalNilai, rataNilai, rataTertinggi = 0;
        int kelompokTertinggi = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukan Nilai ke-" + j + ":");
                nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-Rata : " + rataNilai);

            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

        }

        System.out.println("Kelompok Dengan Rata-Rata Tertinggi Adalah Kelompok : " + kelompokTertinggi);
        System.out.println("Dengan Rata-Rata Nilai : " + rataTertinggi);
        sc.close();
    }
}