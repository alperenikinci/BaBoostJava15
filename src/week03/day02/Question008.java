package week03.day02;

import java.util.Arrays;

public class Question008 {
    /*
    8- String'i parçalara ayıralım, bir array'e kaydedelim. Sonra aşağıdaki örnek çıktıyı almaya çalışalım;
    "Adana şehrinin plaka kodu : 01"
    Aşağdaki şehirler tek bir String degerdir.
    -> 01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya
     */
    public static void main(String[] args) {
        String cityStr = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
        String[] cityArr = cityStr.split(";");
        int index;
        String cityName;
        String plateNumber;

        for (String city: cityArr){
            index = city.indexOf("-");
            cityName = city.substring(index+1);
            plateNumber = city.substring(0,index);
            System.out.println(cityName + " has plate number of : " + plateNumber);
        }
    }
}
