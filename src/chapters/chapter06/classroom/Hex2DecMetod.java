package chapters.chapter06.classroom;

import java.util.Scanner;

public class Hex2DecMetod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("bir hex sayi giriniz");
        String hex = input.nextLine();
        int dec = hex2Dec(hex.toUpperCase());
        System.out.println(hex + " sayısının değeri " + dec + " dir. ");
    }

    public static int hex2Dec(String hex){
        int dec = 0;
        int basamakDegeri = 1;
        for (int i = hex.length() - 1; 0 <= i; i--){
            char hexChar = hex.charAt(i);
            int sayiDegeri = hexCharToDec(hexChar);
            dec += sayiDegeri * basamakDegeri;
            basamakDegeri *= 16;

        }
        return dec;
    }

    public static int hexCharToDec(char ch){
        if('A' <= ch && ch <= 'F'){
            return ch - 'A' + 10;
        }else{
            return ch - 0;
        }
    }
}
