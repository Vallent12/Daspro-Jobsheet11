import java.util.Scanner;

public class latihanA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int responden[][] = new int[10][6];

        System.out.println("=== Survey Kepuasan Pelanggan ===\n");

        for (int i = 0; i < responden.length; i++) {
            System.out.println("Responden ke-" + (i + 1));

            for (int j = 0; j < responden[i].length; j++) {
                System.out.print("Nilai pertanyaan ke-" + (j + 1) + ": ");
                responden[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
}