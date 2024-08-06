package maratonlar.maraton01;

public class Question004 {
    /*
    Soru 4. (25p) String sınıf içinde bulunan istediğiniz 3 adet method u taklit edecek ve türkçe isimlendirilmiş
    metodları barındıran CustomStringTR isimli sınıf yazınız. Bu sınıfn içinde main metod olmasına gerek
    yoktur. Bu sorunun çözümü için açmış olduğunuz Soru4.java içindeki main metod içinde, bu sını�an bir
    nesne oluşturarak, nesne üzerinden metodlara erişim sağlayarak kullanınız. Örneğin;
    • length() yerine aynı işlevi yerine getiren uzunluk() metodunu yazmalısınız. Ayrıca uzunluk() metodunu
    yazarken length() metodunu kullanmamalısınız.
     */
    public static void main(String[] args) {
        String merhaba = "Merhaba";
//        System.out.println(merhaba.length());
//        System.out.println(CustomStringTR.uzunluk(merhaba));
        System.out.println(CustomStringTR.kucukHarfeCevir(merhaba));
        System.out.println(CustomStringTR.buyukHarfeCevir(merhaba));
    }
}
