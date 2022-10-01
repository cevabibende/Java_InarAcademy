package chapters.chapter06.classroom;

public class MetodaParametreGonderme {
    public static void main(String[] args) {
        int sayi1 = 5;
        int sayi2 = 88888;

        System.out.println("yerdeğiştir metodu çağrılmadan önce sayi1= " + sayi1 + " sayi2 = " + sayi2);

        yerDegistir(sayi1, sayi2);

        System.out.println("yerdeğiştir metodu çağrıldıktan sonra sayi1= " + sayi1 + " sayi2 = " + sayi2);

    }
    public static void yerDegistir(int sayi1, int sayi2){

        int gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;

        System.out.println("yerdeğiştirdikten sonra sayı1 = " + sayi1 + " sayi2 = " + sayi2);
    }
}
