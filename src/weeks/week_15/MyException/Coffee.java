package weeks.week_15.MyException;

public class Coffee {
    private String type;
    private int temp;

    public Coffee(int temp) {
        this("REGULAR", temp);
    }

    public Coffee(String type, int temp) {
        this.type = type;
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
}
