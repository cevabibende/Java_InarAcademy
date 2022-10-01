package chapters.chapter06.classroom;

public class OverLoading {
    public static void main(String[] args) {
        double d1 = 3.45;
        double d2 = 6.45;
        double max = max(d1, d2);
        System.out.println(max);
        System.out.println(max(3,5.87,7));
    }

    public static double max(double sayi1, double sayi2, double sayi3){
        return max(max(sayi1,sayi2),sayi3);
    }
    public static int max(int sayi1, int sayi2){
        return (sayi1 > sayi2) ? sayi1 : sayi2;
    }
        public static double max(double sayi1, double sayi2){
        double max;
        if(sayi1 > sayi2){
            max = sayi1;
        }else{
            max = sayi2;
        }
        return  max;
    }
}
