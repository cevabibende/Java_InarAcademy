package chapters.chapter10.exercises.Ex09;

public class CourseTest {
    public static void main(String[] args) {
        Course c1 = new Course("Inar Academy");
        c1.addStudent("ali");
        c1.addStudent("ayşe");
        c1.addStudent("veli");
        c1.addStudent("derya");
        c1.displayStudent();

        System.out.println("****************************************");

        c1.dropStudent("derya");
        c1.displayStudent();

        System.out.println("****************************************");
        c1.clear();
        c1.displayStudent();
    }
}
