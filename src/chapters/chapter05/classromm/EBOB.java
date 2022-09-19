package chapters.chapter05.classromm;

import java.util.Scanner;

public class EBOB {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. sayısı giriniz.");
		int num1 = input.nextInt();
		
		System.out.println("2. sayıyı giriniz");
		int num2 = input.nextInt();
		
		int ebob = 1;
		int bolen = 2;
		
		while (bolen <= num1 && bolen <= num2) {
			if(num1 % bolen == 0 && num2 % bolen == 0) {
				ebob = bolen;
			}
			bolen++;
		}
		System.out.println("girilen " + num1 + " ve " + num2 + " sayılarının ebobu " + ebob + " dur");
	}

}
