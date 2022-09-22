package chapters.chapter05.Study;

public class St14_CaseStudyPredictingFutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;
        while (tuition < 20000){
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println("After " + year + " years, the tuition will be " + ((int)(tuition * 100) / 100.0));
    }
}
