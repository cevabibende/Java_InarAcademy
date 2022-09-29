package chapters.chapter05.exercises;

public class Exercise33_PerfectNumber {
    public static void main(String[] args) {

        int isPerfect = 0;
        int count = 0;
        for (int i = 2; i < 10000; i++){
            for(int j = (i - 1); j >= 1; j--){
                if(i % j == 0){
                    isPerfect += j;
                }
            }
            if(isPerfect == i){
                count++;
                System.out.println(count + "st perfect number is: " + isPerfect);
            }
            isPerfect = 0;
        }
    }
}
