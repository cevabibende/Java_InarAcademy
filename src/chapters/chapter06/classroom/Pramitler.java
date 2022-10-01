package chapters.chapter06.classroom;

import java.util.Scanner;

public class Pramitler {
    public static void main(String[] args) {
        Scanner innput = new Scanner(System.in);
        System.out.println("satır sayısını giriniz");
        int num = innput.nextInt();
        for(int i = 1; i <= num; i++){
            ilkUcgen(num, i);
            ikinciUcgen(num, i);
            System.out.println();
        }
    }
    public static void ilkUcgen(int num, int i){
            for(int j = num - i; j >= 1; j--){
                System.out.print(" ");
            }
    }
    public static void ikinciUcgen(int num, int i){
            for(int j = i; j >= 1; j--){
                System.out.print(j);
        }
    }
}
