package chapters.chapter09.classroom;

public class CemberPrivateTest {
    public static void main(String[] args) {
        CemberPrivate c1 = new CemberPrivate();

        System.out.println("yarıçapı " + c1.getYariCap() + " alanı " + c1.alanHesapla() );

        c1.setYariCap(c1.getYariCap() * 1.1);

        System.out.println("yarıçapı " + c1.getYariCap() + " alanı " + c1.alanHesapla() );

        System.out.println(CemberPrivate.getNesneSayisi());

        cemberYazdir(c1);

        int kacDefa = 3;
        alanYazdir(c1, kacDefa);
        System.out.println("yarıçapı " + c1.getYariCap() + " alanı " + c1.alanHesapla() );
        System.out.println(kacDefa);
    }

    private static void cemberYazdir(CemberPrivate c) {
        System.out.println("yarıçapı " + c.getYariCap() + " alanı " + c.alanHesapla() );
    }

    private static void alanYazdir(CemberPrivate c, int kacDefa) {
        for (int i = 0; i < kacDefa; i++) {
            System.out.println("yarıçapı " + c.getYariCap() + " alanı " + c.alanHesapla() );
            c.setYariCap(c.getYariCap() + 1);
        }
        kacDefa = 99;
    }
}
