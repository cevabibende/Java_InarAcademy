package chapters.chapter09.classroom;

public class Cember {
    double yariCap;

    static int nesneSayisi;

    Cember(){
        yariCap = 5;
        nesneSayisi++;
    }
    Cember(double y) {
        yariCap = y;
        nesneSayisi++;
    }

    double alanHesapla(){
        return yariCap * yariCap * Math.PI;
    }
    double cevreHesapla(){
        return 2 * yariCap * Math.PI;
    }

    void yariCapiGuncelle(double y) {
        yariCap = y;
    }
}
