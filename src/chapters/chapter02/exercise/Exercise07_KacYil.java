package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise07_KacYil {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir dakika Değeri Giriniz: (Ör. Oldukça Büyük Olabilir (234567)");
		
		int girilenDakika = klavye.nextInt();
		
		int yil = girilenDakika / 365 / 24 / 60;
		
		int gun = (girilenDakika % ( 365 * 24 * 60)) / (24 * 60);
		
		int saat = (girilenDakika % ( 365 * 24 * 60)) / (24 * 60);
		
		System.out.println(yil + " yıl " + gun + " gun " + girilenDakika + " dakika ");
		}

}
