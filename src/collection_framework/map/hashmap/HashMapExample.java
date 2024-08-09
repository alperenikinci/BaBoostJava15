package collection_framework.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer,String> languageHashMap = new HashMap<>();
        languageHashMap.put(1,"Turkce"); // entrySet -> girdiKumesi
        languageHashMap.put(2,"Ingilizce");
        languageHashMap.put(3,"Almanca");
        System.out.println(languageHashMap);
        System.out.println("3,Fransizca eklemesini yaptigimda, 3,Almanca değeri 3,Fransizca olacak sekilde guncellenir.");
        languageHashMap.put(3,"Fransizca");
        System.out.println(languageHashMap);

        System.out.println("languageHashMap.get(2) -> Key'i 2 olan degeri doner (Ingilizce)");
        System.out.println(languageHashMap.get(2));

        System.out.println("languageHashMap.keySet -> mapdeki keyleri bir set olarak doner.");
        System.out.println(languageHashMap.keySet());

        System.out.println("languageHashMap.values -> mapdeki valuelari bir collection olarak doner.");
        System.out.println(languageHashMap.values());

        System.out.println("languageHashMap.entrySet() -> Key-Value ciftini doner. entry -> girdi, Set -> kume");
        System.out.println(languageHashMap.entrySet());

        System.out.println("key varsa value'sunu don, yokse defaulttan 'not found' donsun. getOrDefault.");
        String value = languageHashMap.getOrDefault(1,"Not Found");
        System.out.println(value);
        String value1 = languageHashMap.getOrDefault(4,"Not Found");
        System.out.println(value1);

        System.out.println("Bir key var mi diye kontrol etmek istiyorum : .languageHashMap.containsKey(2) -> boolean doner...");
        if (languageHashMap.containsKey(2)){
            System.out.println("Map 2 anahtarini barindiriyor.");
        } else {
            System.out.println("Key bulunamadi...");
        }

        System.out.println("Bir value var mi diye kontrol etmek istiyorum : .languageHashMap.containsValue('Fransizca'') -> boolean doner...");
        if (languageHashMap.containsValue("Fransizca")){
            System.out.println("Map Fransizca degerini barindiriyor.");
        } else {
            System.out.println("Value bulunamadi...");
        }

        System.out.println("Belli bir key'deki value'yu degistirmek icin : .replace(k,v)");
        languageHashMap.replace(3,"Ispanyolca");
        System.out.println(languageHashMap);
        System.out.println("put ile replace arasindaki temel fark, put o key yok ise degeri olusturur ve eklerken," +
                "\nreplace sadece key var ise deger atamasi yapar...");

        System.out.println("Butun value'lari degistirmek icin : .replaceAll((k,v) - > v.toUpperCase)");
        languageHashMap.replaceAll((k,v) -> v.toUpperCase());
        System.out.println(languageHashMap);

        System.out.println("Bir entry silmek icin : remove(k) -> remove(3)");
        String value2 = languageHashMap.remove(3);
        System.out.println(languageHashMap);

        System.out.println("Bir entry silmek icin : remove(k,v) -> remove(1,'TURKCE')");
        System.out.println("key value pair dogru bir sekilde verildiginde siler ve true doner. Aksi takdirde silme islemi gerceklesmez, false doner.");
        Boolean isDeleted = languageHashMap.remove(1,"TURKCE");
        System.out.println(isDeleted);
        System.out.println(languageHashMap);

        languageHashMap.put(1, "TURKCE");
        languageHashMap.put(3, "FRANSIZCA");
        languageHashMap.put(4, "ALMANCA");
        languageHashMap.put(5, "ISPANYOLCA");
        System.out.println("Map'e yeni entryler ekledik : " + languageHashMap);

        //for(VeriTuru seslenis: VeriTurununKaynagi)
        for(Map.Entry<Integer,String> entry : languageHashMap.entrySet()){
            System.out.println("Key : " + entry.getKey());
            System.out.println("Value : " + entry.getValue() );
        }
    }
}
