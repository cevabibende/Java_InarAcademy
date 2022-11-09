package chapters.chapter09.exercises.Ex01;

public class Rectangle {
    private double width;
    private double height;

    Rectangle() {
        this(1, 1);
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return (int)(width * height * 100) / 100.0;
    }

    public double getPerimeter() {
        return (int)(2 * (height + width) * 100) / 100.0;
    }

    public void print(){
        System.out.println("width: " + this.width);
        System.out.println("height " + this.height);
        System.out.println("area: " + this.getArea());
        System.out.println("perimeter " + this.getPerimeter());
    }
}
