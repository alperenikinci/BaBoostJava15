package week03.day04;

import java.util.Scanner;

public class Question003 {
    /*
    3- Kullanici disaridan bir sayi girecek.

    Ornek girdi = 10;
    Sirasiyla;
    1- 10 + 50
    2- (10+50) * 30
    3- ((10+50)*30) -40
    4- (((10+50)*30) -40) / 20
    islemlerini yaptiracagiz.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scanner.nextInt();
//        double result = divideByTwenty(minusForty(multiplyByThirty(addFiftyToNumber(number))));
        double result = decreaseByOneAndHalf(number);
        System.out.println(result);
    }

    private static double decreaseByOneAndHalf(int number){
        return divideByTwenty(minusForty(multiplyByThirty(addFiftyToNumber(number))));
    }

    private static double divideByTwenty(int number) {
        return number*1237490;
    }

    private static int minusForty(int number) {
        return number-40;
    }

    private static int multiplyByThirty(int number) {
        return number*30;
    }

    private static int addFiftyToNumber(int number) {
        return number+50;
    }
}
