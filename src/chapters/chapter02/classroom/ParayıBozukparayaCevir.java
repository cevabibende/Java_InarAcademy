package chapters.chapter02.classroom;

import java.util.Scanner;

public class ParayıBozukparayaCevir {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir miktar para giriniz: (Ör: 1245,56)" );
		double para = klavye.nextDouble();
		
		int toplamKurus = (int)(para * 100);
		
		System.out.println("Paranız toplam " + toplamKurus + " kuruştur.");
		
		int toplamTl = toplamKurus / 100;
		
		System.out.println("Tl miktariniz: " + toplamTl + " dir.");
		
		int kalanKurus = toplamKurus % 100;
		
		int elliKurus = kalanKurus % 50;
		
		System.out.println("50 kurus miktarınız: " + elliKurus + " dır.");
		
		kalanKurus = kalanKurus % 50;
		
		int yirmibesKurus = kalanKurus / 25;
		
		System.out.println("25 kurus miktarınız: " + yirmibesKurus + " dır.");
		
		kalanKurus = kalanKurus % 25;
		
		int onKurus = kalanKurus / 10;
		
		System.out.println("10 kurus miktarınız: " + onKurus + " dır.");
		
		kalanKurus = kalanKurus % 10;
		
		int besKurus = kalanKurus / 5;
		
		System.out.println("5 kurus miktarınız: " + besKurus + " dır.");
		
		kalanKurus = kalanKurus % 5;
		
		int birKurus = kalanKurus / 1;
		
		System.out.println("1 kurus miktarınız: " + birKurus + " dır.");
		
		
	}

}
