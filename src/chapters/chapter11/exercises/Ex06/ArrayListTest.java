package chapters.chapter11.exercises.Ex06;

import chapters.chapter10.classroom.Listing10.Loan;
import chapters.chapter11.clasroom.Listing11.Circle;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new Loan());
        arrayList.add(new Date());
        arrayList.add("Add String");
        arrayList.add(new Circle(10));

        for (int i = 0; i < arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
            System.out.println("**************************");
        }
    }
}
