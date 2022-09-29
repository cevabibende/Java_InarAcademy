package chapters.chapter05.exercises;

public class Exercise35_Summation {
    public static void main(String[] args) {



        double summation = 0;
        for (int i = 1; i <= 624; i++){
            summation += 1 / ( Math.pow(i , 0.5) + Math.pow((i + 1) , 0.5) );
        }
        System.out.println("from small number to large number: " + summation);
        summation = 0;
        for (int i = 624; i >= 1; i--){
            summation += 1 / ( Math.pow(i , 0.5) + Math.pow((i + 1) , 0.5) );
        }
        System.out.println("from large number to small number: " + summation);
    }
}
