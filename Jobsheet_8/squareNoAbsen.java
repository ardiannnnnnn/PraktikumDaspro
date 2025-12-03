package Jobsheet_8;

import java.util.Scanner;

public class squareNoAbsen {
     public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai N = ");
        int N = sc.nextInt();

        
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
