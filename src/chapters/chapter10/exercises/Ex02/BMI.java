package chapters.chapter10.exercises.Ex02;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public static final double KG_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;


    public BMI() {
        this("", 0,0,0);
    }

    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this("name", 15, weight, height);
    }

    // feet inch dönüşümü
    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = feet * 12 + inches;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getHeight() {
        return this.height;
    }


    public double getBMI(){
        double heightToMeters = this.height * METERS_PER_INCH;
        double weightToKG = this.weight * KG_PER_POUND;
        double bmi = weightToKG / (Math.pow(heightToMeters,2));
        return bmi;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Under Weight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Over weight";
        } else {
            return "Obese";
        }
    }

    public void disPlay() {
        System.out.println("BMI is " + this.name + getBMI() + " " + getStatus());
    }
}
