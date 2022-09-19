package chapters.chapter05.exercises;

public class Exercise11_FindNumbersDivisible5O6NotBoth {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 6;
		int count = 0;
		for (int i = 100; i < 200; i++) {
			if (i % num1 == 0 ^ i % num2 == 0) {
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
