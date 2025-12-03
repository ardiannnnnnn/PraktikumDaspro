import java.util.Scanner;

public class nilaiMahasiswa {
    public static void isianArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
    }
    
    public static void tampilArray(int[] arr) {
        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nilai ke-" + (i+1) + ": " + arr[i]);
        }
    }
    
    public static int hitTot(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();
        int[] nilai = new int[N];
        
        isianArray(nilai);
        tampilArray(nilai);
        int totalNilai = hitTot(nilai);
        
        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);
        
        sc.close();
    }
}
