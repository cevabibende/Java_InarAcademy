package weeks.week_07;

import java.util.Scanner;

public class IsUnique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime ya da cümle giriniz");
        String word = input.nextLine();
        word = word.toLowerCase();

        boolean isUnique = true;
        int l = word.length();
        for(int i = 0; i <= l; i++){
            for(int j = (i + 1); j <= (l-1); j++) {
                if (word.charAt(i) == word.charAt(j)){
                    isUnique = false;
                }
            }
        }
        if(isUnique){
            System.out.println(word + " is unique");
        }else {
            System.out.println(word + " is not unique");
        }
    }
}
