package week02.day01;

import java.util.Scanner;

public class Question006 {
    /*
    6- Dışarıdan 2 adet tam sayı değeri alalım.
    iki sayının toplamı çift ise true, değil ise false yazdıralım. Bu değerlerin bir de ortalamasını alalım ve yazdıralım.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1,number2;
        double average;
        boolean isEven;

        System.out.print("Birinci sayiyi giriniz : ");
        number1 = scanner.nextInt();

        System.out.print("Ikinci sayiyi giriniz : ");
        number2 = scanner.nextInt();
        average = (double) ( number1 + number2) / 2.0;

        isEven = ((number1 + number2)%2 == 0);
        System.out.println(average+" "+isEven);

    }
}
