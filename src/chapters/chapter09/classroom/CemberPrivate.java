package chapters.chapter09.classroom;

import com.sun.javafx.css.PseudoClassState;

public class CemberPrivate {
    private double yariCap = 5;

    private static int nesneSayisi = 0;

    public CemberPrivate() {
        yariCap = 5;
        nesneSayisi++;
    }

    public CemberPrivate(int i) {
    }

    public double alanHesapla(){
        return yariCap * yariCap * Math.PI;
    }
    public double cevreHesapla() {
        return 2 * yariCap * Math.PI;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {

        if (yariCap > 0){
            this.yariCap = yariCap;
        } else {
            this.yariCap = 0;
        }
    }

    public static int getNesneSayisi() {
        return nesneSayisi;
    }
}
