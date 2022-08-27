package chapters.chapter03.classroom;

import java.util.Scanner;

public class VucutKitleEndeksi {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Ağırlığı kiilogram cinsinden giriniz: ");
		double agirlik = klavye.nextDouble();
		
		System.out.println("Boyunuzu metre cinsinden giriniz: ");
		double boy = klavye.nextDouble();
		
		double vucutKitleEdndeksi = agirlik / (boy * boy);
		
		System.out.println("Vucut kitle endeksiniz: " + vucutKitleEdndeksi + " dır.");
		
		if (vucutKitleEdndeksi < 18.5) {
			System.out.println("Cok Zayif");
		} else if (vucutKitleEdndeksi < 25) {
			System.out.println("Normal");
		} else if (vucutKitleEdndeksi <30){
			System.out.println("Kilolu");
		} else {
			System.out.println("Obez");
			
		}
	}

}
