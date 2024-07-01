package week02.day01;

import java.util.Scanner;

public class Question004 {
    /*
    4- Kullanıcıdan önce yaşını, sonrasında da
    kullanıcının ismini girdi olarak isteyelim. İsmini ve yaşını ekrana yazdıralım.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz : ");
        int age = scanner.nextInt(); // ->  scanner.nextInt() + "\n"
        scanner.nextLine(); // -> bu bos nextLine() bir ust satirdaki "\n" i yutacak.
        System.out.print("Lutfen adinizi giriniz : ");
        String name = scanner.nextLine(); // -> bu nextLine kullanicinin girecegi stringi okur hale gelecek.
        scanner.close();
//        System.out.println(name + " " + age);

    }
}
