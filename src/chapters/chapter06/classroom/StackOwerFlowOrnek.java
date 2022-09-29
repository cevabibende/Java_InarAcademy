package chapters.chapter06.classroom;

public class StackOwerFlowOrnek {
    public static void main(String[] args) {
        metod(0);
    }
    static void metod(int derinlikSayaci){
        derinlikSayaci++;
        System.out.println(derinlikSayaci);
        metod(derinlikSayaci);
    }
}
