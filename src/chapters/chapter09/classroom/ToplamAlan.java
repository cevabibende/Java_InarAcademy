package chapters.chapter09.classroom;

public class ToplamAlan {
    public static void main(String[] args) {
        CemberPrivate[] dizi = diziOlustur();
        
        diziyiYazdir(dizi);
    }

    private static void diziyiYazdir(CemberPrivate[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("yarıçapı " + dizi[i].getYariCap() + " alanı " + dizi[i].alanHesapla() );
        }
        double toplamAlan = alanlariTopla(dizi);
        System.out.println("alanların toplamı " + toplamAlan);
    }

    private static double alanlariTopla(CemberPrivate[] dizi) {
        double toplamAlan = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplamAlan += dizi[i].alanHesapla();
        }
        return toplamAlan;
    }

    private static CemberPrivate[] diziOlustur() {
        CemberPrivate[] d = new CemberPrivate[5];
        for (int i = 0; i < d.length; i++) {
            d[i] = new CemberPrivate((int)(Math.random() * 100));
        }
        return d;
    }
}
