import java.util.Scanner;
public class Kafe120 {
    Scanner sc = new Scanner(System.in);    
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }

        switch (kodePromo) {
            case "DISKON50":
                System.out.println("Anda mendapatkan diskon 50%");
                break;
            case "DISKON30":
                System.out.println("Anda mendapatkan diskon 30%");
                break;
            default:
                System.out.println("Kode promo tidak valid");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp.15.000");
        System.out.println("2. Cappuccino - Rp.20.000");
        System.out.println("3. Latte      - Rp.22.000");
        System.out.println("4. Teh Tarik  - Rp.12.000");
        System.out.println("5. Roti Bakir - Rp.10.000");
        System.out.println("6. Mie Goreng - Rp.18.000");
        System.out.println("===========================");
        System.out.println("Silahkan Pilih Menu Yang Anda Inginkan : ");
    }
    public static void main(String[] args) {
        Menu("Naufal", true, "DISKON50"); 
    }
}

