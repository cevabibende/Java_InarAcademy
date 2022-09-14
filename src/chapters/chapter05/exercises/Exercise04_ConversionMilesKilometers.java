package chapters.chapter05.exercises;

public class Exercise04_ConversionMilesKilometers {
	public static void main(String[] args) {
		System.out.println("Kilograms\tPounds");
	
		for (int i = 1; i < 11; i++) {
			System.out.println(i + "\t\t" + (int)(i * 1.609 * 1000) / 1000.0);

		}
	}

}
