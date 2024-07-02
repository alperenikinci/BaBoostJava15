package week02.day02;

import java.util.Scanner;

public class Question004 {
    /*
    4- Kulanıcının girdiği sayının çarpım tablosunu yazdıran program.
     (Kullanıcı 7 girdiğinde 7'nin çarpım tablosu elemanları görünecek. )
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int number = scanner.nextInt();

        for (int i = 1; i<=10;i++){
            System.out.println(i + "\tx\t"+ number + "\t=\t" + (i*number));
        }
    }
}
