package week04.kks.refactored;


import java.util.Arrays;

public class OzelListe<T> {
    private T[] veriDizisi;
    private int boyut;

    OzelListe(){
        veriDizisi = (T[]) new Object[0]; ;
}

    public T[] getVeriDizisi() {
            return veriDizisi;
    }

    public T add(T t){
        T[] tmp = (T[]) new Object[this.boyut+1];
            for (int i = 0; i<boyut; i++){
                tmp[i] = veriDizisi[i];
            }
            tmp[this.boyut] = t;
            veriDizisi = tmp;
            this.boyut++;
        return veriDizisi[boyut-1];
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
                T[] tmp = (T[]) new Object[this.boyut - 1];

                for (int i = 0; i < tmp.length; i++) {
                    if (i < index) {
                        tmp[i] = veriDizisi[i];
                    } else {
                        tmp[i] = veriDizisi[i + 1];
                    }
                }
                veriDizisi = tmp;
                boyut--;
            } catch (NegativeArraySizeException e) {
                System.out.println("Dizide cikarilabilecek eleman bulunmamaktadir. ( Dizi BOS!! ) ");
            }
        }

    }

    public void list(){
        System.out.print("{");
        for (int i = 0; i<boyut; i++){
            System.out.print(veriDizisi[i]);
            if(i != boyut-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

    public T[] addAll(T[] veriDizisi){
        for (int i = 0; i<veriDizisi.length;i++){
            add(veriDizisi[i]);
        }
        return veriDizisi;
    }
    public void removeAllIndexes(int[] indexesToBeRemoved){
       Arrays.sort(indexesToBeRemoved);
        for (int i = indexesToBeRemoved.length-1; i>=0;i--){
            remove(indexesToBeRemoved[i]);
        }
    }

    public T replace(int index, T t) {
      return veriDizisi[index] = t;
    }
}
