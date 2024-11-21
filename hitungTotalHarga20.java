import java.util.Scanner;
public class hitungTotalHarga20 {
    Scanner sc = new Scanner(System.in);
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        
        switch (kodePromo) {
            case "DISKON50":
            System.out.println("Anda mendapatkan diskon 50%");
            return (int) (hargaTotal * 0.5);
            case "DISKON30":
            System.out.println("Anda mendapatkan diskon 50% dan ditambahkan diskon 30%");
            return (int) ((hargaTotal * 0.5) * 0.7);
            default:
            System.out.println("Kode promo tidak valid");
            return hargaTotal;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHarga = 0;
        
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan : ");
            int pilihanMenu = sc.nextInt();
            sc.nextLine();

            if (true) {
                System.out.print("Apakah ingin memesan lagi? (y/n) : ");
                String pilihan = sc.nextLine();

                while (pilihan.equals("y")) {
                    System.out.print("\nMasukkan nomor menu yang ingin anda pesan : ");
                    pilihanMenu = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Masukkan jumlah item yang ingin dipesan : ");
                    int banyakItem = sc.nextInt();
                    sc.nextLine();
            
                    System.out.print("Masukkan kode promo (DISKON50, DISKON30) : ");
                    String kodePromo = sc.nextLine();

                    System.out.print("Apakah ingin memesan lagi? (y/n) : ");
                    pilihan = sc.nextLine();

                    int hargaPesanan = hitungTotalHarga(pilihanMenu, banyakItem,kodePromo);
                    totalHarga += hargaPesanan;
                
                    System.out.println("Total harga untuk pesanan anda : Rp." + totalHarga);
                }
            }
        }
    }


