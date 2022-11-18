package chapters.chapter11.exercises.Ex03;

import chapters.chapter09.exercises.Ex07.Account;

public class SavingsAccount extends Account {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withDraw(double amount) {
        if (getBalance() > amount) {
            setBalance(getBalance() - amount);
        }else {
            System.out.println("you cannot withdraw money because it is forbidden !!");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
