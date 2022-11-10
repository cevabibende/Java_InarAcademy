package chapters.chapter09.classroom;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        s = new Student();
        s.name = "Mahmut";
        System.out.println(s.name.charAt(0));
        System.out.println(s.gender);
    }
}
