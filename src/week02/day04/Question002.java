package week02.day04;

import java.util.Scanner;

public class Question002 {
    /*
    2- Dışarıdan bir değer alacağız. Bu değerin içerisinde kaç tane a harfi oldugunu yazdıracağız.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String input = scanner.nextLine();
        int index = 0;
        int count = 0;
        char ch = 'a';
        while(index<input.length()){
            if(input.charAt(index) == ch){
                count++;
            }
            index++;
        }
        System.out.println("Girdiginiz " + input + " kelimesinde " + count + " adet "+ ch + " harfi bulunmaktadır.");
    }
}
