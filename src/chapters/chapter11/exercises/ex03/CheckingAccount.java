package chapters.chapter11.exercises.ex03;

import chapters.chapter09.exercises.Ex07.Account;

import java.util.Date;

public class CheckingAccount extends Account {
    private double limit;

    public CheckingAccount() {
        super();
        limit = -100;
    }


    public CheckingAccount(int id, double balance, double limit) {
        super(id, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void withDraw(double amount) {
        if (getBalance() - amount > limit) {
            setBalance(getBalance() - amount);
        } else
            System.out.println("you cannot take money poor guy your willings exceed limit !!!");

    }

    @Override
    public String toString() {
        return super.toString() + " the limit is " + limit + " $";
    }

}