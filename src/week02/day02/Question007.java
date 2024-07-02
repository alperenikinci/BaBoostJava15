package week02.day02;

import java.util.Scanner;

public class Question007 {
    /*
    7- Girilen sayının 5'in kuvveti olup olmadığını bulan program.
     */
    public static void main(String[] args) {
        // 5 * 5 * 5 * 5 = 625
        // 625 / 5 / 5 / 5 / 5 = 1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int number = scanner.nextInt();
        int tempNumber = number;
        int power = 0;
        boolean control = true;
        while(control){
            if(tempNumber % 5 == 0){
                tempNumber = tempNumber / 5;
                power++;
            } else if(tempNumber == 1){
                break;
            }else {
                control = false;
            }
        }
        if(control){
            System.out.println("Girdiginiz " +number + " sayisi 5'in "+ power + ". kuvvetidir.");
        } else{
            System.out.println("Girdiginiz " +number + " sayisi 5'in kuvveti değildir ");
        }
    }
}
