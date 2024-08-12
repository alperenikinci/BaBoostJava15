package collection_framework.ornekler;

import java.util.*;

public class MapOrnek01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> frequence = new LinkedHashMap<>();

        System.out.print("Please enter a word: ");
        String userInput = sc.nextLine().toLowerCase();

        //mmerhaba
        //m map -> key : m , value : default(0)+1 = 1;
        //m map -> key : m , value : 1+1 = 2;
//        for (char c : userInput.toCharArray()){
//            frequence.put(c, frequence.getOrDefault(c, 0)+1);
//        }

        for (char c : userInput.toCharArray()) {
            if (frequence.containsKey(c)) {
                frequence.replace(c, frequence.get(c) + 1);
            } else {
                frequence.put(c, 1);
            }
        }

        frequence.forEach((k,v)-> System.out.println(k +": " +v));



    }
}
