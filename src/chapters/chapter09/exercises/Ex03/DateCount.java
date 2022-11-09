package chapters.chapter09.exercises.Ex03;

import java.util.Date;

public class DateCount {
    public static void main(String[] args) {
        Date date = new Date();

        date.setTime(10000);
        System.out.println(date.toString());

        date.setTime(100_000);
        System.out.println(date.toString());

        date.setTime(1_000_000);
        System.out.println(date.toString());

        date.setTime(10_000_000);
        System.out.println(date.toString());

        date.setTime(100_000_000);
        System.out.println(date.toString());

        date.setTime(1_000_000_000);
        System.out.println(date.toString());

        date.setTime((long) (Math.pow(10,10)));
        System.out.println(date.toString());

        date.setTime((long) (Math.pow(10,11)));
        System.out.println(date.toString());

        System.out.println("Other Solution");
        for (int i = 4; i < 12; i++) {
            date.setTime((long) (Math.pow(10,i)));
            System.out.println("elapsed time " + (long)(Math.pow(10,i)) + " date and time: " + date.toString());
        }
    }
}
