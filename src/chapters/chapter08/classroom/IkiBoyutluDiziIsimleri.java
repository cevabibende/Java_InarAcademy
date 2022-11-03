package chapters.chapter08.classroom;

public class IkiBoyutluDiziIsimleri {
    public static void main(String[] args) {
        int[][] ikiBoyutluDizi = new int[10][10];

        rassalDegerlerleDoldur(ikiBoyutluDizi);
        diziyiYazdir(ikiBoyutluDizi);
        int toplam = tumElemanlarinToplami(ikiBoyutluDizi);
        System.out.println("Matrisde ki elemanların toplamı " + toplam);
        sutunlarinToplaminiYazdir(ikiBoyutluDizi);
        toplamiEnBuyukSatirinIndexiniVeToplaminiYazdir(ikiBoyutluDizi);
        ikiBoyutluDiziyiKar(ikiBoyutluDizi);
        diziyiYazdir(ikiBoyutluDizi);
        
    }

    public static void ikiBoyutluDiziyiKar(int[][] ikiBoyutluDizi) {
        for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
            for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
                int rassalSatir = (int)(Math.random() * ikiBoyutluDizi.length);
                int rassalSutun = (int)(Math.random() * ikiBoyutluDizi[satir].length);

                int gecici = ikiBoyutluDizi[satir][sutun];
                ikiBoyutluDizi[satir][sutun] = ikiBoyutluDizi[rassalSatir][rassalSutun];
                ikiBoyutluDizi[rassalSatir][rassalSutun] = gecici;
            }
        }
    }

    public static void toplamiEnBuyukSatirinIndexiniVeToplaminiYazdir(int[][] ikiBoyutluDizi) {
        int enBuyukSatirToplami = -1;
        int enBuyukSatirIndexi = -1;

        for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
            int toplam = 0;
            for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
                toplam += ikiBoyutluDizi[satir][sutun];
            }
            if (toplam > enBuyukSatirToplami) {
                enBuyukSatirToplami = toplam;
                enBuyukSatirIndexi = satir;
            }
        }
        System.out.println((enBuyukSatirIndexi + 1) + ". satir toplamı en büyüktür " + enBuyukSatirToplami);
    }

    public static void sutunlarinToplaminiYazdir(int[][] ikiBoyutluDizi) {
        for (int sutun = 0; sutun < ikiBoyutluDizi[0].length; sutun++) {
            int toplam = 0;
            for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
                toplam += ikiBoyutluDizi[satir][sutun];
            }
            System.out.println((sutun + 1) + ". sutunun toplamı = " + toplam);
        }
    }
    public static int tumElemanlarinToplami(int[][] ikiBoyutluDizi) {
        int toplam = 0;
        for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
            for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
                toplam += ikiBoyutluDizi[satir][sutun];
            }
        }
        return toplam;
    }
    public static void diziyiYazdir(int[][] ikiBoyutluDizi) {
        for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
            for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
                System.out.printf("%3d", ikiBoyutluDizi[satir][sutun]);
            }
            System.out.println();
        }
    }
    public static void rassalDegerlerleDoldur(int[][] ikiBoyutluDizi) {
        for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
            for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
                ikiBoyutluDizi[satir][sutun] = (int)(Math.random() * 100);
            }
        }
    }
}
