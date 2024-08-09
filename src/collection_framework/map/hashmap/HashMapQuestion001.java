package collection_framework.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapQuestion001 {
    public static void main(String[] args) {
        Map<Integer,Map<Integer,String>> integerMapMap = new HashMap<>();
        Map<Integer,String> integerStringMap = new HashMap<>();
        integerStringMap.put(1,"Merhaba");
        integerStringMap.put(2,"Dunya");
        integerStringMap.put(3,"Ben");
        integerStringMap.put(4,"Uzaydan");
        integerStringMap.put(5,"Geliyorum.");

        Map<Integer,String> integerStringMap2 = new HashMap<>();
        integerStringMap2.put(1,"Ne");
        integerStringMap2.put(2,"Mutlu");
        integerStringMap2.put(3,"Turkum");
        integerStringMap2.put(4,"Diyene");

        integerMapMap.put(1,integerStringMap);
        integerMapMap.put(2,integerStringMap2);

        for (Map.Entry<Integer,Map<Integer,String>> upperMap: integerMapMap.entrySet()){
            System.out.println("Key : " + upperMap.getKey());
            System.out.println("UpperValue : ");
            for (Map.Entry<Integer,String> lowerMap: upperMap.getValue().entrySet()){
                System.out.println("Inner Key : " + lowerMap.getKey());
                System.out.println("Inner Value : "+ lowerMap.getValue());
            }
        }



//        System.out.println(integerMapMap);
    }
}
