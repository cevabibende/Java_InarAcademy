package chapters.chapter05.classromm;

import java.util.Scanner;

public class TekrarliToplamaAraSinavi {
	public static void main(String[] args) {
		
		int sayi1 = (int)(Math.random() * 10);
		int sayi2 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		System.out.println(sayi1 + " + " + sayi2 + " = ?");
		
		int cevap = input.nextInt();
		
		int yanlisSayaci = 0;
		while (sayi1 + sayi2 != cevap && yanlisSayaci <3 ) {
			yanlisSayaci++;
			System.out.println("Yanlış cevap girdiniz tekrar deneyiniz");
			System.out.println(sayi1 + " + " + sayi2 + " = ?");
			cevap = input.nextInt(); 
		}
		
		if (sayi1 + sayi2 == cevap) {
			System.out.println("tebrikler!!!!!!!!!");
		}else {
			System.out.println("yeter daaa nereye kadar!!!!!!!");
		}
		
		
		
	}

}
