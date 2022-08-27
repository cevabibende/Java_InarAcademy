package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise06_TamsayiBasamakDegerlerToplami {
	public static void main(String[] args) {
		Scanner kalvye = new Scanner(System.in);
		
		System.out.println("0 ile 1000 arasında bir sayı giriniz:");
		
		int sayi = kalvye.nextInt();
		
		int birlerBasamagı = sayi % 10;
		
		int onlarBasamagı = (sayi / 10) % 10;
	
		int yuzlerBasamagi = sayi / 100;
		
		
		int toplam = birlerBasamagı + onlarBasamagı + yuzlerBasamagi;
		System.out.println(sayi + " Sayısının Basamak Değerleri Toplamı: " + toplam + " dır");
		
	}

}
