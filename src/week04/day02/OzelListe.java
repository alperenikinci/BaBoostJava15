package week04.day02;

import java.util.Arrays;

public class OzelListe {
    /*
    1- OzelListe isimli bir sinif olusturalim.
    Bu sinif icerisinde sayi dizisi ve dizi boyutu tutsun.
     */
    private int[] sayiDizisi;
    private int boyut;

    public int[] getSayiDizisi() {
            return sayiDizisi;
    }

    /*
    1.1 - OzelListe sınıfında add isimli bir metot yazalim.
    Bu metot kullanıcının dışarıdan parametre olarak verdiği int türünde sayiyi alacak ve sayi dizimize ekleyecek.
     */
        // 0,1,2,3
    public void add(int sayi){
        int[] tmp;
        if(sayiDizisi == null){
            sayiDizisi = new int[1];
            sayiDizisi[0] = sayi;
            this.boyut = 1;
        } else {
            tmp = new int[this.boyut+1]; // sayi dizimizin onceki size'ının bir fazlasi olacak. Cunku yeni "Bir" elaman ekliyoruz.
            for (int i = 0; i<boyut; i++){
                tmp[i] = sayiDizisi[i];
            }
            tmp[this.boyut] = sayi;
            sayiDizisi = tmp;
            this.boyut++;
        }
    }

    /*
    1.2 - OzelListe sınıfında remove isimli bir metot yazalim.
    Bu metot kullanıcının dışarıdan parametre olarak verdiği index'i silecek.
     */
    public void remove(int index){
        //10,15,20,25 -> Boyut 4, son index 3; 1. index'i cikaracagiz. Gormek istedigimiz sonuc -> 10,20,25 Boyut 3, son index 2;
        //0 ,1 ,2 ,3
        //10,20,25
        if ((this.boyut-1)<index){
            try {
                throw new ArrayIndexOutOfBoundsException("");
            } catch (ArrayIndexOutOfBoundsException e ){
                System.out.println("Dizide "  + index +". eleman bulunmamakta.");
            }
        }else {
            try {
                int[] tmp = new int[this.boyut - 1];
//            int j = 0;
                for (int i = 0; i < tmp.length; i++) {
                    if (i < index) {
                        tmp[i] = sayiDizisi[i];
                    } else {
                        tmp[i] = sayiDizisi[i + 1];
                    }
//            if(i != index){
//                tmp[i-j] = sayiDizisi[i];
//            } else {
//                j = 1;
//            }
                }
                sayiDizisi = tmp;
                boyut--;
            } catch (NegativeArraySizeException e) {
                System.out.println("Dizide cikarilabilecek eleman bulunmamaktadir. ( Dizi BOS!! ) ");
            }
        }

    }
    // 15,20,25,30,35  -> 25 cikarmak istedigimiz deger (index 2)
    // 1. Adım i = 0; if: True ->  tmp = { 15, 0, 0, 0};
    // 2. Adım i = 1; if: True -> tmp = {15,20,0,0};
    // 3. Adım i = 2; if: False -> tmp = {15,20,30,0};
    // 4. Adım i = 3; if: False -> tmp = {15,20,30,35};
    // 5. Adım i = 4; -> Dongu sonlanir.

    /*
    1.3 - list isimli bir metot daha yazalım.
    Bu metot listemizi { , , , , } formatında yazdırsın. Son eleman virgül problemini de çözelim.
     */

    public void list(){
        System.out.print("{");
        for (int i = 0; i<boyut; i++){
            System.out.print(sayiDizisi[i]);
            if(i != boyut-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

    /*
     1.4 - addAll isimli bir metot yazalım.
     Dışarıdan dizi alsın, aldığı dizinin elemanlarının hepsini sayı dizimize eklesin.
     */

    public void addAll(int[] sayiDizisi){
        for (int i = 0; i<sayiDizisi.length;i++){
            add(sayiDizisi[i]);
        }
    }
    public void removeAllIndexes(int[] indexesToBeRemoved){
       Arrays.sort(indexesToBeRemoved);
        for (int i = indexesToBeRemoved.length-1; i>=0;i--){
            remove(indexesToBeRemoved[i]);
        }
    }
}
