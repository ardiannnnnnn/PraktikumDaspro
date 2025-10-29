import java.util.Scanner;

public class KafeDoWhileNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaPelanggan;
        int teh=0, kopi=0, roti=0, totalHarga;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        
        do{
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan =sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.println("Jumlah Kopi : ");
            kopi = sc.nextInt();
            System.out.println("jumlah Teh :");
            teh = sc.nextInt();
            System.out.println("jumlah Roti : ");
            roti = sc.nextInt();
            
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("total yang harus dibayar : Rp " + totalHarga);
            sc.nextLine();
        }while(true);

        System.out.println("Semua transaksi selesai.");
    }
}
