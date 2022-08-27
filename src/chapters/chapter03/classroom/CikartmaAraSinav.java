package chapters.chapter03.classroom;

import java.util.Scanner;

public class CikartmaAraSinav {
	public static void main(String[] args) {
		int sayi1 = (int)(Math.random() * 10);
		int sayi2 = (int)(Math.random() * 10);
		
		if (sayi2 > sayi1) {
			
			int temp = sayi1;
			sayi1 = sayi2;
			sayi2 = temp;
			
		}
		
		System.out.println(sayi1 + " - " + sayi2 + " =?");
		
		Scanner klavye = new Scanner(System.in);
		
		int sonuc = klavye.nextInt();
		
		if (sayi1 - sayi2 == sonuc) {
			
			System.out.println("Tebrikler Doğru Bildiniz");
			
		} else {
			System.out.println("Yanlış Cevap. Doğrusu: " + sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));
			
		}
	}

}
