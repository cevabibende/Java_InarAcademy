package chapters.chapter10.exercises.Ex14;

public class MyDateTest {
    public static void main(String[] args) {

        MyDate date01 = new MyDate();
        MyDate date02 = new MyDate(34355555133101L);

        System.out.print("DATE01 : ");
        date01.displayDate();
        System.out.print("DATE02 : ");
        date02.displayDate();
    }
}
