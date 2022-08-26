package chapters.chapter01;

public class S12_OrtalamaHız {
	public static void main(String[] args){
	double yol=24;
	double saat=(95*60+35)/60/60;
	double OrtalamaHiz = yol / saat;
	System.out.println("Ortalama Hızınız Saatte " + OrtalamaHiz * 1.6 + " km dir" );
	}

}
