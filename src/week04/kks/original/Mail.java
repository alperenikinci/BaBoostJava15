package week04.kks.original;

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
        return "Mail toString";
    }

    @Override
    public String domatesPatates(){
        return "Mail Domates Ve Patates";
    }

    public void maileHasMetot(){
        System.out.println("MaileHasMetot");
    }
}
