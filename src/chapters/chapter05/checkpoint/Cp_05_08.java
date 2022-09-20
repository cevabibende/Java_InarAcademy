package chapters.chapter05.checkpoint;

public class Cp_05_08 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        int sum2= 0;
        for (i = 0; i< 100; ++i){
            sum += i;
        }
        System.out.println("first for ++i: " + sum);
        for(i = 0; i < 100; i++){
            sum2 += i;
        }
        System.out.println("second for i++: " + sum2);
    }
}
