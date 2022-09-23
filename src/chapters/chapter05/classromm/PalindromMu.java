package chapters.chapter05.classromm;

import java.util.Scanner;

public class PalindromMu {
    public static void main(String[] args) {
        System.out.println("bir kelime yada bir cümle girin");
        Scanner input = new Scanner(System.in);
        String cumle = input.nextLine();
        boolean palindromMu = true;
        for(int i = 0, j = cumle.length() - 1; i < j; i++, j--){
            char ch = cumle.charAt(i);
            char ch2 = cumle.charAt(j);
            if(ch != ch2){
                palindromMu = false;
                break;
            }
        }
        if (palindromMu){
            System.out.println(cumle + " bir palindromdur");
        }else {
            System.out.println(cumle + " bir palindrom değildir");
        }
    }
}
