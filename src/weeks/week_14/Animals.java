package weeks.week_14;

/*
*Animal class
+ weight
+ height
+ hasSwimmingSkills
+ hasFlyingSkills
————————
+ runs
+ eats
+ sleeeps
 */

public class Animals {
    private double weight;
    private double height;
    private boolean isSwimmingSkills;
    private boolean isFlyingSkills;


    public Animals() {
        this(0, 0, false, false);
    }

    public Animals(double weight, double height, boolean isSwimmingSkills, boolean isFlyingSkills){
        this.weight = weight;
        this.height = height;
        this.isSwimmingSkills = false;
        this.isFlyingSkills = false;
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
        return this.isSwimmingSkills;
    }

    public boolean isFlyingSkills() {
        return this.isFlyingSkills;
    }

    private void runs(){
        System.out.println("Animal is running");
    }

    private void eats(){
        System.out.println("Animal is eating");
    }

    private void sleeps(){
        System.out.println("Animal is sleeping");
    }
}
