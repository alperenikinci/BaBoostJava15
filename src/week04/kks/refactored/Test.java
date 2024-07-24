package week04.kks.refactored;

public class Test {

    public static void main(String[] args) {
        Mail mail = new Mail();
        Mail mail2 = new Mail();
        Mail mail3 = new Mail();
        MailOzelListe mailOzelListe = new MailOzelListe();
        Mail[] mailList = {mail,mail2,mail3};
        mailOzelListe.addAll(mailList);
        mailOzelListe.list();

        KullaniciOzelListe kullaniciOzelListe = new KullaniciOzelListe();
        Kullanici kullanici = new Kullanici();
        Kullanici kullanici2 = new Kullanici();
        Kullanici kullanici3 = new Kullanici();

        kullaniciOzelListe.add(kullanici);
        kullaniciOzelListe.add(kullanici2);
        kullaniciOzelListe.add(kullanici3);
        kullaniciOzelListe.list();

        SMSOzelListe smsOzelListe = new SMSOzelListe();
        SMS sms = new SMS();
        SMS sms2 = new SMS();
        SMS sms3 = new SMS();

        smsOzelListe.add(sms);
        smsOzelListe.add(sms2);
        smsOzelListe.add(sms3);
        smsOzelListe.list();


        OzelListe mailOzelListe1 =  new MailOzelListe();
//        OzelListe<Mail> mailOzelListe1 =  new MailOzelListe();
        mailOzelListe1.add(new SMS());
        mailOzelListe1.add(new Mail());
        mailOzelListe1.add(new Mail());
        mailOzelListe1.add(new Mail());
        mailOzelListe1.add(new Mail());
        mailOzelListe1.list();

        String str = ((MailOzelListe) mailOzelListe1).domates;


    }
}
