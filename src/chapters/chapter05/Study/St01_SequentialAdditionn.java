package chapters.chapter05.Study;

public class St01_SequentialAdditionn {
    public static void main(String[] args) {
        int sum = 0;
        int i =0;
        final int count = 10;
        while(i < count){
            sum =sum + i++;
        }
        System.out.println("The sum of the numbers " + (i - count + 1) + " to " + count + " is " + sum);
    }
}
