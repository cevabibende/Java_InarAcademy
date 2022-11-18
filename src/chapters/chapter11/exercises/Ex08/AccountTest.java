package chapters.chapter11.exercises.Ex08;

import java.util.ArrayList;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account(1122,1000,1.5,"George");
        account.deposit(50);
        account.deposit(60);
        account.deposit(70);

        account.withdraw(7);
        account.withdraw(6);
        account.withdraw(1);

        // System.out.println(account);
        System.out.println("**********************************************");
        ArrayList<Transaction> transactions=account.getTransaction();
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i).toString());
        }
    }
}
