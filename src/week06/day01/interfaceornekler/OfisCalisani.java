package week06.day01.interfaceornekler;

public class OfisCalisani extends Calisan implements MaasaGoreUnvanAlabilir{

    public OfisCalisani(String isim, String soyisim, double maas) {
        this.isim = isim;
        this.setSoyisim(soyisim);
        this.setMaas(maas);
        setUnvan(maas);
    }

    @Override
    public void setUnvan(double maas) {
        if(maas >= 30000){
            this.setUnvan("Kidemli Calisan");
        } else if (maas >= 20000){
            this.setUnvan("Calisan");
        } else {
            this.setUnvan("Stajyer Ofis Calisani");
        }
    }

    @Override
    public void setMaas(double maas) {
        super.setMaas(maas);
        setUnvan(maas);
    }
}
