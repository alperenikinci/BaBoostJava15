package week03.day05;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    /*
    1- Taş - Kağıt - Makas oyunu yapalım.
    Her turda skor gösterilecek, bilgisayar :
    oyuncu :
    Her turdan sonra bir tur daha oynamak ister misiniz (E/H) seklinde bir soru sorulacak.
    Cevap H ise final skor yazdirilacak ve oyun bitirilecek.
    */

    public static void main(String[] args) {
        String[] tkm = {"tas","kagit","makas"};
//        int tasCount = 0;
//        int kagitCount = 0;
//        int makasCount = 0;
//
//        for (int i = 0; i<100000000; i++){
//            String secim = rastgeleSecim(tkm);
//
//            if(secim.equalsIgnoreCase("tas")){
//                tasCount++;
//            } else if(secim.equalsIgnoreCase("kagit")){
//                kagitCount++;
//            } else {
//                makasCount++;
//            }
//        }

        int userSkor = 0;
        int pcSkor = 0;
        int berabere = 0;
        for (int i = 0; i<100000000; i++){
            String pcSecim = rastgeleSecim(tkm);
            String userSecim = rastgeleSecim(tkm);
            if(Math.random()<= 0.01){ //Math.random() -> 0.0...0.5....1.0;

                pcSkor++;

            } else {
                if (userSecim.equalsIgnoreCase(pcSecim)) {
                        berabere++;
                } else {
                    switch (userSecim) {
                        case "tas": {
                            if (pcSecim.equalsIgnoreCase("kagit")) {
                                pcSkor++;

                            } else {

                                userSkor++;

                            }
                            break;
                        }
                        case "kagit": {
                            if (pcSecim.equalsIgnoreCase("makas")) {

                                pcSkor++;

                            } else {

                                userSkor++;

                            }
                            break;
                        }
                        case "makas": {
                            if (pcSecim.equalsIgnoreCase("tas")) {

                                pcSkor++;

                            } else {

                                userSkor++;

                            }
                            break;
                        }
                        default: {
                        }
                    }
                }
            }
        }
        System.out.println("#### UYGULAMA SONLANDI ####");
        System.out.println("#### FINAL SKOR ####");
        System.out.println("Kullanici : " + userSkor/1000000.0 + "\nBilgisayar: " + pcSkor/1000000.0+"\nBeraberlik: " + berabere/1000000.0);
//        double tasOran = tasCount/1000000.0;
//        DecimalFormat df = new DecimalFormat("#.##");
//        String formatlanmisSonuc = df.format(tasOran);
//        System.out.println("Tas : " + formatlanmisSonuc);
//        double kagit = kagitCount/1000000.0;
//        DecimalFormat df1 = new DecimalFormat("#.##");
//        String formatlanmisSonuc1 = df.format(kagit);
//        System.out.println("Kagit : " + formatlanmisSonuc1);
//        double makas = makasCount/1000000.0;
//        DecimalFormat df2 = new DecimalFormat("#.##");
//        String formatlanmisSonuc2 = df.format(makas);
//        System.out.println("Makas : " + formatlanmisSonuc2);

        application(tkm);
    }

    private static void application(String[] tkm) {
        Scanner scanner = new Scanner(System.in);
        String kontrol = ""; // E / H
        int userSkor = 0;
        int pcSkor = 0;
        do {
            String pcSecim = rastgeleSecim(tkm);
            String userSecim = userSecim();

                if (userSecim.equalsIgnoreCase(pcSecim)) {
                    System.out.println("BERABERE!");
                    System.out.println("Skorunuz : " + userSkor + "\nBilgisayar Skoru : " + pcSkor);
                } else {
                    switch (userSecim) {
                        case "tas": {
                            if (pcSecim.equalsIgnoreCase("kagit")) {
                                System.out.println("KAYBETTINIZ!");
                                pcSkor++;
                                System.out.println("Skorunuz : " + userSkor + "\nBilgisayar Skoru : " + pcSkor);
                            } else {
                                System.out.println("KAZANDINIZ!");
                                userSkor++;
                                System.out.println("Skorunuz : " + userSkor + "\nBilgisayar Skoru : " + pcSkor);
                            }
                            break;
                        }
                        case "kagit": {
                            if (pcSecim.equalsIgnoreCase("makas")) {
                                System.out.println("KAYBETTINIZ!");
                                pcSkor++;
                                System.out.println("Skorunuz : " + userSkor + "\nBilgisayar Skoru : " + pcSkor);
                            } else {
                                System.out.println("KAZANDINIZ!");
                                userSkor++;
                                System.out.println("Skorunuz : " + userSkor + "\nBilgisayar Skoru : " + pcSkor);
                            }
                            break;
                        }
                        case "makas": {
                            if (pcSecim.equalsIgnoreCase("tas")) {
                                System.out.println("KAYBETTINIZ!");
                                pcSkor++;
                                System.out.println("Skorunuz : " + userSkor + "\nBilgisayar Skoru : " + pcSkor);
                            } else {
                                System.out.println("KAZANDINIZ!");
                                userSkor++;
                                System.out.println("Skorunuz : " + userSkor + "\nBilgisayar Skoru : " + pcSkor);
                            }
                            break;
                        }
                        default: {
                            System.out.println("Lutfen gecerli bir deger giriniz ! ");
                        }
                    }
                }
            System.out.print("Tekrar oynamak icin 'E' harfini giriniz :  ");
            kontrol = scanner.nextLine();

        } while (kontrol.equalsIgnoreCase("E"));
        System.out.println("#### UYGULAMA SONLANDI ####");
        System.out.println("#### FINAL SKOR ####");
        System.out.println("Kullanici : " + userSkor + "\nBilgisayar: " + pcSkor);
    }

    private static String userSecim() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen tas-kagit-makas uclusundan birini seciniz : ");
        String userSecim = scanner.nextLine();
        return userSecim;
    }

    private static String rastgeleSecim(String[] tkm) {
        Random random = new Random();
        String pcSecim = tkm[random.nextInt(tkm.length)];
       // pcSecim = tkm[(int) (Math.random()*2.1)];
        return pcSecim;
    }
}
