package uygulamalar.kullanici_kayit_sistemi.original;

import java.util.Arrays;

public class MailOzelListe {

    private Mail[] mailDizisi;
    private int boyut;

    MailOzelListe(){
        mailDizisi = new Mail[0];
}

    public Mail[] getMailDizisi() {
            return mailDizisi;
    }

    public Mail add(Mail mail){
        Mail[] tmp;
            tmp = new Mail[this.boyut+1];
            for (int i = 0; i<boyut; i++){
                tmp[i] = mailDizisi[i];
            }
            tmp[this.boyut] = mail;
            mailDizisi = tmp;
            this.boyut++;
        return mailDizisi[boyut-1];
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
                Mail[] tmp = new Mail[this.boyut - 1];
//            int j = 0;
                for (int i = 0; i < tmp.length; i++) {
                    if (i < index) {
                        tmp[i] = mailDizisi[i];
                    } else {
                        tmp[i] = mailDizisi[i + 1];
                    }
                }
                mailDizisi = tmp;
                boyut--;
            } catch (NegativeArraySizeException e) {
                System.out.println("Dizide cikarilabilecek eleman bulunmamaktadir. ( Dizi BOS!! ) ");
            }
        }

    }

    public void list(){
        System.out.print("{");
        for (int i = 0; i<boyut; i++){
            System.out.print(mailDizisi[i]);
            if(i != boyut-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

    public Mail[] addAll(Mail[] mailDizisi){
        for (int i = 0; i<mailDizisi.length;i++){
            add(mailDizisi[i]);
        }
        return mailDizisi;
    }
    public void removeAllIndexes(int[] indexesToBeRemoved){
       Arrays.sort(indexesToBeRemoved);
        for (int i = indexesToBeRemoved.length-1; i>=0;i--){
            remove(indexesToBeRemoved[i]);
        }
    }

    public Mail replace(int index, Mail mail) {
      return mailDizisi[index] = mail;
    }
}
