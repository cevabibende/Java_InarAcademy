package chapters.chapter06.classroom;

public class Arttir {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("x in arttır metoduna gönderilmeden ömceki değeri: " + x);
        arttir(x);
        System.out.println("x in arttır metoduna gönderildikten sonraki değeri: " + x);
    }

    private static void arttir(int x) {
        x++;
        System.out.println("arttır metodunun içindeki x nin değeri: " + x);
    }
}
