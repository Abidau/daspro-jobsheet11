import java.util.Scanner;

public class ModifTugasNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = sc.nextInt();

        int[][] scores = new int[jumlahMahasiswa][jumlahTugas];
        String[] studentNames = new String[jumlahMahasiswa];

        System.out.println("\nMasukkan data mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nama Mahasiswa " + (i + 1) + ": ");
            sc.nextLine(); 
            studentNames[i] = sc.nextLine();

            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Nilai Tugas " + (j + 1) + " untuk " + studentNames[i] + ": ");
                scores[i][j] = sc.nextInt();
            }
        }

        tampilkanNilaiMahasiswa(studentNames, scores);

        rataRataNilaiPerMahasiswa(studentNames, scores);

        rataRataNilaiPerTugas(jumlahTugas, studentNames, scores);

        sc.close();
    }

    public static void tampilkanNilaiMahasiswa(String[] studentNames, int[][] scores) {
        System.out.println("\nData Nilai Mahasiswa:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print(studentNames[i] + ": ");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rataRataNilaiPerMahasiswa(String[] studentNames, int[][] scores) {
        System.out.println("\nRata-rata Nilai Per Mahasiswa:");
        for (int i = 0; i < studentNames.length; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double rataRata = (double) total / scores[i].length;
            System.out.println(studentNames[i] + ": " + rataRata);
        }
    }

    public static void rataRataNilaiPerTugas(int jumlahTugas, String[] studentNames, int[][] scores) {
        System.out.println("\nRata-rata Nilai Per Tugas:");
        for (int j = 0; j < jumlahTugas; j++) {
            int total = 0;
            for (int i = 0; i < studentNames.length; i++) {
                total += scores[i][j];
            }
            double rataRata = (double) total / studentNames.length;
            System.out.println("Tugas " + (j + 1) + ": " + rataRata);
        }
    }
}
