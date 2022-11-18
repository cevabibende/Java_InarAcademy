package chapters.chapter11.exercises.Ex02;

import javafx.scene.paint.PhongMaterial;

public class Person {

    private String name;
    private String adress;
    private String phoneNumber;
    private String emailAdress;

    public Person(String name, String adress, String phoneNumber, String emailAdress) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
    }

    public Person() {
        this.name = "NoEntery";
        this.adress = "NoEntery";
        this.phoneNumber = "NoEntery";
        this.emailAdress = "NoEntery";
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress() {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAdress() {
        return this.emailAdress;
    }

    public void setEmailAdress() {
        this.emailAdress = emailAdress;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", adress='" + adress + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", emailAdress='" + emailAdress + '\'' + '}';
    }

}
