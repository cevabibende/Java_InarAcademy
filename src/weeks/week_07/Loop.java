package weeks.week_07;

public class Loop {
    public static void main(String[] args) {
        whileLoop(0);
        doWhileLoop(0);
        forLoop();

    }

    public static void forLoop(){
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
    public static void doWhileLoop(int counter){
        System.out.println("do-while");
        do{
            System.out.println(counter);
            counter++;
        }while (counter < 5);
        System.out.println("--------");
    }
    public static void whileLoop(int counter){
        while(counter < 5){
            System.out.println(counter);
            counter++;
        }
    }
}
