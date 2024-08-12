package collection_framework.ornekler;

import java.util.HashSet;
import java.util.Set;

public class SetOrnek01 {

    private Set<String> kategoriSet = new HashSet<>();

    public static void main(String[] args) {
        SetOrnek01 uygulama = new SetOrnek01();

        System.out.println(uygulama.kategoriEkle2("Bilim Kurgu"));
        System.out.println(uygulama.kategoriEkle2("Dram"));
        System.out.println(uygulama.kategoriEkle2("Bilim Kurgu"));
        System.out.println(uygulama.kategoriSet);
    }


    public String kategoriEkle(String kategori) {
//        kategori = kategori.toUpperCase();
        if (kategoriSet.contains(kategori)) {
            return "Kategori daha önce eklenmiş: " + kategori;
        }
        kategoriSet.add(kategori);
        return "Kategori başarıyla eklendi: " + kategori;
    }

    public String kategoriEkle2(String kategori) {
        if (kategoriSet.add(kategori)) {
            return "Kategori başarıyla eklendi: " + kategori;
        }
        return "Kategori daha önce eklenmiş: " + kategori;
    }

}
