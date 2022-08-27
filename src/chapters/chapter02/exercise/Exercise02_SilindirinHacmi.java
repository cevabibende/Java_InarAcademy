package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise02_SilindirinHacmi {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Yari cap giriniz:");
		System.out.println("Yükseklik giriniz:");
		
		double yaricap = klavye.nextDouble();
		double yukseklik = klavye.nextDouble();
		
		double alan = yaricap * yaricap * Math.PI;
		double hacim = alan * yukseklik;
		
		System.out.println("Silindirin alanı: " + alan);
		System.out.println("Silindirim hacmi: " + hacim );
	}

}
