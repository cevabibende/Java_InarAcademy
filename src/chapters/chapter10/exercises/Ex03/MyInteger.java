package chapters.chapter10.exercises.Ex03;

public class MyInteger {

    private int values;

    public MyInteger() {
        this(0);
    }

    public MyInteger(int values){
        this.values = values;
    }

    public int getValues() {
        return this.values;
    }

    public boolean isEven() {
        return this.values % 2 == 0;
    }

    public boolean isOdd() {
        return this.values % 2 != 0;
    }

    public  boolean isPrime() {

        for (int divisor = 2; divisor <= this.values / 2 ; divisor++) {
            if (this.values % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int values) {
        return this.values == values;
    }

    public boolean equals( MyInteger myInteger) {
        return this.values == myInteger.values;
    }

    public static int parseInt(char[] charArray) {
        String str = "";
        for (int i = 0; i < charArray.length; i++) {
            str += charArray[i];

        }
        return parseInt(str);
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}
