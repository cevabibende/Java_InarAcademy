package chapters.chapter10.exercises.Ex15;

import chapters.chapter10.exercises.Ex13.MyRectangle2D;

import java.util.Scanner;

public class TheBoundingRectangle {
    public static void main(String[] args) {

        double points[][] = getPointsFromUser();
        MyRectangle2D r = getRectangle(points);

        System.out.printf("The bounding rectangle's center (%.1f, %.2f) width %.1f height %.1f", r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    private static double[][] getPointsFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five points");
        double[][] points = new double[5][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        return points;
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[0][0];
        double y2 = points[0][1];

        for (int i = 0; i < points.length; i++) {
            if (x1 > points[i][0]) {
                x1 = points[i][0];
            }
            if (x2 < points[i][0]) {
                x2 = points[i][0];
            }
            if (y1 > points[i][1]) {
                y1 = points[i][1];
            }
            if (y2 < points[i][1]) {
                y2 = points[i][1];
            }
        }
        double width = Math.abs(x2 - x1);
        double centerX = (x2 + x1) / 2;

        double height=Math.abs(y2 - y1);
        double centerY=(y1 + y2)/2;

        return new MyRectangle2D(centerX, centerY, width, height);
    }
}
