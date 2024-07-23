package week04.day03;

/*default*/ class KullaniciDB {
    static KullaniciOzelListe kullaniciOzelListe = new KullaniciOzelListe();

    static Kullanici save(Kullanici kullanici){
        return kullaniciOzelListe.add(kullanici);
    }
    static Kullanici[] saveAll(Kullanici[] kullaniciArr){
        return kullaniciOzelListe.addAll(kullaniciArr);
    }
    static Kullanici update(Kullanici kullanici){
        Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
        int index=0;
        for(Kullanici user: kullaniciDizisi){
            if(user.getId() == kullanici.getId()){
                return kullaniciOzelListe.replace(index,kullanici);
            }
            index++;
        }
        return null;
    }

    static Kullanici[] findAll(){
        Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
        for(Kullanici kullanici : kullaniciDizisi){
            System.out.println(kullanici);
        }
        return kullaniciDizisi;
    }

    static Kullanici findById(int id){
        Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
        for(Kullanici kullanici : kullaniciDizisi){
            if (kullanici.getId()==id){
                return kullanici;
            }
        }
        return null;
    }

    static boolean existsByUsername(String username) {
        for (Kullanici kullanici : kullaniciOzelListe.getKullaniciDizisi()) {
            if (kullanici.getKullaniciAdi().equals(username)){
                return true;
            }
        }
        return false;
    }

    static boolean existsByTcKimlik(String tcKimlik) {
        for (Kullanici kullanici : kullaniciOzelListe.getKullaniciDizisi()) {
            if (kullanici.getTcKimlik().equals(tcKimlik)){
                return true;
            }
        }
        return false;
    }
    static boolean existsByEmail(String email) {
        for (Kullanici kullanici : kullaniciOzelListe.getKullaniciDizisi()) {
            if (kullanici.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    static Kullanici findByUsernameAndPassword(String username, String password){
        for (Kullanici kullanici : kullaniciOzelListe.getKullaniciDizisi()){
            //TODO try catch e al.
            if(kullanici.getKullaniciAdi().equals(username)&& kullanici.getSifre().equals(password)){
                return kullanici;
            }
        }
        return null;
    }

    static Kullanici findByTcEmailPhoneNo(String tcKimlik, String email, String telNo) {
        for (Kullanici kullanici : kullaniciOzelListe.getKullaniciDizisi()){
            if(kullanici.getTcKimlik().equals(tcKimlik) && kullanici.getEmail().equals(email)&& kullanici.getTelNo().equals(telNo)){
                return kullanici;
            }
        }
        return null;
    }
}
