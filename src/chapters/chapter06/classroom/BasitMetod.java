package chapters.chapter06.classroom;

public class BasitMetod {
    public static void main(String[] args) {
        System.out.println("1 den 10 kadar olan sayılar toplamı: " + toplam(1,10));
        System.out.println("15 den 44 kadar olan sayılar toplamı: " + toplam(15,44));
        System.out.println("30 ddn 33 kadar olan sayılar toplamı: " + toplam(30,33));
        System.out.println("3 ve 2 nin çarpım sonucu: " + carp(3,2));
        System.out.println("-4 sayısının işareti: " + sign(-4));
        System.out.println("başka class daki bir methodu kullandık max değer: " +  TestMax.max(5,24));
    }
    static int toplam(int sayi1, int sayi2){
        int toplam = 0;
        for(int i= sayi1; i <= sayi2; i++){
            toplam += i;
        }
        return toplam;
    }
    static int carp(int sayi1, int sayi2){
        int carpim = sayi1 * sayi2;

        return carpim;
    }

    static int sign(int n){
        if(n > 0){
            return 1;
        }else if(n == 0){
            return 0;
        }else{
            return -1;
        }
    }
}
