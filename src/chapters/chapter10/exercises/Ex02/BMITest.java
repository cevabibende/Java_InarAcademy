package chapters.chapter10.exercises.Ex02;

public class BMITest {
    public static void main(String[] args) {
        BMI bmi01 = new BMI("ali ", 14,150, 5 , 15.99);
        BMI bmi02 = new BMI("ayşe ", 15, 172, 6, 14.99);

        bmi01.disPlay();
        bmi02.disPlay();
    }
}
