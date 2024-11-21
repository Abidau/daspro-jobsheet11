import java.util.Scanner;
public class ModifPer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp.15.000");
        System.out.println("2. Cappuccino - Rp.20.000");
        System.out.println("3. Latte      - Rp.22.000");
        System.out.println("4. Teh Tarik  - Rp.12.000");
        System.out.println("5. Roti Bakar - Rp.10.000");
        System.out.println("6. Mie Goreng - Rp.18.000");
        System.out.println("===========================");
        System.out.print("Silahkan Pilih Menu Yang Anda Inginkan: ");
        int pilihanMenu = sc.nextInt();

        switch (pilihanMenu) {
            case 1:
                System.out.println("Anda memilih Kopi Hitam dengan harga Rp.15.000.");
                break;
            case 2:
                System.out.println("Anda memilih Cappuccino dengan harga Rp.20.000.");
                break;
            case 3:
                System.out.println("Anda memilih Latte dengan harga Rp.22.000.");
                break;
            case 4:
                System.out.println("Anda memilih Teh Tarik dengan harga Rp.12.000.");
                break;
            case 5:
                System.out.println("Anda memilih Roti Bakar dengan harga Rp.10.000.");
                break;
            case 6:
                System.out.println("Anda memilih Mie Goreng dengan harga Rp.18.000.");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        sc.close();
    }
}
