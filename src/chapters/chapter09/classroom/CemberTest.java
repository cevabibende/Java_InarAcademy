package chapters.chapter09.classroom;

import java.awt.color.CMMException;

public class CemberTest {
    public static void main(String[] args) {
        Cember cember01 = new Cember();
        cember01.yariCapiGuncelle(14);
        System.out.println("çember 01 " + cember01.alanHesapla());

        Cember cember02 = new Cember();
        cember01.yariCapiGuncelle(1);
        cember02.yariCapiGuncelle(1);
        System.out.println("çember 01 " + cember01.alanHesapla());
        System.out.println("çember 02 " + cember02.alanHesapla());
    }
}
