package chapters.chapter07.classroom;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class OrtalamaninÜzerindekiSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ortalama hesaplamak için kaç sayı girmek istiyorsunuz");
        int donguSayisi = input.nextInt();
        System.out.println("sayıları giriniz");

        double toplam = 0;
        double[] dizi = new double[donguSayisi];

        for (int i = 0; i < donguSayisi; i++) {
            dizi[i] = input.nextDouble();
            toplam += dizi[i];
        }
        double ortalama = toplam / donguSayisi;
        System.out.println("girilen sayıların ortalaması: " + ortalama);

        int ortalamadanBuyukOgrenciSayisi = 0;
        for (int i = 0; i < dizi.length; i++) {
            if(ortalama < dizi[i]){
                ortalamadanBuyukOgrenciSayisi++;
            }
        }
        System.out.println("girilen " + donguSayisi + " sayıda " + ortalamadanBuyukOgrenciSayisi + " tane ortalamanın üstünde sayı vardır.");
    }
}
