package chapters.chapter10.exercises.Ex12;

import chapters.chapter10.exercises.Ex04.MyPoint;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;


    public Triangle2D() {
        this(new MyPoint(0,0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public Triangle2D(double p1X, double p1Y, double p2X, double p2Y, double p3X, double p3Y) {

        this(new MyPoint(p1X, p1Y), new MyPoint(p2X, p2Y), new MyPoint(p3X, p3Y));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double side1 = p1.distance(this.p2);
        double side2 = p1.distance(this.p3);
        double side3 = p2.distance(this.p1);

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    public double getPerimeter() {
        double side1 = p1.distance(this.p2);
        double side2 = p1.distance(this.p3);
        double side3 = p2.distance(this.p1);
        return side1 + side2 + side3;
    }

    public boolean contains(MyPoint p) {
        return (getArea() == new Triangle2D(p1, p, p2).getArea() + new Triangle2D(p2, p, p3).getArea() + new Triangle2D(p1, p, p3).getArea());
    }

    public boolean contains(Triangle2D t2D){
        return (contains(t2D.getP1()) && contains(t2D.getP2()) && contains(t2D.getP3()));
    }

    public boolean overlaps(Triangle2D t2D){
        return (contains(t2D.getP1()) || contains(t2D.getP2()) || contains(t2D.getP3()));
    }
}
