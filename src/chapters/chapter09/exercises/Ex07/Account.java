package chapters.chapter09.exercises.Ex07;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMounthlyInterestRate(){
        return ((getAnnualInterestRate() / 12) / 100);
    }

    public double getMonthlyInterest(){
        return (getBalance() * getMounthlyInterestRate());
    }

    public void withDraw(double amount){
        setBalance(getBalance() - amount);
    }

    public void deposit(double amount){
        setBalance(getBalance() + amount);
    }
}
