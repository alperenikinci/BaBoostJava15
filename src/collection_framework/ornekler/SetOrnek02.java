package collection_framework.ornekler;

import java.util.HashSet;
import java.util.Set;

public class SetOrnek02 {
    private static Set<Character> tekrarEdenler = new HashSet<>();
    private static Set<Character> tekrarEtmeyenler = new HashSet<>();

    public static void main(String[] args) {

        String metin = "araba";
        tekrarEdenHarfler(metin);
    }

    public static void tekrarEdenHarfler(String kelime) {

        for (int i = 0; i < kelime.length(); i++) {
            char c = kelime.charAt(i);

            //a
            //true , false
            //r
            //true , false
            //a
            //true , true
            //b
            //true , false
            //a
            //false , false
            if (!tekrarEdenler.contains(c) && !tekrarEtmeyenler.add(c)) {
                tekrarEtmeyenler.remove(c);
                tekrarEdenler.add(c);
            }
        }

        System.out.println("Tekrar edenler");
        tekrarEdenler.forEach(System.out::println);

        System.out.println("Tekrar etmeyenler");
        tekrarEtmeyenler.forEach(System.out::println);

    }


}
