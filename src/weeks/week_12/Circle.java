package weeks.week_12;

public class Circle {
    // data field
    String color;
    double radius;
    double area;
    double perimeter;
    boolean isFilled;

    // constructor
    /*
     * 1- same classname
     * 2- no return typ
     * 3- Static - nonconstructor is not an option
     */
    public Circle(){
        radius = 1;
        isFilled = false;
        color = "black";
        perimeter = getPerimeter();
        area = getArea();
    }

    public Circle(double r){
        this();
        radius = r;
    }

    /*
    * Method
    *  - Getter / Setter
    *  - method
     */

    public double getArea(){
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    public double getPerimeter(){
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public void fillTheCircle(){
        isFilled = true;
    }
    public void cleanTheCircle(){
        isFilled = false;
    }

    public void paint(){

    }
    public void print(){
        System.out.println("---------------------");
        System.out.println("radius " + radius);
        System.out.println("perimeter " + perimeter);
        System.out.println("area " + area);
        System.out.println("fillTheCircle " + isFilled);
        System.out.println("Color" );

    }

}
