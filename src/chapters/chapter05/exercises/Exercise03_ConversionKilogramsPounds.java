package chapters.chapter05.exercises;

public class Exercise03_ConversionKilogramsPounds {
	public static void main(String[] args) {
		
		System.out.println("kilograms\tpounds" );
		
		for(int i = 1; i < 200; i++ ) {
			System.out.println(i + "\t\t" + (int)(i * 2.2 * 100) / 100.0);
		}
	}

}
