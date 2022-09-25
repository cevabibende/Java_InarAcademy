package weeks.week_07;

public class MethodWorks {
    public static void main(String[] args) {
        String s = "tarik";
        changeFirstCharacter(s);
        System.out.println(s);

    }

    private static void changeFirstCharacter(String s) {
        s.replace('a', 't');
    }
}
