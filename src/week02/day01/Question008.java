package week02.day01;

import java.util.Scanner;

public class Question008 {
    /*
    8- 1'den başlayarak, kullanıcının girdiği sayıya kadar olan (sayı dahil) sayıların 1 fazlasının toplamını ekrana yazdıran program.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int number = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= number; i++){
            total = total + (i+1);
        }
        System.out.print("1'den girdiginiz sayiya kadar olan sayilarin 1 fazlasinin toplami : " + total);
        scanner.close();
    }
}
