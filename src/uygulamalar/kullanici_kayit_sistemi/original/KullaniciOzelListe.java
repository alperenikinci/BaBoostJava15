package uygulamalar.kullanici_kayit_sistemi.original;

import java.util.Arrays;

public class KullaniciOzelListe {

    private Kullanici[] kullaniciDizisi;
    private int boyut;

    KullaniciOzelListe(){
        kullaniciDizisi = new Kullanici[0];
}

    public Kullanici[] getKullaniciDizisi() {
            return kullaniciDizisi;
    }

    public Kullanici add(Kullanici kullanici){
        Kullanici[] tmp;
            tmp = new Kullanici[this.boyut+1];
            for (int i = 0; i<boyut; i++){
                tmp[i] = kullaniciDizisi[i];
            }
            tmp[this.boyut] = kullanici;
            kullaniciDizisi = tmp;
            this.boyut++;
        return kullaniciDizisi[boyut-1];
    }


    public void remove(int index){

        if ((this.boyut-1)<index){
            try {
                throw new ArrayIndexOutOfBoundsException("");
            } catch (ArrayIndexOutOfBoundsException e ){
                System.out.println("Dizide "  + index +". eleman bulunmamakta.");
            }
        }else {
            try {
                Kullanici[] tmp = new Kullanici[this.boyut - 1];
//            int j = 0;
                for (int i = 0; i < tmp.length; i++) {
                    if (i < index) {
                        tmp[i] = kullaniciDizisi[i];
                    } else {
                        tmp[i] = kullaniciDizisi[i + 1];
                    }
                }
                kullaniciDizisi = tmp;
                boyut--;
            } catch (NegativeArraySizeException e) {
                System.out.println("Dizide cikarilabilecek eleman bulunmamaktadir. ( Dizi BOS!! ) ");
            }
        }

    }

    public void list(){
        System.out.print("{");
        for (int i = 0; i<boyut; i++){
            System.out.print(kullaniciDizisi[i]);
            if(i != boyut-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

    public Kullanici[] addAll(Kullanici[] kullaniciDizisi){
        for (int i = 0; i<kullaniciDizisi.length;i++){
            add(kullaniciDizisi[i]);
        }
        return kullaniciDizisi;
    }
    public void removeAllIndexes(int[] indexesToBeRemoved){
       Arrays.sort(indexesToBeRemoved);
        for (int i = indexesToBeRemoved.length-1; i>=0;i--){
            remove(indexesToBeRemoved[i]);
        }
    }

    public Kullanici replace(int index, Kullanici kullanici) {
      return kullaniciDizisi[index] = kullanici;
    }
}
