package collection_framework.ornekler;

import java.util.Scanner;
import java.util.Stack;

public class StackOrnek {

    static Scanner scanner = new Scanner(System.in);
    static Stack<Character> characterStack =  new Stack<>();
    public static void main(String[] args) {
        isPalindrome();
//        String kelime = "KULLUK";
//        kelimeyiStackeYerlestir(kelime);
//        kelimeyiCharCharYazdir(kelime);
//        System.out.println("\n#####\n");
//        System.out.println(characterStack);
//        stackErit();
    }


    private static String stringKelimeAl(){
        System.out.print("Lutfen bir kelime giriniz : ");
        return scanner.nextLine();
    }

    private static String kelimeyiStackeYerlestir(String kelime){
        for (int i = 0; i<kelime.length();i++){
            //alperen -> alperen -> LIFO -> nerepla
            characterStack.push(kelime.charAt(i));
        }
        return kelime;
    }
    private static void kelimeyiCharCharYazdir(String kelime){
        for (int i = 0; i<kelime.length();i++){
            System.out.println(kelime.charAt(i));
        }
    }

    private static void stackErit(){
        while (!characterStack.isEmpty()){
            System.out.println(characterStack.pop());
        }
    }

    private static boolean isPalindrome(){
       String kelime =  kelimeyiStackeYerlestir(stringKelimeAl());
       for (int i =0; i<(kelime.length()/2);i++) {
           if (kelime.charAt(i) != characterStack.pop()) {
               System.out.println("Kelime Palindrom Degildir!!!");
               return false;
           }
       }
        System.out.println("Kelime Palindromdur!!!");
        return true;
    }
}
