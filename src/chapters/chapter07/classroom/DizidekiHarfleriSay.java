package chapters.chapter07.classroom;

import static chapters.chapter06.classroom.RassalKarakter.rassalKarakterBul;

public class DizidekiHarfleriSay {
    public static void main(String[] args) {
        char[] karakterDizisi = rasslaDiziYarat();
        karakterDizisiniYazdir(karakterDizisi);
        int[] sayac = harfleriSay(karakterDizisi);
        sayaciYazdir(sayac);
    }

    private static void sayaciYazdir(int[] sayac) {
        System.out.println("harflerin sayısını görüyoruz");
        for (int i = 0; i < sayac.length; i++) {
            System.out.print((char) ('a' + i) + ":" + sayac[i] + " ");
            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }

    private static int[] harfleriSay(char[] karakterDizisi) {
        int[] sayac = new int[26];
        for (int i = 0; i < karakterDizisi.length; i++){
            sayac[karakterDizisi[i] - 'a']++;
        }
        return sayac;
    }

    private static void karakterDizisiniYazdir(char[] karakterDizisi) {
        for (int i = 0; i < karakterDizisi.length; i++) {
            System.out.print(karakterDizisi[i] + " ");
            if((i + 1) % 20 == 0){
                System.out.println();
            }
        }
    }

    public static char[] rasslaDiziYarat() {
        char[] dizi = new char[100];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = RassalKarakterBul();
        }
        return dizi;
    }

    private static char RassalKarakterBul() {
        return (char) ((int)(Math.random() * 26) + 'a');
    }
}
