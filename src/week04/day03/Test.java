package week04.day03;

public class Test {

    public static void main(String[] args) {
        Mail mail = new Mail();
        Kullanici kullanici = new Kullanici();
        Kullanici kullanici2 = new Kullanici();


        mail.setBaslik("Deneme");
        mail.setIcerik("Deneme icerigi");
        mail.setGonderici(kullanici);
        mail.setAlici(kullanici2);
        SMS sms = new SMS();
        System.out.println(MailDB.save(mail));





    }
}
