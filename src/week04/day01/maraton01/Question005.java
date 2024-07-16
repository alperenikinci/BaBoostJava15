package week04.day01.maraton01;

import java.util.Scanner;

public class Question005 {
    /*
    Soru 5. (35p) Geometrik hesaplamalar yapan programı yazınız. Program aşağıdaki gibi bir menüsü olacak ve
aşağıdaki işlevleri yapacak�r:
* * * * * * * * * * ** * * * * * * *
* Geometrik Hesaplayıcı *
* * * * * * * * * * ** * * * * * * *
1. Kare alan hesaplama
2. Kare çevre hesaplama
3. Dikdörtgen alan hesaplama
4. Dikdörtgen çevre hesaplama
5. Daire alan hesaplama
6. Daire Çevre hesaplama
0. Çıkış
     */

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int input;
        do{
        System.out.println(
                "* * * * * * * * * * * * * * * * * \n" +
                        "* * * Geometrik Hesaplayıcı * * *\n" +
                        "* * * * * * * * * * * * * * * * * \n"+
                "1. Kare alan hesaplama\n" +
                "2. Kare çevre hesaplama\n" +
                "3. Dikdörtgen alan hesaplama\n" +
                "4. Dikdörtgen çevre hesaplama\n" +
                "5. Daire alan hesaplama\n" +
                "6. Daire Çevre hesaplama\n" +
                "0. Çıkış ");
        System.out.print("Lutfen bir secim yapiniz. : ");
        input = scanner.nextInt();
        menuOptions(input);
        } while (input!= 0);
    }

    public static void menuOptions(int input){
        double alan;
        double cevre;
        switch (input){
            case 1:{
                alan = kareAlaniHesapla();
                break;
            }
            case 2:{
                cevre = kareCevreHesapla();
                break;
            }
            case 3:{
                alan = dikdortgenAlanHesapla();
                break;
            }
            case 4:{
                cevre = dikdortgenCevreHesapla();
                break;
            }
            case 5:{
                alan = daireAlanHesapla();
                break;
            }
            case 6:{
                cevre = daireCevreHesapla();
                break;
            }
            case 0:{
                break;
            }
            default:{
                System.out.println("Lutfen gecerli bir secim yapiniz.");
                break;
            }
        }
    }



    private static double daireAlanHesapla() {
        System.out.println("\n##### DAIRE ALAN HESAPLAMA #####");
        System.out.print("Lutfen yaricap uzunlugunu giriniz : ");
        double yaricap = scanner.nextDouble();
        double alan = Math.PI*yaricap*yaricap;
        System.out.println("Yaricapi " + yaricap + " birim olan dairenin alanı : " + alan + " birimkaredir.\n");
        return alan;
    }

    private static double dikdortgenAlanHesapla() {
        System.out.println("\n##### DIKDORTGEN ALAN HESAPLAMA #####");
        System.out.print("Lutfen kisa kenar uzunlugu giriniz : ");
        double kisaKenar = scanner.nextDouble();
        System.out.print("Lutfen uzun kenar uzunlugu giriniz : ");
        double uzunKenar = scanner.nextDouble();
        double alan = kisaKenar * uzunKenar;
        System.out.println("Kısa kenari " + kisaKenar +" ve uzun kenari " + uzunKenar + " birim olan dikdortgenin alanı : " + alan + " birimkaredir.\n");
        return alan;
    }

    public static double kareAlaniHesapla() {
        System.out.println("\n##### KARE ALAN HESAPLAMA #####");
        System.out.print("Lutfen bir kenar uzunlugu giriniz : ");
        double kenar = scanner.nextDouble();
        double alan = kenar * kenar;
        System.out.println("Kenari " + kenar + " birim olan karenin alanı : " + alan + " birimkaredir.\n");
        return alan;
    }

    public static double kareCevreHesapla() {
        System.out.println("\n##### KARE CEVRE HESAPLAMA #####");
        System.out.print("Lutfen bir kenar uzunlugu giriniz : ");
        double kenar = scanner.nextDouble();
        double cevre = kenar*4;
        System.out.println("Kenari " + kenar + " birim olan karenin cevresi : " + cevre + " birimdir.\n");
        return cevre;
    }
    private static double dikdortgenCevreHesapla() {
        System.out.println("\n##### DIKDORTGEN Cevre HESAPLAMA #####");
        System.out.print("Lutfen kisa kenar uzunlugu giriniz : ");
        double kisaKenar = scanner.nextDouble();
        System.out.print("Lutfen uzun kenar uzunlugu giriniz : ");
        double uzunKenar = scanner.nextDouble();
        double cevre = 2*(kisaKenar + uzunKenar);
        System.out.println("Kısa kenari " + kisaKenar +" ve uzun kenari " + uzunKenar + " birim olan dikdortgenin cevresi : " + cevre + " birimdir.\n");
        return cevre;
    }

    private static double daireCevreHesapla() {
        System.out.println("\n##### DAIRE CEVRE HESAPLAMA #####");
        System.out.print("Lutfen bir kenar uzunlugu giriniz : ");
        double yaricap = scanner.nextDouble();
        double cevre = 2*Math.PI*yaricap;
        System.out.println("Yaricapi " + yaricap + " birim olan dairenin cevresi : " + cevre + " birimdir.\n");
        return cevre;
    }
}
