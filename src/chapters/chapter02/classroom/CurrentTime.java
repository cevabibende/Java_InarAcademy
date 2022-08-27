package chapters.chapter02.classroom;

public class CurrentTime {
	public static void main(String[] args) {
		
		long totalMilliseconds = System.currentTimeMillis();
		
		System.out.println("total Milliseconds = " + totalMilliseconds);
		
		long totalSeconds = totalMilliseconds / 1000;
		
		System.out.println("totalSeconds = " + totalSeconds);
		
		long currentSecond = totalSeconds % 60;
		
		System.out.println("currentSecond = " + currentSecond);
		
		long totalMinute = totalSeconds / 60;
		
		System.out.println("totalMinute = " + totalMinute);
		
		long currentMinutes = totalMinute % 60;
		
		System.out.println("currentMinutes = " + currentMinutes);
		
		long totalHours = totalMinute / 60;
		
		System.out.println("toplamSaat = " + totalHours);
		
		long currentTime = totalHours % 24;
		
		System.out.println("currentTime = " + currentTime);
		
		System.out.println(currentTime + ":" + currentMinutes + ":" + currentSecond + " GMT");
		
	}
}
