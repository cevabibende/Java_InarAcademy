package chapters.chapter05.exercises;

public class Exercise27_DisplayLeapYears {
    public static void main(String[] args) {
        System.out.println("the leap years between 101 of 2100: ");

        int leapYear = 104;
        int count = 0;

        for(int i = 101; i <= 2100; i++){
            if((i % 4 == 0 && (i % 100) != 0) || i % 400 == 0 ) {
                count++;
                leapYear = i;
                if(count % 10 == 0) {
                    System.out.println(" " + leapYear);
                }else{
                    System.out.printf("%5d",leapYear);
                }
            }
        }


    }
}
