package chapters.chapter02.classroom;


import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
		System.out.println("enter seconds as integers: ");
		
		Scanner klavye = new Scanner(System.in);
		
		int second = klavye.nextInt();
		
		int minute = second / 60;
		
		int remainingseconds = second % 60;
		
		System.out.println(second + " second is " + minute + " minute and " + remainingseconds + " seconds");
		
	}

}