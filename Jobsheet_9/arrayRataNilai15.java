package Jobsheet_9;

import java.util.Scanner;

public class arrayRataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlah = sc.nextInt();

        int[] arrNilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang akan dicari: ");
        int key = sc.nextInt();

        int hasil = -1;
        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke- " + (hasil + 1));
        } else {
            System.out.println("\nNilai yang dicari tidak ditemukan.");
        }
        sc.close();
    }
}
