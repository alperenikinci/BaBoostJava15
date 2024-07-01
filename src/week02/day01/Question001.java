package week02.day01;

public class Question001 {
    /*
    1- Bir ürünün fiyatında %18 KDV ve %25 KAR olduğunu biliyoruz. bir ürün fiyatım olsun.
    Bu ürün fiyatından ham fiyatını bulalım.
     */
    public static void main(String[] args) {
        float rawPrice = 0, price = 100, vatRatio = 0.18f, profitRatio = 0.15f, priceWithoutVat;
        priceWithoutVat= price -(price * vatRatio);
        System.out.println("KDV'siz fiyat : " + priceWithoutVat);
        rawPrice = priceWithoutVat - (priceWithoutVat * profitRatio);
        System.out.println("Ham Fiyat : " + rawPrice);
    }
}
