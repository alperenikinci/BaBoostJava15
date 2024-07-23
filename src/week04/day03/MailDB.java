package week04.day03;

class MailDB {
    static MailOzelListe mailOzelListe = new MailOzelListe();

    static Mail save(Mail mail){
        return mailOzelListe.add(mail);
    }
    static Mail[] saveAll(Mail[] mailArr){
        return mailOzelListe.addAll(mailArr);
    }
    static Mail update(Mail mail){
        Mail[] mailDizisi = mailOzelListe.getMailDizisi();
        int index=0;
        for(Mail mail1: mailDizisi){
            if(mail1.getId() == mail.getId()){
                return mailOzelListe.replace(index,mail);
            }
            index++;
        }
        return null;
    }

    static Mail[] findAll(){
        Mail[] mailDizisi = mailOzelListe.getMailDizisi();
        for(Mail mail : mailDizisi){
            System.out.println(mail);
        }
        return mailDizisi;
    }

    static Mail findById(int id){
        Mail[] mailDizisi = mailOzelListe.getMailDizisi();
        for(Mail mail : mailDizisi){
            if (mail.getId()==id){
                return mail;
            }
        }
        return null;
    }
}
