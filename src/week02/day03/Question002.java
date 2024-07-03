package week02.day03;

import java.util.Scanner;

public class Question002 {
    /*
    2- Dışarıdan ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre bur. hesabı yapan program

Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart
     */

    public static void main(String[] args) {
        int day,month;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir ay giriniz: ");
        month = scanner.nextInt();
        System.out.print("Lutfen bir gun giriniz: ");
        day = scanner.nextInt();

        switch (month){
            case 1:{
                if(day <= 21){
                    System.out.println("Oglak");
                } else {
                    System.out.println("Kova");
                }
                break;
            }
            case 2:{
                if(day <= 19){
                    System.out.println("Kova");
                } else {
                    System.out.println("Balik");
                }
                break;
            }
            case 3:{
                if(day <= 20){
                    System.out.println("Balik");
                } else {
                    System.out.println("Koc");
                }
                break;
            }
            case 4:{
                if(day <= 20){
                    System.out.println("Koc");
                } else {
                    System.out.println("Boga");
                }
                break;
            }
            case 5:{
                if(day <= 21){
                    System.out.println("Boga");
                } else {
                    System.out.println("Ikizler");
                }
                break;
            }
            case 6:{
                if(day <= 22){
                    System.out.println("Ikizler");
                } else {
                    System.out.println("Yengec");
                }
                break;
            }
            case 7:{
                if(day <= 22){
                    System.out.println("Yengec");
                } else {
                    System.out.println("Aslan");
                }
                break;
            }
            case 8:{
                if(day <= 22){
                    System.out.println("Aslan");
                } else {
                    System.out.println("Basak");
                }
                break;
            }
            case 9:{
                if(day <= 22){
                    System.out.println("Basak");
                } else {
                    System.out.println("Terazi");
                }
                break;
            }
            case 10:{
                if(day <= 22){
                    System.out.println("Terazi");
                } else {
                    System.out.println("Akrep");
                }
                break;
            }
            case 11:{
                if(day <= 21){
                    System.out.println("Akrep");
                } else {
                    System.out.println("Yay");
                }
                break;
            }
            case 12:{
                if(day <= 21){
                    System.out.println("Yay");
                } else {
                    System.out.println("Oglak");
                }
                break;
            }
            default:
                System.out.println("Lutfen gecerli bir ay giriniz.");
                break;
        }
    }
}
