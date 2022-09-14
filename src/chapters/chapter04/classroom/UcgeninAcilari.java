package chapters.chapter04.classroom;

import java.util.Scanner;

public class UcgeninAcilari {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter three points 1 1  6,5 1 6,5 2,5");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		
		double firstSide = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));

		double secondSide = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		
		double thirthSide = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		
		double firstAngel = Math.toDegrees(Math.acos((firstSide * firstSide - secondSide * secondSide - thirthSide * thirthSide) / (-2 * secondSide * thirthSide)));
		
		double secondAngel = Math.toDegrees(Math.acos((secondSide * secondSide - firstSide * firstSide - thirthSide * thirthSide) / (-2 * firstSide * thirthSide)));

		double thirthAngel = Math.toDegrees(Math.acos((thirthSide * thirthSide - secondSide * secondSide - firstSide * firstSide) / (-2 * secondSide * firstSide)));

		
		
		
		System.out.println(  "angels of treeangel is: " + (int)(firstAngel * 100) / 100.0  + " ," + (int)(secondAngel) + " " +  (int)(thirthAngel)  );
				
				
		
		
		
	}
	

}
