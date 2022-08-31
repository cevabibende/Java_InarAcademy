package chapters.chapter03.classroom;

import java.util.Scanner;

public class HaftaSonuMuHaftaIciMi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("bir gün girin Pazartesi için 1 Pazar için 7");
		
		int gun = input.nextInt();
		
		switch (gun) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Hafta içi");
			break;
		case 6:
		case 7:
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("Yanlış Girdi");
		}
		System.out.println("Devam etmek istiyormusunuz?");
		String cevap = input.next();
		
		switch (cevap.charAt(0)) {
		case 'e':
		case 'E':
			System.out.println("iyi devam et ozaman");
			break;
		case 'h':
		case 'H':
			System.out.println("sen bilirsin");
			break;
		default:
			System.out.println("Ne dediğini anlamıyorum");
		}
	}

}
