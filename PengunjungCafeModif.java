import java.util.Scanner;
public class PengunjungCafeModif {
    Scanner sc = new Scanner(System.in);

    public static void daftarPengunjung(String namaUtama, int... usiaPengunjung) {
        System.out.println("Daftar Nama Pengunjung : " + namaUtama);
        
        for (int usia : usiaPengunjung) {
            System.out.println("- " + usia);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali",  19, 22, 25);
    }
}


