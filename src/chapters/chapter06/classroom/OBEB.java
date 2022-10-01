package chapters.chapter06.classroom;

import java.util.Scanner;

public class OBEB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz");
        int sayi1 = input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int sayi2 = input.nextInt();

        int obeb = obeb(sayi1, sayi2);
        System.out.println(sayi1 + " ve " + sayi2 + " sayilarının obebi " + obeb + " dir. ");

    }
    public static int obeb(int sayi1, int sayi2) {
        int obeb = 1;
        int bolen = 2;
        while (bolen <= sayi1 && bolen <= sayi2) {
            if(sayi1 % bolen == 0 && sayi2 % bolen == 0){
                obeb = bolen;
            }
            bolen++;
        }
        return obeb;
    }
}
