package chapters.chapter09.exercises.Ex07;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20_000);
        account.setAnnualInterestRate(4.5);
        account.withDraw(2_500);
        account.deposit(3_000);

        System.out.println("acoount id is: " + account.getId());
        System.out.println("balance is: " + account.getBalance());
        System.out.println("monthly interest is : " + account.getMonthlyInterest());
        System.out.println("Date that this acount was created: " + account.getDateCreated());
    }

}
