import java.util.Scanner;

public class latihan1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[][] = new int[10][6];

        System.out.println("=== Survei Kepuasan Pelanggan ===");
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Nilai survei ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        double total = 0;
        int jumlah_data = 10 * 6; 

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                total += data[i][j];
            }
        }

        double rata2_keseluruhan = total / jumlah_data;

        System.out.printf("Rata-rata keseluruhan: %.2f%n", rata2_keseluruhan);

        sc.close();
    }
}
