package chapters.chapter09.exercises.Ex08;

public class TestFan {
    public static void main(String[] args) {
        System.out.println("---------------first scenario------------");
        Fan fan = new Fan();
        fan.setSpeed(Fan.FAST);
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);
        System.out.println(fan.toString());

        System.out.println("---------------second scenario------------");
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}
