package chapters.chapter05.Study;

public class St10_Listing_05_07_MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("        Multiplication Table \n");
        System.out.print("    ");
        for (int j = 1; j < 10; j++) {
            System.out.print("  " + j);
        }
            System.out.println("\n-------------------------------------------------");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " | ");
                for (int j = 1; j < 10; j++) {
                    System.out.printf("%3d", i * j);
                }
                System.out.println();
            }
        }
    }

