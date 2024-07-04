package week02.day04;

import java.util.Scanner;

public class Question001 {
    /*
    1- Dışarıdan bir string girdisi alalım. Bu stringin her bir harfini, bulunduğu index ile birlikte alt alta yazdıracağım.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String entry = scanner.nextLine();
        System.out.println("Character\tIndex");
        for (int i = 0;i<entry.length();i++){
            char ch = entry.charAt(i);
            System.out.println(ch+"\t\t\t"+i);
        }
    }
}
