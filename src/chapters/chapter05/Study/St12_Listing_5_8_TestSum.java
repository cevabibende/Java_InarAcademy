package chapters.chapter05.Study;

public class St12_Listing_5_8_TestSum {
    public static void main(String[] args) {
        float sum = 0;
        for(float i = 0.01f; i<=1.0f; i = i + 0.01f) {
            sum += i;
        }
        System.out.println("the sum is " + sum);
    }
}