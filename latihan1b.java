import java.util.Scanner;
public class latihan1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int responden[][] = new int[10][6];

        System.out.println("=== Survei Kepuasan Pelanggan ===");
        System.out.println();

        for (int i = 0; i < responden.length; i++) {

            System.out.println("Responden ke-" + (i + 1));
            double rata_rata = 0;

            for (int j = 0; j < responden[i].length; j++) {
                System.out.print("Nilai survei ke-" + (j + 1) + ": ");
                responden[i][j] = sc.nextInt();
                rata_rata += responden[i][j];
            }

            System.out.printf("Rata-rata setiap responden: %.2f%n", (rata_rata / 6));
            System.out.println();
        }

        sc.close();
    }
}
