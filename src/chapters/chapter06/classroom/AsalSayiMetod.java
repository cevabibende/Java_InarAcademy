package chapters.chapter06.classroom;

public class AsalSayiMetod {
    public static void main(String[] args) {

        System.out.println("ilk 500 asal sayi");
        asalSayiAdeti(500);
    }

    private static void asalSayiAdeti(int asalsayiadeti) {
        int asalSayiSayaci = 0;
        int sayi = 2;
        while(asalSayiSayaci < asalsayiadeti){
            if(asalMi(sayi)){
                System.out.printf("%8d", sayi);
                asalSayiSayaci++;
                if(asalSayiSayaci % 10 == 0){
                    System.out.println();
                }
            }
            sayi++;
        }
    }

    public static boolean asalMi(int sayi){
        for(int i = 2; i < sayi; i++){
            if(sayi % i == 0){
                return false;
            }
        }
        return true;
    }

}
