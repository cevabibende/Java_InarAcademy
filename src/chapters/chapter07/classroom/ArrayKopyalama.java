package chapters.chapter07.classroom;

public class ArrayKopyalama {
    public static void main(String[] args) {

        refefransKopyalamasi();
        System.out.println("--------------------------");
        degerKopyalamasi();
    }

    public static void degerKopyalamasi() {
        int[] dizi1 = {1, 2, 3};
        int[] dizi2 = {4, 5, 6};
        System.out.println("dizi1[0] " + dizi1[0]);
        System.out.println("dizi2[0] " + dizi2[0]);
        for (int i = 0; i < 3; i++) {
            dizi2[i] = dizi1[i];
        }
        System.out.println("dizi1[0] " + dizi1[0]);
        System.out.println("dizi2[0] " + dizi2[0]);
        dizi2[2] = 99;
        System.out.println("dizi1[2] " + dizi1[2]);
    }

    public static void refefransKopyalamasi() {
        int[] dizi1 = {1, 2, 3};
        int[] dizi2 = {4, 5, 6};
        System.out.println("dizi1[0] " + dizi1[0]);
        System.out.println("dizi2[0] " + dizi2[0]);
        dizi2 = dizi1;
        System.out.println("dizi1[0] " + dizi1[0]);
        System.out.println("dizi2[0] " + dizi2[0]);

        dizi2[2] = 99;

        System.out.println("dizi1[2] " + dizi1[2]);
    }
}
