package chapters.chapter09.classroom;

public class StatikDegisken {
    public static void main(String[] args) {
        System.out.println(Cember.nesneSayisi);

        Cember c1 = new Cember();
        System.out.println(c1.nesneSayisi);
    }
}
