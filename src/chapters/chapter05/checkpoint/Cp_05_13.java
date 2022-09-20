package chapters.chapter05.checkpoint;

public class Cp_05_13 {
    public static void main(String[] args) {
        long sum1 = 0;
        for (int i = 0; i <= 1000; i++) {
            sum1 = sum1 + i;
        }
        System.out.println("first for for loop " + sum1);

        int i = 0;
        long sum2 = 0;
        while(i <= 1000){
            sum2 = sum2 + i;
            i++;
        }
        System.out.println("second for while loop " + sum2);

        int j = 0;
        long sum3 = 0 ;
        do{
            sum3 = sum3 + j;
            j++;
        }
        while(j <= 1000);
        System.out.println("thirth for do while loop " + sum3);
    }
}
