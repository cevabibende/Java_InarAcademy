package chapters.chapter07.classroom;
import java.util.Arrays;
public class DizilerEsitMi {
    public static boolean esitMi(int[] dizi1, int[] dizi2){
        if (dizi2 == dizi1){
            return true;
        }
        if (dizi2 != null && dizi1 == null){
            return false;
        }
        if (dizi1 != null && dizi2 == null){
            return false;
        }
        if (dizi1.length != dizi2.length){
            return false;
        }
        for (int i = 0; i < dizi1.length; i++) {
            if (dizi1[i] != dizi2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] dizi1 = {1, 2, 3, 4};
        int[] dizi2 = {1, 2, 3};
        int[] dizi3 = {1, 2, 3, 4};
        System.out.println(esitMi(dizi1,dizi2));
        System.out.println(Arrays.equals(dizi1,dizi2));
    }
}
