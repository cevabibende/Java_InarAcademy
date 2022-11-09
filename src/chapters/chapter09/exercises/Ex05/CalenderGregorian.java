package chapters.chapter09.exercises.Ex05;

import java.util.GregorianCalendar;

public class CalenderGregorian {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();

        System.out.print(date.get(GregorianCalendar.YEAR) + " - ");
        System.out.print(date.get(GregorianCalendar.MONTH) + " - ");
        System.out.print(date.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println();
        System.out.println("..................................");
        date.setTimeInMillis(1234567898765L);
        System.out.println(date.get(GregorianCalendar.YEAR) + " - " + date.get(GregorianCalendar.MONTH) + " - " + date.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
