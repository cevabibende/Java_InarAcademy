package chapters.chapter05.exercises;

public class Exercise19_DisplayNumbersPyramidPattern {
    public static void main(String[] args) {
        int lines = 8;

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8 - i; j++) {
                System.out.print("    ");

            }
            for (int k = 0; k < i; k++) {
                System.out.printf("%4d",(int) Math.pow(2, k) );
            }
            for(int l = i-2 ; l >=0 ; l--){
                System.out.printf("%4d",(int) Math.pow(2, l));
            }
            System.out.println();
        }

    }
}