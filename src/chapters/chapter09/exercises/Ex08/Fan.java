package chapters.chapter09.exercises.Ex08;

public class Fan {
    static int SLOW = 1;
    static int MEDIUM = 2;
    static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    String color;

    Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if (isOn()){
            return "fan speed: " + getSpeed() + "\nfan color " + getColor() + "\nradius " + getRadius();
        }else {
            return "fun is of" + "\nfun color " + getColor() + "\nradius is " + getRadius();
        }
    }
}
