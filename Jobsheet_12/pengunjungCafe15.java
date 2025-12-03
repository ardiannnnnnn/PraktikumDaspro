public class pengunjungCafe15 {
    static void daftarPengunjung(String...namaPengunjung){
        System.out.println("Daftar nama penguunjung: ");
        
        for (String nama : namaPengunjung) {
            System.out.println("- "+nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Andi");
        daftarPengunjung("Doni","Eti","Fahmi", "Galih");
        
    }
}
