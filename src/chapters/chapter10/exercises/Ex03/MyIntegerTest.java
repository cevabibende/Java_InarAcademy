package chapters.chapter10.exercises.Ex03;


public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger number01 = new MyInteger(35);


        System.out.println("getValues() : " + number01.getValues());
        System.out.println("isEven() : " + number01.isEven());
        System.out.println("isOdd() :" + number01.isOdd());
        System.out.println("isPrime() : " + number01.isPrime());
        System.out.println("----------------------------------------");



        System.out.println("isEven(new MyInteger(121)) "+ number01.isEven(new MyInteger(121)));
        System.out.println("isOdd(new MyInteger(121)) "+ number01.isOdd(new MyInteger(121)));
        System.out.println("isPrime(new MyInteger(121)) "+number01.isPrime(new MyInteger(121)));
        System.out.println("----------------------------------------");

        System.out.println("equals(85) :  " + number01.equals(35));
        System.out.println("number01.equals(new MyInteger(121) : " + number01.equals(new MyInteger(121)));
        System.out.println("----------------------------------------");

        char[] ch = {'1','2','3','4'};
        int number = MyInteger.parseInt(ch);
        System.out.println("char[]  -- {'1','2','3','4'} parseInt : " + number);
        System.out.println("----------------------------------------");


        String str ="345";
        int number02 = MyInteger.parseInt(str);
        System.out.println("parseInt(345) :" + number02);
        System.out.println("----------------------------------------");


    }
}
