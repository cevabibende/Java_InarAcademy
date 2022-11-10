package chapters.chapter09.classroom;

import java.util.Date;

public class TarihSinifi {
    public static void main(String[] args) {
        Date tarih = new Date();
        System.out.println(tarih.toString());

        tarih.setTime(Long.MAX_VALUE);
        System.out.println(tarih.toString());

        tarih.setTime(Integer.MAX_VALUE);
        System.out.println(tarih.toString());

    }
}
