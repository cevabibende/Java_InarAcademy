package weeks.week_15.MyException;

public class Person {
    public void drink(Coffee coffee) throws TooHotCoffeeException {
        if (coffee.getTemp() > 80){
            throw new TooHotCoffeeException();
        } else if (coffee.getTemp() < 40) {
            throw new TooColdCoffeeException();
        }else {
            System.out.println("I drink coffe");
        }
    }
}
