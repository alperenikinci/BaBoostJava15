package week04.kks.refactored.entities;

import java.time.LocalDate;

public class Message extends BaseEntity {

    protected Kullanici alici;
    protected Kullanici gonderici;
    protected String icerik;
    protected LocalDate gonderilmeTarihi;


    public Kullanici getAlici() {
        return alici;
    }

    public void setAlici(Kullanici alici) {
        this.alici = alici;
    }

    public Kullanici getGonderici() {
        return gonderici;
    }

    public void setGonderici(Kullanici gonderici) {
        this.gonderici = gonderici;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public LocalDate getGonderilmeTarihi() {
        return gonderilmeTarihi;
    }

    public void setGonderilmeTarihi(LocalDate gonderilmeTarihi) {
        this.gonderilmeTarihi = gonderilmeTarihi;
    }

    @Override
    public String toString() {
        return "Message toString";
    }
    public String domatesPatates(){
        return "Message Domates ve Patates";
    }
}
