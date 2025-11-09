package Jobsheet_8;

import java.util.Scanner;

public class persegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai n (Niai n Minmal 3) : ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai Minimal n adalah 3");
        } else {

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print(n + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

        }
        sc.close();
    }

}
