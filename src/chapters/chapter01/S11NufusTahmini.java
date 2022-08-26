package chapters.chapter01;

public class S11NufusTahmini {
	public static void main(String[] args){
		int YılSaniye = 365 * 24 * 60 * 60;
		int Dogum = YılSaniye / 7;
		int Olum = YılSaniye / 13;
		int Gocmen = YılSaniye / 45;
		int YillikNufusArtisi = Dogum + Gocmen - Olum;
		int SimdikiNufus = 312032486;
		int sayac=0;
		SimdikiNufus = SimdikiNufus + YillikNufusArtisi;
		for(int i=0;i<6; i++) {			
			sayac++;
			System.out.println("Toplam nüfüs " + sayac + " .yıl " + SimdikiNufus +" olur");
	
		}

	}

}
