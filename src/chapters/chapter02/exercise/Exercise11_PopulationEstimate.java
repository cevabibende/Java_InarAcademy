package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise11_PopulationEstimate {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years: ");
		int years = input.nextInt();
		
		int YılSaniye = 365 * 24 * 60 * 60;
		int Dogum = YılSaniye / 7;
		int Olum = YılSaniye / 13;
		int Gocmen = YılSaniye / 45;
		int YillikNufusArtisi = Dogum + Gocmen - Olum;
		int SimdikiNufus = 312032486;
		
		SimdikiNufus = SimdikiNufus + years * YillikNufusArtisi;
		
		System.out.println("The population in " + years + " years is " + SimdikiNufus );
	}

}
