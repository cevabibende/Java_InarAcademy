package chapters.chapter05.checkpoint;

public class Cp_05_24_01 {
    public static void main(String[] args) {
        int balance = 10;
        while(true){
            if(balance < 9){
                break;
            }
            balance = balance -9;
        }
        System.out.println("balance is " + balance);
    }
}