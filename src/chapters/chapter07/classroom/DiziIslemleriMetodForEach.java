package chapters.chapter07.classroom;

import java.util.Scanner;

public class DiziIslemleriMetodForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int DIZI_UZUNLUGU = 10;
        int[] dizi = new int[DIZI_UZUNLUGU];

        diziyiRassalSayilarlaDoldur(dizi);
        diziyiYazdir(dizi);
        dizidekiElemanlerinToplaminiYazdir(dizi);
        dizininEnBuyukElemaniniVeIndexiniYazdir(dizi);
        diziyiKaristir(dizi);
        diziyiYazdir(dizi);
        diziyiSolaKaydir(dizi);
        diziyiYazdir(dizi);
    }
    private static void diziyiSolaKaydir(int[] dizi) {
        int ilkEleman = dizi[0];
        for (int i = 0; i < dizi.length - 1; i++) {
            dizi[i] = dizi[i + 1];
        }
        dizi[dizi.length - 1] = ilkEleman;
    }
    private static void diziyiKaristir(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            int rassalIndex = (int)(Math.random() * dizi.length);
            int gecici = dizi[i];
            dizi[i] = dizi[rassalIndex];
            dizi[rassalIndex] = gecici;
        }
    }
    private static void dizininEnBuyukElemaniniVeIndexiniYazdir(int[] dizi) {
        int enBuyukEleman = 0;
        int enBuyukElemaninIndexi = -1;
        for (int i = 0; i < dizi.length; i++) {
            if(enBuyukEleman < dizi[i]){
                enBuyukEleman = dizi[i];
                enBuyukElemaninIndexi = i;
            }
        }
        System.out.println("dizinin en büyük elemanı: " + enBuyukEleman);
        System.out.println("dizinin en büyük elemanın en küçük indexi: " + enBuyukElemaninIndexi);
    }
    private static void dizidekiElemanlerinToplaminiYazdir(int[] dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        System.out.println("dizinin elemanları toplamı: " + toplam);
    }
    private static void diziyiYazdir(int[] dizi) {
        int satirsayaci = 0;
        for (int sayi : dizi) {
            satirsayaci++;
            System.out.printf("%3d", dizi[sayi]);
            if(satirsayaci % 10 == 0){
                System.out.println();
            }
        }
    }
    private static void diziyiRassalSayilarlaDoldur(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int)(Math.random() * 100);
        }
    }
}
