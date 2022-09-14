package chapters.chapter05.exercises;

public class Exercise05_ConversionKilogramsPoundsAndPoundsKilograms {
	public static void main(String[] args) {
		System.out.println("kilogram\tpounds\t\t|\tpound\t\tkilogram");
		
		for(int i = 1, k = 20; i < 200 && k < 516; i++, k+=5) {
			System.out.println(i + "\t\t" + (int)(i * 2.2 * 100) / 100.0 + "\t\t|\t" + k + "\t\t" + (int)(k / 2.2 * 100) / 100.0);
		}
	}

}
