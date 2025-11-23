package Jobsheet_10;

import java.util.Scanner;

public class survey15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] survey = new int[10][6]; 
        System.out.println("=== INPUT HASIL SURVEI ===");

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Nilai pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        
        System.out.println("\n=== RATA-RATA SETIAP RESPONDEN ===");

        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            double rata = total / 6;
            System.out.println("Responden " + (i + 1) + ": " + rata);
        }

        System.out.println("\n=== RATA-RATA SETIAP PERTANYAAN ===");

        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }
            double rata = total / 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata);
        }


        
        System.out.println("\n=== RATA-RATA KESELURUHAN ===");

        double totalAll = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalAll += survey[i][j];
            }
        }

        double rataAll = totalAll / 60; 

        System.out.println("Rata-rata keseluruhan: " + rataAll);

        sc.close();
    }
}
