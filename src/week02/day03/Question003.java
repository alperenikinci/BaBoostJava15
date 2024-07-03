package week02.day03;

import java.util.Scanner;

public class Question003 {
    /*
    3- Girilen sayının mükemmel sayı olup olmadığını gösteren program.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i<=number/2;i++){
            if (number%i==0){
                sum+=i;
            }
        }
        if (number== sum){
            System.out.println("Girilen " + number + " sayisi Mukemmel sayidir.");
        } else{
            System.out.println("Girilen " + number + " sayisi Mukemmel sayi degildir.");
        }
    }
}
