package chapters.chapter07.classroom;

import java.util.Scanner;

public class YaziyiTerstenYazdir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("biryazı giriniz");
        String yazi = input.nextLine();

        char[] yaziDizisi = yazi.toCharArray();
        char[] yazininTersi = tersecevir(yaziDizisi);

        System.out.println("girdiğiniz yazının tersi : ");
        System.out.println(yazininTersi);
    }

    private static char[] tersecevir(char[] yaziDizisi) {
        char[] yazininTersi = new char[yaziDizisi.length];
        for (int i = 0 , j = yazininTersi.length - 1;  i < yazininTersi.length; i++ , j--) {
            yazininTersi[j] = yaziDizisi[i];
        }
        return yazininTersi;
    }
}
