package uygulamalar.kullanici_kayit_sistemi.original;


public class SMS extends Message{
    private static int smsCount = 0;

    @Override
    public String toString() {
        return "SMS toString";
    }

    public void smseHasMetot(){
        System.out.println("SMS'e Has Metot");
    }
}
