package chapters.chapter06.classroom;

public class NPrintln {
    public static void main(String[] args) {
        nprintln("merhaba java!", 33);
    }

    private static void nprintln(String mesaj, int dongusayisi) {
        for(int j = 0; j < dongusayisi; j++){
            System.out.println(mesaj);
        }
    }
}
