package week02.day01;

import java.util.Scanner;

public class Question010 {
    /*
    10 - girilen sayının basamakları toplamını ekrana yazdıralım.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int number = scanner.nextInt();
        int total = 0;

        while(number > 0){
            int digitValue = number % 10;
            total += digitValue;
            number /= 10; // number = number / 10;
        }
        System.out.println("Girdiginiz sayinin basamak degerleri toplami : " + total);
    }
}
