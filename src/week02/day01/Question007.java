package week02.day01;

import java.util.Scanner;

public class Question007 {
    /*
    7- Dışarıdan girilen bir sayının faktoriyelini alalım.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen faktoriyelinin hesaplanmasini istediginiz sayiyi giriniz : ");
        int number = scanner.nextInt();
        int factorial = 1;
        // Cozum 1
        for (int i = 2; i <=number; i++){
            factorial *= i;
        }
        // Cozum 2
        factorial = 1;
        while(number>=2){
            factorial *= number;
            number--;
        }
        System.out.println("Girdiginiz sayinin faktoriyeli : " + factorial);
    }
}
