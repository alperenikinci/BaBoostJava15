package week02.day02;

import java.util.Scanner;

public class Question003 {
    /*
    3- Klavyeden 0 girilinceye kadar sayı okumaya devam edelim.
    0 girildiğinde sayıların toplamını ve ortalamasını ekrana yazdıralım.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        int total = 0;
        int inputCount = 0;
        while(true){ // -> while(input != 0) da olur
            System.out.print("Lutfen bir sayi giriniz (0 -> Cikis): ");
            input = scanner.nextInt();
            if(input != 0){
                total += input;
                inputCount++;
            } else if (input == 0 && inputCount == 0){
                System.out.println("Hicbir sayi girmediginz icin hesaplama yapilamiyor. ");
                break;
            } else {
                System.out.println("Sum : " + total);
                System.out.println("Average : " + ((float)total/inputCount));
                break;
            }
        }

    }
}
