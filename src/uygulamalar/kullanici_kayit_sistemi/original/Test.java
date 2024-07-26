package uygulamalar.kullanici_kayit_sistemi.original;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Mail mail = new Mail();
        Kullanici kullanici = new Kullanici();
        Kullanici kullanici2 = new Kullanici();


//        mail.setBaslik("Deneme");
        mail.setIcerik("Deneme icerigi");
        mail.setGonderici(kullanici);
        mail.setAlici(kullanici2);
//        SMS sms = new SMS();

//        System.out.println(MailDB.save(mail));

//        ArrayList<Message> arrayList = new ArrayList();
//
//
//        arrayList.add(sms);
//        arrayList.add(mail);
//
//        arrayList.forEach(System.out::println);
//
//        List<? extends  Number> arrayList2 = new Li();
//        Double doubleNumber = Double.valueOf(15.2);
//        Integer integer = 5;
//        arrayList2.add(Integer.valueOf(1));
//        arrayList2.add(integer);

        ArrayList<Integer> integerList = new ArrayList<>();
        arrListMethod(integerList);

        ArrayList<Double> doubleList = new ArrayList<>();
        arrListMethod(doubleList);

        Message mail1 = new Message(); //Sadece Message davranislarini ve ozelliklerini alir.
        // Message turunde mail1 degiskeninin, Message() constructoru ile bir instance'ını olusturduk.

        Message mail2 = new Mail();
        //Message davranislarini ve ozelliklerini alir, ancak potansiyelde Mail ozelliklerini de edinebilir.
        // Message turunde mail2 degiskeninin, Mail() constructoru ile bir instance'ını olusturduk.
        Message sms1 = new SMS();
        Mail mail3 = (Mail) mail2;
        mail3.maileHasMetot();
        ((Mail) mail2).maileHasMetot();
        if (mail1 instanceof Message){
            System.out.println("Merhaba dunya");
        }


        //Ozellikleri ve Davranisi Message olan ama Mail constructorundan uretilmis bir nesne.
        //Message gibi davranmaya calisan, ama ozellikle yonetildigi takdirde
        //@Override edilmis Message metotlari icin, mail davranisi sergilemeye calisir.

        arrListMethod2(sms1);
        System.out.println(mail1.domatesPatates());
    }
    public static List<? extends Number> arrListMethod(List<? extends Number> numberList){
        return numberList;
    }
    public static Message arrListMethod2(Message message){
        if(message instanceof Mail){
            ((Mail) message).setBaslik("Alperen");
            System.out.println(((Mail) message).getBaslik());
            ((Mail) message).maileHasMetot();
        }
        if(message instanceof SMS){
            System.out.println("Ben bir SMS'im");
            ((SMS) message).smseHasMetot();
        }
        System.out.println(message);
        return message;
    }
}
