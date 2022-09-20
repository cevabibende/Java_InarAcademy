package chapters.chapter05.Study;

public class St12_Listing_5_8_TestSum_02 {
    public static void main(String[] args) {
        double sum = 0;
        for(double i = 0.01; i<=1.0; i = i + 0.01) {
            sum += i;
        }
        System.out.println("the sum is " + sum);
    }
}