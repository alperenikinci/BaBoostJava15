package week04.day01.maraton01;

public class Question002 {
    /*
    Soru 2. (15p) Bir dizide tekrar eden ilk sayıyı bulan ve ekrana yazdıran bir sta�c metod yazınız. Metod
    parametre olarak int dizisi alacak ve ilk tekrar eden sayıyı bulup, kaç defa tekrar e�ğini ekrana yazdıracak�r.
    Tekrar eden sayı bulunmazsa “Tekrar eden sayı bulunamamış�r.” yazacak�r
     */
    public static void main(String[] args) {
        int sayiDizisi[] = { 9, 5, -7, 11,17, 3, 18, 2, 0,-7 };
        tekrarEdenSayiyiBul(sayiDizisi);
    }

    public static void tekrarEdenSayiyiBul(int[] sayiDizisi){
        boolean tekrarVarMi = false;
        int tekrarBaslangicIndex = -1; //
        int tekrarSayisi = 0;
        for (int i = 0; i<sayiDizisi.length-1;i++){
            if(!tekrarVarMi){
                for (int j = i+1; j<sayiDizisi.length;j++){
                    if(sayiDizisi[i] == sayiDizisi[j]){
                        tekrarBaslangicIndex = i;
                        tekrarVarMi = true;
                        break;
                    }
                }
            }
            if(tekrarVarMi){
                tekrarSayisi = tekrarSayisiBul(sayiDizisi, tekrarBaslangicIndex);
                System.out.println(sayiDizisi[tekrarBaslangicIndex] + " sayisi " + tekrarSayisi + " kere tekrar etmektedir.");
                break;
            }
        }
        if (!tekrarVarMi){
            System.out.println("Dizide tekrar eden sayi bulunmamaktadir.");
        }

    }

    public static int tekrarSayisiBul(int[] sayiDizisi, int tekrarBaslangicIndex) {
        int adet = 0;
        int tekrarEdenSayi = sayiDizisi[tekrarBaslangicIndex];
        for (int i = tekrarBaslangicIndex; i<sayiDizisi.length; i++){
            if(sayiDizisi[i] == tekrarEdenSayi ){
                adet++;
            }
        }
        return adet;
    }
}
