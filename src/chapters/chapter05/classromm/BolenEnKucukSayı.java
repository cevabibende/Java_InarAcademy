package chapters.chapter05.classromm;

import java.util.Scanner;

public class BolenEnKucukSayı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int n = input.nextInt();

        int bolen = 2;
        while (bolen <= n){
            if(n % bolen == 0) {
                break;
            }
            bolen++;
        }
        System.out.println(n + " sayısını bolen birden büyük en küçük sayı: " + bolen + " dir");
    }
}
