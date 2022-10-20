package chapters.chapter07.Exercise;

import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        System.out.println(Arrays.toString(arr));
        int[] newArr = new int[arr.length];
        System.out.println(Arrays.toString(newArr));

        int newIndex = exitDublicate(arr, newArr);
        endarray(newArr, newIndex);
    }

    private static void endarray(int[] newArr, int newIndex) {
        int[] endArr = new int[newIndex];
        for (int i = 0; i < newIndex; i++) {
            endArr[i] = newArr[i];
        }
        System.out.println(newIndex);
        System.out.println(Arrays.toString(endArr));
    }
    private static int exitDublicate(int[] arr, int[] newArr) {
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isHave = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == newArr[j]){
                    isHave =false;
                }
            }
            if (isHave){
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }
        return newIndex;
    }
}
