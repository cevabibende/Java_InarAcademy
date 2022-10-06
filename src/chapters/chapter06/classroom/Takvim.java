package chapters.chapter06.classroom;

import javax.xml.transform.sax.SAXSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Takvim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter year (e.g. 2000)");
        int yil = input.nextInt();
        System.out.println("enter month number between 1 to 12");
        int ay = input.nextInt();
        takvimiYazdir(yil,ay);
    }
    private static void takvimiYazdir(int yil, int ay) {
        takvimBasliginiYazdir(yil, ay);
        takvimGovdesiniYazdir(yil, ay);
    }
    private static void takvimBasliginiYazdir(int yil, int ay){
        String ayinAdi = ayinIsminiBul(ay);
        System.out.println("          " + ayinAdi + "  " + yil);
        System.out.println("-----------------------------------");
        System.out.println(" pzt sal çrş prş cum cert paz");
    }

    private static String ayinIsminiBul(int ay) {
        switch (ay){
            case 1:
                return "Ocak";
            case 2:
                return "Şubat";
            case 3:
                return "Mart";
            case 4:
                return "Nisan";
            case 5:
                return "Mayıs";
            case 6:
                return "Haziran";
            case 7:
                return "Temmuz";
            case 8:
                return "Ağustos";
            case 9:
                return "Eylül";
            case 10:
                return "Ekim";
            case 11:
                return "Kasım";
            case 12:
                return "Aralık";
        }
        return "";
    }

    private static void takvimGovdesiniYazdir(int yil, int ay){
        int baslangicGunu = baslangicGununuBul(yil, ay);
        int aydakiGunuSayisi = birAydakiGunSayisiniBul(yil, ay);

        for (int i = 0; i < baslangicGunu; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= aydakiGunuSayisi ; i++) {
            System.out.printf("%4d",i);
            baslangicGunu++;
            if(baslangicGunu % 7 == 0){
                System.out.println();
            }
        }
    }

    private static int baslangicGununuBul(int yil, int ay) {
        final int OCAK_1_1800_GUNU = 2;
        int toplamGun = toplamGunSayisiniBul(yil, ay);

        return ( toplamGun + OCAK_1_1800_GUNU) % 7;


    }
    private static int toplamGunSayisiniBul(int yil, int ay) {
        int toplamGun = 0;
        for (int i = 1800; i < yil; i++) {
            toplamGun += artikyilMi(i) ? 366 : 365;
        }
        for (int i = 1; i < ay; i++) {
            toplamGun += birAydakiGunSayisiniBul(yil, i);
        }
        return toplamGun;
    }
    public static int birAydakiGunSayisiniBul(int yil, int ay){
        if(ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12 )
            return 31;
        if(ay == 4 || ay == 6 || ay == 9 || ay == 11 )
            return 30;
        if(ay == 2 )
            return artikyilMi(yil) ? 29 : 28;
        return 0;
    }

    private static boolean artikyilMi(int yil) {
        return (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);
    }


}
