package chapters.chapter11.exercises.Ex15;

import java.util.ArrayList;
import java.util.Scanner;

public class AreaOfAConvexPolygon {
    public static void main(String[] args) {
        ArrayList<Double> points = getPointsFromUser();
        double area = getAreaOfPolygon(points);
        System.out.println("The area of polygon is  " + area);

    }

    public static double getAreaOfPolygon(ArrayList<Double> points) {

        double a = 0;
        for (int i = 0; i < points.size() - 3; i += 2) {
            a += points.get(i) * points.get(i + 3);
        }
        double b = 0;
        for (int i = 1; i < points.size() - 1; i += 2) {
            b += points.get(i) * points.get(i + 1);
        }
        double area = 0.5 * (a - b);
        return Math.abs(area);
    }

    private static ArrayList<Double> getPointsFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the points");
        int numberOfPoints = input.nextInt();

        ArrayList<Double> points = new ArrayList<>();
        System.out.println("Enter the coordinates of the points");

        for (int i = 0; i < numberOfPoints * 2; i++) {
            points.add(input.nextDouble());
        }
        return points;
    }
}
