package weeks.week_03;

import java.util.Scanner;

public class CalismaYili {
	public static void main(String[] args) {
		Scanner klavye = new Scanner (System.in);
		
		System.out.println("Enter your year of service and year of sales: ");
		
		double serviceYear = klavye.nextDouble();
		double serviceSales = klavye.nextDouble();
		
		double bonus = serviceSales * 5 / 100;
		if( serviceYear >5) {
			System.out.println("Tebrikler Bonus Kazandınız " + (bonus + serviceSales) );
		}else {
			System.out.println("güncel maaşınız: " + serviceSales + " dir.");
			
		}
	}

}
