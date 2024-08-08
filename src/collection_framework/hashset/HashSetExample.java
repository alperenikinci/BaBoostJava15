package collection_framework.hashset;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        //Setler ozgun degerler barindirir, ayni degeri iki kere saklamaz.
        Set<Integer> oddNumberSet = new HashSet<>();
        System.out.println("Yakin degerler verildiginde sirali bir sekilde sakliyor gibi gorunebilir...");
        oddNumberSet.add(1);
        oddNumberSet.add(3);
        oddNumberSet.add(5);
        oddNumberSet.add(7);
        oddNumberSet.add(8);
        oddNumberSet.add(9);

        System.out.println(oddNumberSet);

        System.out.println("Ancak -30 ve -6 sayisini ekledigimizde, bu siralama algoritmasi bozulacaktir. Rastgelelik isin icerisine dahil olacaktir...");
        oddNumberSet.add(-30);
        oddNumberSet.add(-6);
        System.out.println(oddNumberSet);
//        numberSet.add(41238);
//        numberSet.add(-12347);
//        numberSet.add(46578123);
//        numberSet.add(231579);
//        numberSet.add(1234165);

        System.out.println("Genel metotlari List ile aynidir.");
        System.out.println("Bir collection icerisinde bulunuyor mu diye bakabiliriz : .containsAll(-6,-30)");
        System.out.println(oddNumberSet.containsAll(List.of(-6, -30)));

        System.out.println("Icerisinden coklu veri silebilirim : .removeAll(-6,-30)");
        System.out.println(oddNumberSet.removeAll(List.of(-6, -30)));
        System.out.println(oddNumberSet);

        Set<Integer> evenNumberSet = new HashSet<>();
        evenNumberSet.add(2);
        evenNumberSet.add(4);
        evenNumberSet.add(6);
        evenNumberSet.add(8);
        System.out.println();
        System.out.println("Even Numbers : " + evenNumberSet);
        System.out.println("Odd Numbers : " + oddNumberSet);
        System.out.println("evenNumbers.retainAll metodu ile kesisim kumesindeki elemanlari getirebiliriz. ( retainAll set'in yapisini degistirir. Kesisim kumesi yeni set olur)");
        evenNumberSet.retainAll(oddNumberSet);
        System.out.println("retainAll sonrasi evenNumberSet : " + evenNumberSet);

        Set<Integer> numberHashSet = new HashSet<>();
        numberHashSet.add(1);
        numberHashSet.add(2);
        numberHashSet.add(3);
        numberHashSet.add(4);
        numberHashSet.add(5);
        numberHashSet.add(6);
        numberHashSet.add(7);
        numberHashSet.add(8);
        numberHashSet.add(9);
        numberHashSet.add(10);
//        System.out.println(numberHashSet);
//        try {
//            for (Integer sayi : numberHashSet) {
//                numberHashSet.remove(sayi);
//            }
//        } catch (ConcurrentModificationException e) {
//            e.printStackTrace();
//            System.out.println(" HATA YAKALANDI...");
//            System.out.println(numberHashSet);
//        }

//        numberHashSet.removeIf(integer -> integer%2==0);
        System.out.println(numberHashSet);

        System.out.println("Iterator collection yapilari uzerinde guvenli gezinmeyi saglar.");
        Iterator<Integer> iterator = numberHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println("Has Next? : " +iterator.hasNext() );
            System.out.println(iterator.next());
            iterator.remove();
            System.out.println(numberHashSet);
        }

        //PATLAMAZ
//        for (int i = numberHashSet.size()-1;i>=0;i--){
//            numberHashSet.remove(i);
//            System.out.println(numberHashSet);
//        }
//        System.out.println("##" + numberHashSet);

        //PATLAR
//        int i = numberHashSet.size()-1;
//        for (Integer integer : numberHashSet){
//            if(i!=0){
//                numberHashSet.remove(i);
//                i--;
//            }
//        }





    }
}
