package chapters.chapter05.exercises;

public class Exercise06_ConversionMilesKilometers {
	public static void main(String[] args) {
		System.out.println("miles\t\tkilometres\t|\tkilometres\tmiles");
		
		
		for(int i = 1, j = 20; i < 10 && j < 65; i++ , j +=5) {
			
			System.out.println(i + "\t\t" + (int)(i * 1.609 * 1000) / 1000.0 + "\t\t|\t" + j + "\t\t" + (int)(j / 1.609 * 1000) / 1000.0);
			
		}
	}

}
