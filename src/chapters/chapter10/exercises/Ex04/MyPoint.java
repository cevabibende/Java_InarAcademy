package chapters.chapter10.exercises.Ex04;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0,0);
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(MyPoint myPoint) {
        double a = Math.pow(myPoint.getX() - this.x, 2);
        double b = Math.pow(myPoint.getY() - this.y, 2);
        return Math.sqrt(a + b);
    }

    public double distance(double x2, double y2) {
        double a = Math.pow(x2 - this.x, 2);
        double b = Math.pow(y2 - this.y, 2);
        return Math.sqrt(a + b);
    }
}
