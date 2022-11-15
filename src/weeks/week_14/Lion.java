package weeks.week_14;

/*
Lion class
+ tail
+ weight
+ height
+ hasSwimmingSkills
+ hasFlyingSkills
————————
+ runs
+ eats
+ sleeps
+ roar
 */

public class Lion {
    double tailsize;
    double weight;
    double height;
    boolean isSwimmingSkills;
    boolean isFlyingSkills;

    public Lion() {
        this(0, 0, 0, false, false);
    }

    public Lion(double tail, double weight, double height, boolean isSwimmingSkills, boolean isFlyingSkills){
        this.tailsize = tailsize;
        this.weight = weight;
        this.height = height;
        this.isSwimmingSkills = isSwimmingSkills;
        this.isFlyingSkills = isFlyingSkills;
    }

    public double getTail() {
        return this.tailsize;
    }

    public void setTail(double tail) {
        this.tailsize = tailsize;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isSwimmingSkills() {
        return true;
    }

    public boolean isFlyingSkills() {
        return true;
    }

    public void runs(){
        System.out.println("Lion is running");
    }

    public void eats(){
        System.out.println("Lion is eating");
    }

    public void sleeps(){
        System.out.println("Lion is sleeping");
    }

    public void roar(){
        System.out.println("Lion is roaring");
    }
}
