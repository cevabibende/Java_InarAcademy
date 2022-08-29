package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise08_CurrentTime {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("Enter the time zone offset to GMT: ");
		
		int timeZone = klavye.nextInt();
		
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinute = totalSeconds / 60;
		long currentMinute = totalMinute % 60;
		long totalHours = totalMinute / 60;
		long currentHour = totalHours % 24;
		currentHour = currentHour + timeZone;
		
		
		System.out.println("Current Time is: " + currentHour + ":" + currentMinute + ":" + currentSecond + ":");

	}

}