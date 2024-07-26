package uygulamalar.kullanici_kayit_sistemi.refactored;

import uygulamalar.kullanici_kayit_sistemi.refactored.entities.Kullanici;
import uygulamalar.kullanici_kayit_sistemi.refactored.entities.Mail;

public class Test {
    public static void main(String[] args) {
        Mail mail = new Mail();
        Kullanici kullanici = new Kullanici();
        kullanici.setEmail("alperen@gmail.com");
        Kullanici kullanici1 = new Kullanici();
        kullanici1.setEmail("ahmet@gmail.com");
        mail.setAlici(kullanici);
        mail.setGonderici(kullanici);
        mail.setBaslik("Baslik");
        mail.setIcerik("Icerik");
        System.out.println(mail);
    }
}
