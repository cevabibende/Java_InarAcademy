package weeks.week_16;

public class TestGeoObj {
    public static void main(String[] args) {
        // GeometricObject obj = new GeometricObject(); ** GeometricObject Abstract olduğundan oluşmaz

        Rectangle r = new Rectangle(4,5);
        System.out.println("rectangle area " + r.getArea());
    }
}
