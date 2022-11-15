package chapters.chapter11.exercises.ex03;

public class Test03 {
    public static void main(String[] args) {
        CheckingAccount check = new CheckingAccount(25, 25_000, 1_000);
        SavingsAccount save = new SavingsAccount(65, 10_000);

        check.withDraw(1_000);
        save.withDraw(100);

        System.out.println(check.toString());
        System.out.println("************************************");
        System.out.println(save.toString());
    }

}
