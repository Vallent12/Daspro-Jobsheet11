import java.util.Scanner;
public class BioskopWithScanner03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            
            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                penonton[baris -1][kolom -1] = nama;

                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();

                if (next.equalsIgnoreCase("n")) {
                    continue;
                }
            }

            else if (menu == 2) {
                System.out.println("\n=== DATA PENONTON ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print(penonton[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
        
            else if (menu == 3) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }
            
            else {
                System.out.println("Pilihan tidak valid");
            }
        }
    }
}
