package chapters.chapter03.classroom;

import java.util.Scanner;

public class piyango {
	public static void main(String[] args) {
		int piyango = (int)(Math.random() * 90) + 10;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Piyango için iki basamaklı bir sayi tahmin ediniz: ");
		int tahmin = input.nextInt();
		
		int piyangoBirlerBasamagi = piyango % 10;
		int piyangoOnlarBasamagi = piyango / 10;
		
		int tahminBirlerBasamagi = tahmin % 10;
		int tahminOnlarBasamagi = tahmin / 10;
		
		System.out.println("piyango numarasi" + piyango);
		
		if (piyango == tahmin) {
			System.out.println("tebrikler bildiniz 10000 tl kazandiniz");
		} else if (piyangoBirlerBasamagi == piyangoOnlarBasamagi && piyangoOnlarBasamagi == tahminBirlerBasamagi) {
			System.out.println("iki rakamı tutturdunuz 3000 tl kazandınız");
		}else if(piyangoBirlerBasamagi == tahminBirlerBasamagi || piyangoBirlerBasamagi == tahminOnlarBasamagi || piyangoOnlarBasamagi == tahminBirlerBasamagi || piyangoOnlarBasamagi == tahminOnlarBasamagi) {
			System.out.println("bir rakamı tutturdunuz 1000 tl kazandınız");
		} else {
			System.out.println( "bilemdiniz :(");
		}
	}

}
