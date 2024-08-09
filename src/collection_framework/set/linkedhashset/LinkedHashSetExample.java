package collection_framework.set.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set<Integer> sayiHashSet  = new HashSet<>();
        sayiHashSet.addAll(Set.of(1,-10,20,30,3,-13,100,60,-6));
        System.out.println("HashSet : " +sayiHashSet);
        LinkedHashSet<Integer> sayiLinkedHashSet = new LinkedHashSet<>();
        sayiLinkedHashSet.addAll(Set.of(1,-10,20,30,3,-13,100,60,-6,null));
        System.out.println("\n1,-10,20,30,3,-13,100,60,-6");
        System.out.println("LinkedHashSetWithSet.of : " + sayiLinkedHashSet);
        System.out.println("Set.of metodu kendi ic dinamiginde sirali veri saklamadigi icin, " +
                "\nlinkedHashSet'e verileri atma sirasi benim Set.of'a ekleme siralamam ile ayni olmaz." +
                "\niceriye veri rastgele atilmis oldugu icin sira korunmamis gibi gozukse de, rastgele eklenme sirasi korunacaktir...");

        LinkedHashSet<Integer> sayiLinkedHashSetWithList = new LinkedHashSet<>();
        System.out.println("\n1,-10,20,30,3,-13,100,60,-6");
        sayiLinkedHashSetWithList.addAll(List.of(1,-10,20,30,3,-13,100,60,-6,-6,null));
        System.out.println("LinkedHashSetWithList.of : " + sayiLinkedHashSetWithList);
        System.out.println("List.of metodu ile verileri sirali saklayan bir liste yapisi kullandigimiz icin, " +
                "\nList.of'a ekledigim siralama, linkedlist'de de korunmaya devam etti. " +
                "\nBir liste her zaman bir set.addAll metoduna arguman olarak verilebilir. " +
                "\nListe elemanlari sete eklenmeden once ozgunluk kontrolunden gecer, tekrar eden degerler set'de tekrarlanmaz.");

    }

}
