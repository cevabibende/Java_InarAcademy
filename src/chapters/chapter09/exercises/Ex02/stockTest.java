package chapters.chapter09.exercises.Ex02;

public class stockTest {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.println("price - change percentage : " + ((int)(stock.getChangePercent() * 100) / 100.0));
    }
}
