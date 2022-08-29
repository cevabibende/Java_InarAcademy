package weeks.week_03;

import java.util.Scanner;

public class Practise {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("sıralanmasını istediğiniz iki sayı giriniz");
		
		int a = klavye.nextInt();
		int b = klavye.nextInt();
		
		if (a > b) {
			System.out.println(a + " > " + b);
		}else {
			
			int temp = a;
			a = b;
			b = temp;
			
			System.out.println(a + " > " + b);
		}
	}

}
