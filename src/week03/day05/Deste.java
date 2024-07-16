package week03.day05;

import java.util.Arrays;

public class Deste {
    public static void main(String[] args) {
        String[] renk = {"Maça", "Kupa", "Karo", "Sinek"};
        String[] sayi = {"2","3","4","5","6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        String[] deste = desteOlustur(renk,sayi);
//        Arrays.asList(deste).stream().forEach(System.out::println);
        String[] papazKacti = papazKacti(deste);
//        Arrays.asList(papazKacti).forEach(System.out::println);
        String[] altmisAlti = altmisAlti(deste);
        Arrays.asList(altmisAlti).forEach(System.out::println);
    }

    private static String[] altmisAlti(String[] deste) {
        String[] altmisAlti = new String[deste.length-(7*4)];
        int index = 0;
        for (String kart : deste){
            if(kart.contains("2")||kart.contains("3")||kart.contains("4")||kart.contains("5")||kart.contains("6")||kart.contains("7")||kart.contains("8")){
                continue;
            } else {
                altmisAlti[index] = kart;
                index++;
            }
        }
        return altmisAlti;
    }

    private static String[] papazKacti(String[] deste) {
        String[] papazKacti = new String[deste.length-3];
        int index = 0;
        for (String kart : deste){
            if(kart.equals("Karo K") || kart.equals("Kupa K") || kart.equals("Sinek K")){
                continue;
            } else {
                papazKacti[index] = kart;
                index++;
            }
        }
        return papazKacti;
    }

    private static String[] desteOlustur(String[] renk, String[] sayi) {
        String[] deste = new String[renk.length* sayi.length];
        int index = 0;
        for (int i = 0 ; i< renk.length;i++){
            for (int j = 0; j< sayi.length;j++){
                deste[index] = renk[i]+" "+sayi[j];
                index++;
            }
        }
        return deste;
    }


}
