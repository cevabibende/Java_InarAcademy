package chapters.chapter07.classroom;

public class SelectionSort {
         public static void selectionSort(double[] list) {
            for (int i = 0; i < list.length - 1; i++) {
                 double currentMin = list[i];
                 int currentMinIndex = i;
                 for (int j = i + 1; j < list.length; j++) {
                 if (currentMin > list[j]) {
                         currentMin = list[j];
                         currentMinIndex = j;
                         }
                     }
                 if (currentMinIndex != i) {
                     list[currentMinIndex] = list[i];
                     list[i] = currentMin;
                     }
                 }
             }

    public static void main(String[] args) {
        double[] list = {3.5, 5.8, 6, 7.9, 1, 2.0};
        selectionSort(list);
        for (double d : list) {
            System.out.print(d + " ");
        }
    }
}
