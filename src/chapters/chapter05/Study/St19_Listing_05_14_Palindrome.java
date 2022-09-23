package chapters.chapter05.Study;

import java.sql.SQLOutput;
import java.util.Scanner;

public class St19_Listing_05_14_Palindrome {
    public static void main(String[] args) {
        System.out.println("write a sentence");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int low = 0;
        int high = s.length() - 1;
        boolean isPalindrom = true;
        while (low < high) {
            if(s.charAt(low) != s.charAt(high)) {
                isPalindrom = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrom) {
            System.out.println(s + " is a palindrome");
        }else {
            System.out.println(s + " is not a palindrome");
        }
    }
}

