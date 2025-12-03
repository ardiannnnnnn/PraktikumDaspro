import java.util.Scanner;

public class recapPenjualanCafe {
    public static void inputData(int[][] data, int jumlahMenu, int jumlahHari) {
        Scanner sc = new Scanner(System.in);
        String[] namaMenu = new String[jumlahMenu];

        
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i+1) + ": ");
            namaMenu[i] = sc.nextLine();
        }

        
        for (int hari = 0; hari < jumlahHari; hari++) {
            System.out.println("\n--- Hari " + (hari+1) + " ---");
            for (int menu = 0; menu < jumlahMenu; menu++) {
                System.out.print("Penjualan " + namaMenu[menu] + ": ");
                data[menu][hari] = sc.nextInt();
            }
        }
    }

    public static void tampilData(int[][] data, String[] namaMenu, int jumlahMenu, int jumlahHari) {
        System.out.println("\n--- REKAP PENJUAL---");
        System.out.print("Hari\t");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print(namaMenu[i] + "\t");
        }
        System.out.println();

        for (int hari = 0; hari < jumlahHari; hari++) {
            System.out.print((hari+1) + "\t");
            for (int menu = 0; menu < jumlahMenu; menu++) {
                System.out.print(data[menu][hari] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuTertinggi(int[][] data, String[] namaMenu, int jumlahMenu, int jumlahHari) {
        int[] totalMenu = new int[jumlahMenu];

        for (int menu = 0; menu < jumlahMenu; menu++) {
            for (int hari = 0; hari < jumlahHari; hari++) {
                totalMenu[menu] += data[menu][hari];
            }
        }

        int maxPenjualan = totalMenu[0];
        String menuTerlaris = namaMenu[0];

        for (int i = 1; i < jumlahMenu; i++) {
            if (totalMenu[i] > maxPenjualan) {
                maxPenjualan = totalMenu[i];
                menuTerlaris = namaMenu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTerlaris + " (" + maxPenjualan + ")");
    }

    public static void rataRataMenu(int[][] data, String[] namaMenu, int jumlahMenu, int jumlahHari) {
        System.out.println("\n----- RATA-RATA PENJUALAN PER MENU -----");
        for (int menu = 0; menu < jumlahMenu; menu++) {
            int total = 0;
            for (int hari = 0; hari < jumlahHari; hari++) {
                total += data[menu][hari];
            }
            double rataRata = (double) total / jumlahHari;
            System.out.printf("Rata-rata %s: %.2f\n", namaMenu[menu], rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine(); 

        int[][] penjualan = new int[jumlahMenu][jumlahHari];
        String[] namaMenu = new String[jumlahMenu];

       
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i+1) + ": ");
            namaMenu[i] = sc.nextLine();
        }

        
        for (int hari = 0; hari < jumlahHari; hari++) {
            System.out.println("\n--- Hari " + (hari+1) + " ---");
            for (int menu = 0; menu < jumlahMenu; menu++) {
                System.out.print("Penjualan " + namaMenu[menu] + ": ");
                penjualan[menu][hari] = sc.nextInt();
            }
        }

        tampilData(penjualan, namaMenu, jumlahMenu, jumlahHari);
        menuTertinggi(penjualan, namaMenu, jumlahMenu, jumlahHari);
        rataRataMenu(penjualan, namaMenu, jumlahMenu, jumlahHari);

        sc.close();
    }
}
