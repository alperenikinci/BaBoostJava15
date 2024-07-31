package week06.day01.interfaceornekler;

public class InsanKaynaklari extends Calisan implements NonSpecificEmployees { // insan kaynaklari is a calisan

    public double zamYap(Calisan calisan, double zamOrani) {
        double zamliMaas = 0;
        if (zamOrani <= 1) {
            zamliMaas = calisan.getMaas() + calisan.getMaas() * zamOrani;
        }
        if (zamOrani >= 1) {
            zamliMaas = calisan.getMaas() * zamOrani;
        }
//        if(calisan.getClass().getSimpleName().equals(Muhendis.class.getSimpleName()));
        if(calisan instanceof Muhendis){
            zamliMaas+=1000;
//            ((Muhendis) calisan).setUnvan(zamliMaas);
        } else if(calisan instanceof  Tekniker){
            zamliMaas+=500;
        }
//        if (calisan instanceof MaasaGoreUnvanAlabilir){
//            ((MaasaGoreUnvanAlabilir) calisan).setUnvan(zamliMaas);
//        }
        calisan.setMaas(zamliMaas);
    return zamliMaas;
    }

    public void unvanBelirle() {
        System.out.println("Unvan belirlendi.");
    }
}
