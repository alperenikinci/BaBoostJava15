package week03.day02;

import java.util.Scanner;

public class Question001 {
    /*
    1- Dışarıdan girilen ülke ismi bizim array'imizde bulunuyor mu? Kontrol edelim.
    -> Türkiye, Japonya, Moğolistan, Amerika, Rusya, Çin
     */
    public static void main(String[] args) {
        String[] cityArr = {"Turkiye","Japonya","Mogolistan","Amerika","Rusya","Cin"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a city : ");
        String city = scanner.nextLine();
        boolean isCityPresent = false;

        for(int i = 0 ; i<cityArr.length;i++){
            if(cityArr[i].equalsIgnoreCase(city)){
                isCityPresent = true;
                break;
            }
        }
        if(isCityPresent){
            System.out.println("City exists in array.");
        } else {
            System.err.println("City does not exist in array.");
        }
    }
}
