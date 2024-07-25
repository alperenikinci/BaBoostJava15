package week04.kks.refactored;


import week04.kks.refactored.databases.KullaniciDB;
import week04.kks.refactored.databases.MailDB;
import week04.kks.refactored.databases.SMSDB;
import week04.kks.refactored.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        KullaniciDB kullaniciDB = new KullaniciDB();

        Kullanici kullanici = new Kullanici();
        kullanici.setIsim("Alperen");
        kullanici.setSoyisim("Ikinci");
        Kullanici kullanici1 = new Kullanici();
        kullanici1.setIsim("Alex");
        kullanici1.setSoyisim("Walker");
        kullaniciDB.saveAll(List.of(kullanici,kullanici1));
        System.out.println(kullaniciDB.findAll());


        kullanici1.setIsim("Joseph");
        kullaniciDB.update(kullanici1);

        MailDB mailDB = new MailDB();
        mailDB.save(new Mail());
        mailDB.save(new Mail());
        SMSDB smsdb = new SMSDB();
        smsdb.save(new SMS());
        smsdb.save(new SMS());

//        List<Kullanici> kullaniciList = kullaniciDB.findAll();
//        kullaniciList.get(1).setIsim("Joseph");

        System.out.println(kullaniciDB.findAll());
        System.out.println(mailDB.findAll());
        System.out.println(smsdb.findAll());
        System.out.println(kullaniciDB.findByID(1));

        BaseEntity entity = new Kullanici();
        BaseEntity baseEntity = new Mail();
        Message message = new Mail();
        BaseEntity baseEntity1 = new Message();
    }

}
