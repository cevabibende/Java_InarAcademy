package chapters.chapter07.classroom;

import java.util.Scanner;

public class GunleriTutanDizi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] gunler = {"PAzartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};
        System.out.println("haftanın günü için 1-7 arası bir sayı giriniz");
        int secim = input.nextInt();
        System.out.println("seçtiğin gün " + gunler[secim - 1]);
    }
}
