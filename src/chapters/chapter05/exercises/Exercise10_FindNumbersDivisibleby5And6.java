package chapters.chapter05.exercises;

public class Exercise10_FindNumbersDivisibleby5And6 {
	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 6;
		int count = 0;
		System.out.println("Numbers from 100 to 1000 that are divisible by 5 and 6:");
		for (int i = 100; i < 1000; i++) {
			if(i % number1 == 0 && i % number2 == 0) {
				count++;
				if(count % 10 == 0) {
					System.out.println(i);
				}else {
					System.out.print(i + " ");
				}
				
			}
		}
	}

}
