package weeks.week_12;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String s1 = "I love Inar Academy";
        /*
        * I
        * love
        * Inar
        * Academy
         */
        String[] arr = s1.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
    }
}
