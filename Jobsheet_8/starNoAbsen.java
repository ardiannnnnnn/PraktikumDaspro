package Jobsheet_8;

import java.util.Scanner;

public class starNoAbsen {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.print("*");
        }

    }
}
