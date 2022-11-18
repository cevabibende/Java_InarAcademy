package chapters.chapter11.exercises.Ex05;

public class CourseTest {
    public static void main(String[] args) {
        Course c1 = new Course("Inar");

        c1.addStudent("ali");
        c1.addStudent("veli");
        c1.addStudent("enes");
        c1.addStudent("ayşe");
        c1.addStudent("kayra");

        String[] students = c1.getStudents();
        displayArr(students);
        System.out.println("\nNumber of student : " + c1.getNumberOfStudent());
        System.out.println("------------------------------------------");

        c1.dropStudent("ayşe");
        c1.dropStudent("veli");
        students = c1.getStudents();
        System.out.println("After remove(ayşe and veli) :");
        displayArr(students);
        System.out.println("\nNumber of student : " + c1.getNumberOfStudent());


    }

    private static void displayArr(String[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
    }
}
