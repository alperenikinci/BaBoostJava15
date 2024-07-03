package week02.day03;

import java.util.Scanner;

public class Question001 {
    /*
    1- Kullanıcıdan 1'den 7'ye kadar bir sayı isteyelim.
    Bu sayıya denk gelen haftanın gününü çıktı olarak verelim.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen 1-7 arasinda bir sayi giriniz : ");
        int input = scanner.nextInt();

        switch (input){
            case 1 : {
                System.out.println("Pazartesi");
                break;
            }
            case 2 : {
                System.out.println("Sali");
                break;
            }
            case 3 : {
                System.out.println("Carsamba");
                break;
            }
            case 4 : {
                System.out.println("Persembe");
                break;
            }
            case 5 : {
                System.out.println("Cuma");
                break;
            }
            case 6 : {
                System.out.println("Cumartesi");
                break;
            }
            case 7 : {
                System.out.println("Pazar");
                break;
            }
            default:{
                System.out.println("Lutfen gecerli aralikta bir sayi giriniz! (1-7)");
            }
        }
    }
}
