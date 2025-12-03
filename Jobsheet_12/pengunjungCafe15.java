public class pengunjungCafe15 {
    static void daftarPengunjung(String...namaPengunjung){
        System.out.println("DAftar nama penguunjung: ");
        for (int i = 0 ; i < namaPengunjung.length; i++) {
            System.out.println("- "+namaPengunjung[i]);
        }
        
    }
    public static void main(String[] args) {
        daftarPengunjung("Andi");
        daftarPengunjung("Doni","Eti","Fahmi", "Galih");
        
    }
}
