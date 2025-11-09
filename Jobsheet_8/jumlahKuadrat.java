package Jobsheet_8;

import java.util.Scanner;

public class jumlahKuadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int n = 1; n <= 5; n++) {
            int jumlah = 0;
            System.out.print("n = " + n + " → jumlah kuadrat = ");

            for (int i = 1; i <= n; i++) {
                int kuadrat = i * i;
                jumlah += kuadrat;
                System.out.print(kuadrat);

                if (i < n) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + jumlah);
        }
    }
}
