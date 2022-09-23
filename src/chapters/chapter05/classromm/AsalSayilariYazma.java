package chapters.chapter05.classromm;

public class AsalSayilariYazma {
    public static void main(String[] args) {
        int asalSayiSayaci = 0;
        int sayi = 2;
        while (asalSayiSayaci < 50){
            boolean asalMi = true;

            for (int i = 2; i < sayi; i++){
                if(sayi % i == 0){
                    asalMi = false;
                }
            }
            if (asalMi == true){
                asalSayiSayaci++;
                System.out.println(asalSayiSayaci + ". asal sayı: " + sayi);
            }
            sayi++;
        }
    }
}
