import java.util.Scanner;

public class ModifTugasNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = sc.nextInt();

        int[][] scores = new int[jumlahMahasiswa][jumlahTugas];
        String[] mahasiswa = new String[jumlahMahasiswa];

        System.out.println("\nMasukkan data mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nama Mahasiswa " + (i + 1) + ": ");
            sc.nextLine(); 
            mahasiswa[i] = sc.nextLine();

            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Nilai Tugas " + (j + 1) + " untuk " + mahasiswa[i] + ": ");
                scores[i][j] = sc.nextInt();
            }
        }

        tampilkanNilaiMahasiswa(mahasiswa, scores);

        rataRataNilaiPerMahasiswa(mahasiswa, scores);

        rataRataNilaiPerTugas(jumlahTugas, mahasiswa, scores);

        sc.close();
    }

    public static void tampilkanNilaiMahasiswa(String[] mahasiswa, int[][] scores) {
        System.out.println("\nData Nilai Mahasiswa:");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print(mahasiswa[i] + ": ");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rataRataNilaiPerMahasiswa(String[] mahasiswa, int[][] scores) {
        System.out.println("\nRata-rata Nilai Per Mahasiswa:");
        for (int i = 0; i < mahasiswa.length; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double rataRata = (double) total / scores[i].length;
            System.out.println(mahasiswa[i] + ": " + rataRata);
        }
    }

    public static void rataRataNilaiPerTugas(int jumlahTugas, String[] mahasiswa, int[][] scores) {
        System.out.println("\nRata-rata Nilai Per Tugas:");
        for (int j = 0; j < jumlahTugas; j++) {
            int total = 0;
            for (int i = 0; i < mahasiswa.length; i++) {
                total += scores[i][j];
            }
            double rataRata = (double) total / mahasiswa.length;
            System.out.println("Tugas " + (j + 1) + ": " + rataRata);
        }
    }
}
