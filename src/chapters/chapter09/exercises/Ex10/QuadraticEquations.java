package chapters.chapter09.exercises.Ex10;

public class QuadraticEquations {
    private double a;
    private double b;
    private double c;

    QuadraticEquations(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return Math.pow(getB(), 2) - (4 * getA() * getC());
    }

    public double getRoot1(){
        if (getDiscriminant() >= 0 ){
            return (-getB() + Math.sqrt(getDiscriminant())) / (2 * getA());
        }
        return 0;
    }

    public double getRoot2(){
        if (getDiscriminant() < 0 ){
            return (-getB() - Math.sqrt(getDiscriminant())) / (2 * getA());
        }
        return 0;
    }

    public void display(){
        if (getDiscriminant() > 0){
            System.out.println("the equation has two roots;");
            System.out.println("Root 1 : " + getRoot1());
            System.out.println("Root 2 : " + getRoot2());
        } else if (getDiscriminant() == 0){
            System.out.println("the equation has one root: " + getRoot1());
        }else {
            System.out.println("the equation has no root");
        }
    }
}
