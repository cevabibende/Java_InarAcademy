package chapters.chapter10.exercises.Ex01;

public class TimeTest {
    public static void main(String[] args) {
        Time time01 = new Time();
        Time time02 = new Time(555_550_000);

        System.out.println("Current Time is : " + (time01.getHour() + 3)  + ":" + (time01.getMinute() < 10 ? "0" + time01.getMinute() : time01.getMinute()) + ":" + time01.getSecond());

        System.out.println("Elapsed time : " + time02.getHour() + ":" + (time02.getMinute() < 10 ? "0" + time02.getMinute() : time02.getMinute()) + ":" + time02.getSecond());



        System.out.println("----------------------------");
        time01.displayTime();
        time02.displayTime();
    }


}
