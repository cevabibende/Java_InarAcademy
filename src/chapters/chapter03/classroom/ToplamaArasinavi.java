package chapters.chapter03.classroom;

import java.util.Scanner;

public class ToplamaArasinavi {
	public static void main(String[] args) {
		
		int sayi1 = (int)(Math.random() * 10);
		int sayi2 = (int)(Math.random() * 10);
		
		System.out.println(sayi1 + " + " + sayi2 + " =?");
		
		Scanner klavye = new Scanner(System.in);
		
		int toplam =klavye.nextInt();
		
		if (sayi1 + sayi2 == toplam){
			
			System.out.println("Doğru Cevap");
		} else {
			System.out.println("Yanlış Cevap");
			
		}
		
		
		
		
	}

}
