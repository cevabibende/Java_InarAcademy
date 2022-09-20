package chapters.chapter05.Study;

public class St09_ForLoopPrints_Welcome_to_Java {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            System.out.printf("\n  %1$25s", (i + 1) + ". Welcome to Java! ");
        }
    }
}
