package chapters.chapter05.Study;

public class St12_Listing_5_8_TestSum_03 {
    public static void main(String[] args) {

        double sum = 0;
        double currentValue = 0.01;
        for (int count = 0; count < 100; count++){
            sum += currentValue;
            currentValue += 0.01;
        }
        System.out.println(sum);
    }
}

