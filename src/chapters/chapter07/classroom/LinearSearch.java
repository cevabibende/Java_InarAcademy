package chapters.chapter07.classroom;

public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2 };

        int j = getLinearSearch(list, 4);
        int k = getLinearSearch(list, 5);
        int t = getLinearSearch(list, -2);

        System.out.println(j);
        System.out.println(k);
        System.out.println(t);
    }

    public static int getLinearSearch(int[] list, int anahtar) {
        for (int i = 0; i < list.length; i++) {
            if(anahtar == list[i]){
                return i;
            }
        }
        return -1;
    }
}
