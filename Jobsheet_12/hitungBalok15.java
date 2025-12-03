
import java.util.Scanner;

public class hitungBalok15 {

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan Panjang ");
        p = input.nextInt();

        System.out.print("Masukkan Lebar ");
        l = input.nextInt();

        System.out.print("Masukkan tinggi ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);
        vol = hitungVolume(t, p, l);
        System.out.print("Volume balok adalah " + vol);

        input.close();

    }
}
