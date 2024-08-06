package maratonlar.maraton01;

public class Question003 {
    /*
    Soru 3. (15p) karakterSayici isimli static bir Java metodu yazınız. Bu metod bir String bir de char değişkenini
    parametre olarak alacaktir. Fonksiyon paramtre olarak gelen String içindeki yine parametre olarak gelen
    karakterin sayısını sayıp return edecektir.
     */
    public static void main(String[] args) {
        String str = "Bugün güzel bir gün";
        char chr = 'g';
        int tekrarSayisi = karakterSayici(str,chr);
        System.out.println(tekrarSayisi);

        tekrarSayisi = karakterSayici(str,'x');
        System.out.println(tekrarSayisi);
    }

    public static int karakterSayici(String str, char chr) {
        int adet = 0;
        if(!str.contains(Character.toString(chr))){
            return adet;
        } else {
            for (int i = 0; i<str.length();i++){
                if(str.charAt(i) == chr){
                    adet++;
                }
            }
            return adet;
        }
    }
}
