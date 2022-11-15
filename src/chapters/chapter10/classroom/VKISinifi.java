package chapters.chapter10.classroom;

public class VKISinifi {
    public static void main(String[] args) {
        VKI vki1 = new VKI("ali",23, 89,1.83);
        VKI vki2 = new VKI("ayşe", 75,1.79);

        System.out.println(vki1.getIsim() + " için vki " + vki1.VKIHesapla() + " durumu " + vki1.durum());
        System.out.println(vki2.getIsim() + " için vki " + vki2.VKIHesapla() + " durumu " + vki2.durum());
    }

}
