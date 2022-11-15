package chapters.chapter10.exercises.Ex04;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint();



        System.out.println("distance is : " + myPoint1.distance(10,30.5));
        System.out.println("distance is : " + myPoint1.distance(new MyPoint(10,30.5)));

    }
}
