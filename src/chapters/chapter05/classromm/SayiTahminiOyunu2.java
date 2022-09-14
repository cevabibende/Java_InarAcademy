package chapters.chapter05.classromm;

import java.util.Scanner;

public class SayiTahminiOyunu2 {
	public static void main(String[] args) {
		int sayi = (int)(Math.random() * 101);
		Scanner input = new Scanner(System.in);
		
		int tahmin = -8;
		while(sayi != tahmin) {
			System.out.println("0 ile 100 arası bir sayı giriniz");
			tahmin = input.nextInt();
			
			if (sayi == tahmin) {
				System.out.println("tebrikler!!!!");
			}else if(sayi < tahmin) {
				System.out.println("büyük bir sayi girdiniz");
			}else {
				System.out.println("küçük bir sayi girdiniz");
			}
		}
		
	}

}
