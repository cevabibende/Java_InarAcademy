package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise05_Komisyon {
	public static void main(String[] args) {
	
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lütfen Ara Toplam Değerini giriniz: ");
		System.out.println("Lütfen Komisyon Oranını % giriniz: ");
		
		double araToplam = klavye.nextDouble();
		double komisyon = klavye.nextDouble();
		
		double komisyonMiktari = araToplam * komisyon / 100;
		double toplam = araToplam + komisyonMiktari;
		
		System.out.println(komisyonMiktari + " TL Komisyon miktarı ödeyerek toplamda " + toplam + " TL ödmeniz bulunmaktadır");
		
	}
	
	

}
