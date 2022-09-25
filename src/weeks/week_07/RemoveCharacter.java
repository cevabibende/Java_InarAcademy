package weeks.week_07;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two String Character");
        String ch1 = input.nextLine();
        String ch2 = input.nextLine();
        String result = "";

        int l1 = ch1.length();

        for(int i = 0; i < l1; i++){
            char ch = ch1.charAt(i);
            if(ch2.contains("" + ch) == false) {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
