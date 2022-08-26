package chapters.chapter01;

public class S08AlanCevreHesapla {
    public static void main(String[] args){
    	double yaricap =5.5;
        double pi=Math.PI;

        double CemberCevre = pi * yaricap * 2;
        System.out.println("Yarı çapı 5.5 olan Cemberin Cevresi: " + CemberCevre);

        double DaireAlan = pi* yaricap * yaricap;
        System.out.println("Yarı çapı 5.5 olan Dairenin Alanı: " + DaireAlan);
     }
}
