import java.util.Scanner;

public class latihanC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int survei[][] = new int[10][6];

        System.out.println("=== Survey Kepuasan Pelanggan ===");
        System.out.println();

        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Nilai pertanyaan ke-" + (j + 1) + ": ");
                survei[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < 10; i++) {
                total += survei[i][j];
            }
            System.out.printf("Rata-rata pertanyaan ke-%d: %.2f%n", (j + 1), (total / 10));
        }

        sc.close();
    }
}
