package week03.day04;

import java.util.Scanner;

public class Question001 {
    /*
    1- Girilen kelimedeki Turkce karakterleri, Ingilizce karakterlere ceviren bir program yazalım.
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };

		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

    Örnegin;

    Çadır - > Cadir
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word : ");
        String word = scanner.nextLine();
        System.out.println(transformTurkishLetters(word));
    }

    public static String transformTurkishLetters(String word){
        String[] englishChars = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
        String[] turkishChars = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

        for (int i = 0; i<turkishChars.length;i++){
            word = word.replace(turkishChars[i],englishChars[i]);
        }
        return word;
    }
}
