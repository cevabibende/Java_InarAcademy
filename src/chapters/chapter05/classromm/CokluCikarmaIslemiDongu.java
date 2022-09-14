package chapters.chapter05.classromm;

import java.util.Scanner;

public class CokluCikarmaIslemiDongu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		long baslangicZamani = System.currentTimeMillis();
		String rapor = "";
		int sayac = 0;
		int dogruSayisi = 0;
		while (sayac < 5) {
			int sayi1 = (int) (Math.random() * 10);
			int sayi2 = (int) (Math.random() * 10);

			if (sayi1 < sayi2) {
				int gecicisayi = sayi1;
				sayi1 = sayi2;
				sayi2 = gecicisayi;
			}
			System.out.println(sayi1 + " - " + sayi2 + " = ?");
			int cevap = input.nextInt();

			if (sayi1 - sayi2 == cevap) {
				System.out.println("tebrikler");
				dogruSayisi++;
				rapor += sayi1 + " - " + sayi2 + " = " + cevap + " doğru \n";
			} else {
				System.out.println("yapma dostumm");
				rapor += sayi1 + " - " + sayi2 + " = " + cevap + " yanlış \n";
			}
			sayac++;
		}
		long bitisZamani = System.currentTimeMillis();
		
		System.out.println("Toplam Süre: " + ((bitisZamani - baslangicZamani) / 1000) + "saniyedir");
		
		System.out.println(sayac + "tane soru soruldu");
		System.out.println(dogruSayisi + "tane doğru cevabınız var");
		System.out.println(rapor);
	}
}