package collection_framework.ornekler;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueOrnek01 {

    static Queue<String> biletSirasi = new LinkedList<>();
    static Random random = new Random();
    public static void main(String[] args) {
        sirayaKisiEkle();
        biletSatis();
    }

    private static void biletSatis(){
        int biletSayisi = random.nextInt(7,13);
        int satilanBilet = 0;
        do {
            System.out.println(biletSirasi.poll() + " biletini aldi...");
            satilanBilet++;
            biletSayisi--;
            if (biletSayisi > 0 && biletSirasi.isEmpty()) {
                System.out.println("Toplam " + satilanBilet + " adet bilet satildi... Kalan bilet : " + biletSayisi);
                break;
            } else if(biletSayisi== 0) {
                System.out.println("Toplam " + satilanBilet + " adet bilet satildi... Stoklar tukenmistir...");
                break;
            }
        } while(!biletSirasi.isEmpty());

    }

    private static void sirayaKisiEkle(){
        biletSirasi.add("Alex");
        biletSirasi.add("Alperen");
        biletSirasi.add("Harun");
        biletSirasi.add("Emirhan");
        biletSirasi.add("Mehmet");
        biletSirasi.add("Ahmet");
        biletSirasi.add("Selin");
        biletSirasi.add("Evrim");
        biletSirasi.add("Burak");
        biletSirasi.add("Baris");
    }
}
