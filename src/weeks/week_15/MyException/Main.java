package weeks.week_15.MyException;

public class Main {
    public static void main(String[] args) throws TooHotCoffeeException {
        Person person = new Person();
        Coffee turkKahvesi = new Coffee("turkKahvesi", 45);
        person.drink(turkKahvesi);
    }
}
