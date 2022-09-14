package chapters.chapter05.classromm;

import java.util.Scanner;

public class GirilenSayilariTopla {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("toplanacak sayiyi giriniz (çıkış için sıfır giriniz)");
		int sayi = input.nextInt();
		
		int toplam = 0;
		while(sayi != 0) {
			toplam += sayi;
			System.out.println("toplanacak sayiyi giriniz (çıkış için sıfır giriniz)");
			sayi = input.nextInt();
		}
		System.out.println("toplam " + toplam);
	}

}
