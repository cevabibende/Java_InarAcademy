package chapters.chapter10.classroom;

public class VKI {
    private String isim;
    private int yas;
    private double agirlik;
    private double boy;

    public VKI(String isim, int yas, double agirlik, double boy) {
        this.isim = isim;
        this.yas = yas;
        this.agirlik = agirlik;
        this.boy = boy;
    }

    public VKI(String isim, double agirlik, double boy){
        this(isim, 20, agirlik, boy);
    }

    public double VKIHesapla() {
        return agirlik / (boy * boy);
    }


    public String durum(){
        double vki = VKIHesapla();
        if (vki < 18.5) {
            return "çok zayıf";
        } else if (vki < 25) {
            return "normal";
        } else if (vki < 30) {
            return "kilolu";
        } else {
            return "obez";
        }
    }

    public String getIsim() {
        return isim;
    }

    public int getYas() {
        return yas;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public double getBoy() {
        return boy;
    }
}
