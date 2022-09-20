package chapters.chapter05.checkpoint;

public class Cp_05_19 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < i; j++){
                System.out.println(i * j);
                count++;
            }
        }
        System.out.println("program runs " + count + " times");
    }
}