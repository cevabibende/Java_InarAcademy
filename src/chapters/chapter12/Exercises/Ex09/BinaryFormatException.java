package chapters.chapter12.Exercises.Ex09;

public class BinaryFormatException extends Exception{
    public BinaryFormatException() {
        super("this is not a binary number!!");
    }

    public BinaryFormatException(String message) {
        super(message);
    }
}
