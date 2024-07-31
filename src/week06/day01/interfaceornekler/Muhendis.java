package week06.day01.interfaceornekler;

public class Muhendis extends Calisan implements SahaCalismasiYapabilir,MaasaGoreUnvanAlabilir{

    private String patates;

    public Muhendis(String isim, String soyisim, double maas) {
        this.isim = isim;
        this.setSoyisim(soyisim);
        this.setMaas(maas);
        this.patates = "patates";
        setUnvan(maas);
    }

    @Override
    public void sahaCalismasiYap() {
        System.out.println("Muhendis saha calismasi yurutuyor...");
    }

    @Override
    public void setUnvan(double maas) {
        if(maas >= 50000){
            this.setUnvan("Uzman Muhendis");
        } else if(maas>=40000){
            this.setUnvan("Kidemli Muhendis");
        } else if(maas >= 30000){
            this.setUnvan("Muhendis");
        } else {
            this.setUnvan("Stajyer Muhendis");
        }
    }

//    @Override  -> Calisan metodunu ezerek getirme.
//    public void setUnvan(String unvan) {
//        double maas = this.getMaas();
//        if(maas >= 50000){
//            this.setUnvan("Uzman Muhendis");
//        } else if(maas>=40000){
//            this.setUnvan("Kidemli Muhendis");
//        } else if(maas >= 30000){
//            this.setUnvan("Muhendis");
//        } else {
//            this.setUnvan("Stajyer Muhendis");
//        }
//    }


    @Override
    public void setMaas(double maas) {
        super.setMaas(maas);
        setUnvan(maas);
    }
    @Override
    public String toString() {
        return this.getClass().getSuperclass().getSimpleName()+"{"+"Muhendis{" +
                super.toStringTemplate()+
                ", patates='" + patates + '\'' +
                '}'+"}";
    }
}
