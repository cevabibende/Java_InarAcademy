package weeks.week_13;

public class Home {
    private double yuzOlcumu;
    private int banyoSayisi;
    private int odaSayisi;
    private boolean garajVarmi;
    private double ucreti;
    private double kiraucreti;
    private String cephesi;
    private int yil;


    public Home() {
        this(0, 0, 0, false, 0, 0, "", 0);
    }

    public Home(double yuzOlcumu, int banyoSayisi, int odaSayisi, boolean garajVarmi, double ucreti, double kiraucreti, String cephesi, int yil) {
        this.yuzOlcumu = yuzOlcumu;
        this.banyoSayisi = banyoSayisi;
        this.odaSayisi = odaSayisi;
        this.garajVarmi = garajVarmi;
        this.ucreti = ucreti;
        this.kiraucreti = kiraucreti;
        this.cephesi = cephesi;
        this.yil = yil;
    }


    public double getYuzOlcumu() {
        return yuzOlcumu;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public boolean isGarajVarmi() {
        return true;
    }

    public double getUcreti() {
        return ucreti;
    }

    public double getKiraucreti() {
        return kiraucreti;
    }

    public String getCephesi() {
        return cephesi;
    }

    public int getYil() {
        return yil;
    }

    public void renovation(){
        this.ucreti = (int)(this.ucreti * 1.1);
        this.kiraucreti = (int)(this.getKiraucreti() * 1.2);
    }

    public void print() {
        System.out.println("yüz ölçümü " + getYuzOlcumu());
        System.out.println("banyo sayısı " + getBanyoSayisi());
        System.out.println("oda sayisi " + getOdaSayisi());
        System.out.println("garaj varmı " + (isGarajVarmi() ? "evet" : "hayır"));
        System.out.println("ücreti " + getUcreti());
        System.out.println("kira ücreti " + getKiraucreti());
        System.out.println("evin cephesi " + getCephesi());
        System.out.println("inşaa yılı " + getYil());

    }


}