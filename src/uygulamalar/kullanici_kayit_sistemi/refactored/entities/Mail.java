package uygulamalar.kullanici_kayit_sistemi.refactored.entities;

import java.time.LocalDate;

public class Mail extends Message {

    private static int mailCount = 0;
    private String baslik;


    public Mail(){
        this.mailCount++;
        this.id = mailCount;
        this.gonderilmeTarihi = LocalDate.now();
    }

    public static int getMailCount() {
        return mailCount;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "\ngonderen: "+ gonderici.getEmail() +
                "\nalici: "+alici.getEmail()+
                "\nbaslik: "+ baslik+
                "\nicerik: "+ icerik+
                "\n}";
    }
}
