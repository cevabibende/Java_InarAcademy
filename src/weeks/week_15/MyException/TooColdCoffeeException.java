package weeks.week_15.MyException;

public class TooColdCoffeeException extends RuntimeException{

    public TooColdCoffeeException() {
        super("this coffee is too cold");

    }
}
