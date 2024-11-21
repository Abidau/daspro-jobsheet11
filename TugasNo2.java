import java.util.Scanner;
public class TugasNo2 {
    static int[][] salesData = {
        {20, 20, 25, 20, 10, 60, 10}, 
        {30, 80, 40, 10, 25, 10, 25}, 
        {5, 9, 20, 25, 10, 35, 45},   
        {50, 8, 17, 18, 10, 30, 6},   
        {15, 10, 16, 15, 10, 10, 55}  
    };

    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        public static void tampilkanSeluruhData() {
            System.out.println("Data Penjualan:");
            for (int i = 0; i < salesData.length; i++) {
                System.out.print(menu[i] + ": ");
                    for (int j = 0; j < salesData[i].length; j++) {
                    System.out.print(salesData[i][j] + " ");
                }
            System.out.println();
        }
    }

    public static void tampilkanPerHari() {
        System.out.println("\nData Penjualan dari Hari Pertama hingga Hari Terakhir:");
        for (int j = 0; j < salesData[0].length; j++) {
            System.out.print("Hari ke-" + (j + 1) + ": ");
            for (int i = 0; i < salesData.length; i++) {
                System.out.print(menu[i] + " (" + salesData[i][j] + ") ");
            }
            System.out.println();
        }
    }

    public static void menuPenjualanTertinggi() {
        int maxMenuIndex = 0;
        int maxPenjualan = 0;

        for (int i = 0; i < salesData.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                totalPenjualan += salesData[i][j];
            }

            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                maxMenuIndex = i;
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi adalah: " + menu[maxMenuIndex] + " dengan total penjualan: " + maxPenjualan);
    }

    public static void rataRataPenjualan() {
        System.out.println("\nRata-rata penjualan untuk setiap menu:");
        for (int i = 0; i < salesData.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                totalPenjualan += salesData[i][j];
            }
            double rataRata = (double) totalPenjualan / salesData[i].length;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tampilkan seluruh data penjualan");
            System.out.println("2. Tampilkan penjualan hari terakhir (Hari ke-7)");
            System.out.println("3. Tampilkan menu dengan penjualan tertinggi");
            System.out.println("4. Tampilkan rata-rata penjualan untuk setiap menu");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhData();
                    break;
                case 2:
                    tampilkanPerHari();
                    break;
                case 3:
                    menuPenjualanTertinggi();
                    break;
                case 4:
                    rataRataPenjualan();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
