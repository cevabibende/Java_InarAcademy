package chapters.chapter07.classroom;

import java.util.Scanner;

public class DiziIslemleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int DIZI_UZUNLUGU = 1;

        int[] dizi = new int[DIZI_UZUNLUGU];
        System.out.println("lütfen " + dizi.length + "  tane sayı giriniz");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = input.nextInt();
        }

        dizi = new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.printf("%3d", dizi[i]);
            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }

        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        System.out.println("dizinin elemanları toplamı: " + toplam);

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

        for (int i = 0; i < dizi.length; i++) {
            int rassalIndex = (int)(Math.random() * dizi.length);
            int gecici = dizi[i];
            dizi[i] = dizi[rassalIndex];
            dizi[rassalIndex] = gecici;
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.printf("%3d", dizi[i]);
            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }


        int ilkEleman = dizi[0];
        for (int i = 0; i < dizi.length - 1; i++) {
            dizi[i] = dizi[i + 1];
        }
        dizi[dizi.length - 1] = ilkEleman;

        for (int i = 0; i < dizi.length; i++) {
            System.out.printf("%3d", dizi[i]);
            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }
}
