package week02.day02.odev;

import java.util.Scanner;

public class PrimeNumber02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        long number = scanner.nextLong();
        boolean isPrime = true;
        long startTime;
        long endTime;
        long timeElapsed;
        if(number <= 1 || number % 2 ==0 && number!= 2){
            System.out.println(number + " Is not a prime number.");
        } else if (number == 2){
            System.out.println("else if bloğu");
            System.out.println(number + " Is a prime number.");
        } else {
            startTime = System.nanoTime();
            for (int i = 3; i < number; i = i+2) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            endTime = System.nanoTime();
            timeElapsed = (endTime - startTime)/1000000;
            if(isPrime){
                System.out.println(number + " Is a prime number.\ntimeElapsed: " + timeElapsed);
            }else {
                System.out.println(number + " Is not a prime number.\ntimeElapsed: " + timeElapsed);
            }
        }
    }
}
