package weeks.week_15.exeption;

import com.sun.deploy.net.proxy.ProxyUnavailableException;

import java.io.IOException;
import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {

        /*
        // runtime exception is UNCHECKED exception
        throw new RuntimeException("this is a run time exception by ınar");
        throw new ArithmeticException();

        //All the other exception (excluding runtime exception's subclasses) are CHECKED exception
        throw new IOException("this is IOException");

         */
        try {
            ioexception();
        }catch (IOException e) {
            System.out.println("the IOException is caught");
        }

        runTimeExpection();

    }

    private static void runTimeExpection() throws RuntimeException{
        System.out.println("this app throw run time exception");
        throw new RuntimeException();
    }

    private static void ioexception() throws IOException {
        throw new IOException();
    }
}
