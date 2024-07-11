package week03.day04;

import java.util.Scanner;



public class Question002 {
    /*
    2- Kullanicidan 2 ya da 3 adet sayi alacagiz. (Kullanici belirtecek).

    2 sayi girilecekse bir metot icerisinde 2 adet sayi alip, toplama islemini yapip sonucu dondurelim.

    3 adet sayi girilecekse ayni isimli overloaded bir metot yazalim ve sayilari disaridan parametre olarak overloaded metoda vererek sayilari toplayalim.

    Yani;
    Main'de kac sayi alacagini ogren. Gelecek sayi miktarina gore kullanacagin metodu sec ve direktiflere gore metodu tasarla.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will you enter (2/3) ? : ");
        int count = scanner.nextInt();
        scanner.nextLine();
        switch (count){
            case 2:{
                int sum = sumNumbers();
                System.out.println(sum);
                break;
            }
            case 3:{
                System.out.print("Please enter the first number : ");
                int number1 = scanner.nextInt();
                System.out.print("Please enter the second number : ");
                int number2 = scanner.nextInt();
                System.out.print("Please enter the third number : ");
                int number3 = scanner.nextInt();
                int sum = sumNumbers(number1,number2,number3);
                System.out.println(sum);
                break;
            }
            default:{
                System.out.println("Please enter a valid option ! (2/3)");
                break;
            }
        }
    }

    private static int sumNumbers(int number1, int number2, int number3) {
        return number1+number2+number3;
    }

    private static int sumNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number : ");
        int number1 = scanner.nextInt();
        System.out.print("Please enter the second number : ");
        int number2 = scanner.nextInt();
        scanner.nextLine();
        return number1 + number2;
    }
}
