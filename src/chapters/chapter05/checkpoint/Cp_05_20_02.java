package chapters.chapter05.checkpoint;
public class Cp_05_20_02 {
    public static void main(String[] args) {
        int i = 0;
        while(i < 5) {
            for (int j = i; j > 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println("****");
            i++;
        }
    }
}

