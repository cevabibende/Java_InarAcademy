package chapters.chapter07.study;

public class Listing_7_8_SelectionSort {
    public static void main(String[] args) {
        double[] list = {2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
         for (int i = 0; i < list.length - 1; i++) {
             // Find the minimum in the list[i..list.length-1]
             double currentMin = list[i];
             int currentMinIndex = i;

             for (int j = i + 1; j < list.length; j++) {
                 if (currentMin > list[j]) {
                     currentMin = list[j];
                    currentMinIndex = j;
                     }
                 }

             // Swap list[i] with list[currentMinIndex] if necessary
             if (currentMinIndex != i) {
                 list[currentMinIndex] = list[i];
                 list[i] = currentMin;
                 }
             }
         }
 }
