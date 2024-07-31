package week06.day01.interfaceornekler;

public class Calisan {

    protected String isim;
    private String soyisim;
    private String unvan;
    private double maas;
    //init blogu
    {
        CalisanDB.calisanList.add(this);
    }

    public void maasAl(){
        System.out.println("Maas alindi");
    }

    public void izinAl(){
        System.out.println("Izin alindi");
    }

    public void fazlaMesaiYap(){
        System.out.println("Fazladan mesai yapildi");
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", unvan='" + unvan + '\'' +
                ", maas=" + maas +
                '}';
    }

    public String toStringTemplate(){
        return  "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", unvan='" + unvan + '\'' +
                ", maas=" + maas;
    }

}
