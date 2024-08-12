package collection_framework.ornekler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOrnek02 {
    Map<String, List<Integer>> ogrencilerVeNotlari = new HashMap<>();
    String[] ogrenci = {"Ayse", "Ece", "Mahmut"};
    int[][] notlar2 = {{50, 60, 60}, {60, 40, 80}, {80, 90, 100}};

    public static void main(String[] args) {

        MapOrnek02 mapOrnek02 = new MapOrnek02();
        mapOrnek02.mapOlustur2();
        mapOrnek02.mapYazdir();

    }

    public void mapOlustur() {
        for (int i = 0; i < ogrenci.length; i++) {
            List<Integer> liste = new ArrayList<>();
            for (int j = 0; j < notlar2[i].length; j++) {
                liste.add(notlar2[i][j]);
            }
            ogrencilerVeNotlari.put(ogrenci[i], liste);
        }
    }

    public void mapOlustur2() {
        for (int i = 0; i < ogrenci.length; i++) {
            for (int j = 0; j < notlar2[i].length; j++) {
                ogrencilerVeNotlari.putIfAbsent(ogrenci[i],new ArrayList<>());
                int not = notlar2[i][j];
                ogrencilerVeNotlari.get(ogrenci[i]).add(not);
            }
        }
    }
    public void mapYazdir() {
        for (Map.Entry<String, List<Integer>> ogrencilerVeNotlar : ogrencilerVeNotlari.entrySet()) {
            System.out.println(ogrencilerVeNotlar.getKey() + " =>> " + ogrencilerVeNotlar.getValue());
        }
    }
}