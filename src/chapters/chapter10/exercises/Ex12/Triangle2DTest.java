package chapters.chapter10.exercises.Ex12;

import chapters.chapter10.exercises.Ex04.MyPoint;

public class Triangle2DTest {
    public static void main(String[] args) {

        Triangle2D t1 = new Triangle2D(new MyPoint(2.5,2),new MyPoint(4.2,3),new MyPoint(5,3.5));
        System.out.println("The area of triangle : " + t1.getArea());
        System.out.println("The Perimeter of triangle : " + t1.getPerimeter());
        System.out.println("t1.contains(new MyPoint(3,3) : "+t1.contains(new MyPoint(3,3)));

        System.out.print("t1.contains(new Triangle2D(new MyPoint(2.9,2),new MyPoint(4,1),new MyPoint(1,3.4))) :");
        System.out.println(t1.contains(new Triangle2D(new MyPoint(2.9,2),new MyPoint(4,1),new MyPoint(1,3.4))));

        System.out.print("t1.overlaps(new Triangle2D(new MyPoint(2,5.5),new MyPoint(4,-3),new MyPoint(2,6.5))) :");
        System.out.println(t1.overlaps(new Triangle2D(new MyPoint(2,5.5),new MyPoint(4,-3),new MyPoint(2,6.5))));
    }
}
