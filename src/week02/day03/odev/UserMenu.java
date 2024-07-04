package week02.day03.odev;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hosgeldiniz! / Welcome!");
        boolean entryMenuStatus = true;
        boolean innerMenuStatus;
        while (entryMenuStatus){
            System.out.println("\nLutfen goruntuleme dilini seciniz. / Please select display language.");
            System.out.println("1-- Turkish (TR)\n2-- English (EN)\n0-- Cikis / Exit");
            System.out.print("Seciminiz : /Your Selection : ");
            int selection = scanner.nextInt();
            innerMenuStatus = true;
            switch (selection){
                case 1: {
                    do {
                        System.out.println("\n0-- Cikis Yap");
                        System.out.println("1-- Merhaba Dunya yazdir.");
                        System.out.println("2-- Faktoriyel Hesapla.");
                        System.out.println("3-- Asal Sayi Kontrolu Yap.");
                        System.out.println("4-- Dil secim ekrani.");
                        System.out.print("Seciminiz : ");
                        selection = scanner.nextInt();
                        switch (selection){
                            case 1: {
                                System.out.println("Merhaba Dunya!");
                                break;
                            }
                            case 2: {
                                System.out.println("\n### FAKTORIYEL HESAPLAMA ###");
                                System.out.print("Lutfen faktoriyelinin hesaplanmasini istediginiz sayiyi giriniz : ");
                                int number = scanner.nextInt();
                                int factorial = 1;
                                for (int i = 2; i <=number; i++){
                                    factorial *= i;
                                }
                                System.out.println("Girdiginiz sayinin faktoriyeli : " + factorial);
                                break;
                            }
                            case 3: {
                                System.out.println("\n### ASAL SAYI HESAPLAMA ###");
                                System.out.print("Lutfen bir sayi giriniz : ");
                                long number = scanner.nextLong();
                                boolean isPrime = true;
                                long startTime;
                                long endTime;
                                long timeElapsed;
                                long sqrt = (long) Math.sqrt(number);
                                if(number <= 1 || number % 2 ==0 && number!= 2){
                                    System.out.println(number + " sayisi asal sayi degildir.");
                                } else if (number == 2){
                                    System.out.println(number + " sayisi asal sayidir.");
                                } else {
                                    startTime = System.nanoTime();
                                    for (long i = 3; i <= sqrt; i = i+2 ) {
                                        if (number % i == 0) {
                                            isPrime = false;
                                            break;
                                        }
                                    }
                                    endTime = System.nanoTime();
                                    timeElapsed = (endTime - startTime)/1000000;
                                    if(isPrime){
                                        System.out.println(number + " Sayisi asal sayidir.\nGecen sure:  " + timeElapsed);
                                    }else {
                                        System.out.println(number + " Sayisi asal sayi degildir.\nGecen sure: " + timeElapsed);
                                    }
                                }
                                break;
                            }
                            case 4: {
                                innerMenuStatus = false;
                                break;
                            }
                            case 0: {
//                                entryMenuStatus = false;
//                                innerMenuStatus = false;
                                System.out.println("Program sonlandırılmıştır! Gorusmek uzere!");
                                System.exit(1);
                                break;
                            }
                            default:{
                                System.out.println("Lutfen gecerli bir secim yapiniz. ");
                            }
                        }
                    } while (innerMenuStatus);
                    break;
                }
                case 2: {
                    while (innerMenuStatus){
                        System.out.println("\n0-- Exit");
                        System.out.println("1-- Hello World Output");
                        System.out.println("2-- Calculate Factorial");
                        System.out.println("3-- Check For Prime Number");
                        System.out.println("4-- Language Selection Menu");
                        System.out.print("Your Selection : ");
                        selection = scanner.nextInt();
                        switch (selection){
                            case 1: {
                                System.out.println("Hello World!");
                                break;
                            }
                            case 2: {
                                System.out.println("\n### FACTORIAL CALCULATION ###");
                                System.out.print("Please enter a number that you want the factorial to be calculated : ");
                                int number = scanner.nextInt();
                                int factorial = 1;
                                for (int i = 2; i <=number; i++){
                                    factorial *= i;
                                }
                                System.out.println("Factorial of entered number : " + factorial);
                                break;
                            }
                            case 3: {
                                System.out.println("\n### PRIME NUMBER CALCULATION ###");
                                System.out.print("Please enter a number : ");
                                long number = scanner.nextLong();
                                boolean isPrime = true;
                                long startTime;
                                long endTime;
                                long timeElapsed;
                                long sqrt = (long) Math.sqrt(number);
                                if(number <= 1 || number % 2 ==0 && number!= 2){
                                    System.out.println(number + " Is not a prime number.");
                                } else if (number == 2){
                                    System.out.println(number + " Is a prime number.");
                                } else {
                                    startTime = System.nanoTime();
                                    for (long i = 3; i <= sqrt; i = i+2 ) {
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
                                break;
                            }
                            case 4: {
                                innerMenuStatus = false;
                                break;
                            }
                            case 0: {
//                                entryMenuStatus = false;
//                                innerMenuStatus = false;
                                System.out.println("Program has been terminated! See you around!");
                                System.exit(1);
                                break;
                            }
                            default:{
                                System.out.println("Please select a viable option! ");
                            }
                        }
                    }
                    break;
                }
                case 0: {
                    entryMenuStatus = false;
                    System.out.println("Program sonlandırılmıştır! Gorusmek uzere!");
                    System.out.println("Program has been terminated! See you around!");
                    break;
                }
                default: {
                    System.out.println("Lutfen gecerli bir secim yapiniz!");
                    System.out.println("Please select a valid option!\n");
                }
            }
        }

    }
}
