package weeks.week_13;

public class TestHome {
    public static void main(String[] args) {
        Home home = new Home();
        home.print();
        System.out.println("---------------------");
        Home home1 = new Home(140, 3, 4, true, 800800, 12000, "güney", 1957);
        home1.print();
        System.out.println("$$$$$$$$$$$$$$$$$$");
        home1.renovation();
        home1.print();
    }
}
