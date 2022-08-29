package chapters.chapter01;

public class S11NufusTahmini {
	public static void main(String[] args){
		int YılSaniye = 365 * 24 * 60 * 60;
		int Dogum = YılSaniye / 7;
		int Olum = YılSaniye / 13;
		int Gocmen = YılSaniye / 45;
		int YillikNufusArtisi = Dogum + Gocmen - Olum;
		int SimdikiNufus = 312032486;
		SimdikiNufus = SimdikiNufus + YillikNufusArtisi;
		System.out.println("1. yıl Toplam nüfüs " + SimdikiNufus +" olur");
		SimdikiNufus = SimdikiNufus + YillikNufusArtisi;			
		System.out.println("2. yıl Toplam nüfüs " + SimdikiNufus +" olur");
		SimdikiNufus = SimdikiNufus + YillikNufusArtisi;
		System.out.println("3. yıl Toplam nüfüs " + SimdikiNufus +" olur");
		SimdikiNufus = SimdikiNufus + YillikNufusArtisi;
		System.out.println("4. yıl Toplam nüfüs " + SimdikiNufus +" olur");
		SimdikiNufus = SimdikiNufus + YillikNufusArtisi;
		System.out.println("5. yıl Toplam nüfüs " + SimdikiNufus +" olur");

	
		}

	}
