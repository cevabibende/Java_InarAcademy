package chapters.chapter07.classroom;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int i = binarysearch(list, 2);
        int j = binarysearch(list, 11);
        int k = binarysearch(list, 12);
        int l = binarysearch(list, 50);
        int m = binarysearch(list, 3);
        int n = binarysearch(list, 1);

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
    }

    public static int binarysearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}