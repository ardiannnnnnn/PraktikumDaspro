
import java.util.Scanner;

public class kubus15 {
    
    public static int volumeKubus(int sisi){
        return sisi * sisi * sisi;
    }

    public static int luasPermukaanKubus(int sisi){
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus : ");
        int sisi = sc.nextInt();

        int volume = volumeKubus(sisi);
        int luasPermukaan = luasPermukaanKubus(sisi);

        System.out.println("Volume kubus : " + volume);
        System.out.println("Luas permukaan kubus : "+ luasPermukaan);

        sc.close();
    }
}
