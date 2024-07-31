package week06.day01.interfaceornekler;

public class Test {
    public static void main(String[] args) {
        CalisanDB calisanDB = new CalisanDB();
        InsanKaynaklari insanKaynaklari = new InsanKaynaklari();
        insanKaynaklari.setIsim("Ayse");
        insanKaynaklari.setSoyisim("Kaya");
        insanKaynaklari.setMaas(25000d);
        insanKaynaklari.setUnvan("IK");
        Muhendis muhendis = new Muhendis("Alperen","Ikinci",30000);
        OfisCalisani ofisCalisani = new OfisCalisani("Alex","Walker",20000);
        Tekniker tekniker = new Tekniker();
        tekniker.setIsim("Ahmet");
        tekniker.setSoyisim("Eris");
        tekniker.setMaas(30000);
//        System.out.println();
//
//
//        System.out.println(tekniker);
//        insanKaynaklari.zamYap(tekniker,0.25);
//        System.out.println(tekniker);
//
//
//        System.out.println(ofisCalisani);
//        insanKaynaklari.zamYap(ofisCalisani,1.50);
//        System.out.println(ofisCalisani);
//        System.out.println(muhendis);
//        insanKaynaklari.zamYap(muhendis,1.5);
//        System.out.println(muhendis);
//        insanKaynaklari.zamYap(muhendis,1.25);
//        System.out.println(muhendis);

        CalisanDB.calisanList.forEach(System.out::println);
        System.out.println();
        calisanDB.findAllThatUnvanDeterminedByMaas().forEach(System.out::println);
        System.out.println();
        calisanDB.findAllThatSahaCalismasiYapabilir().forEach(System.out::println);
        System.out.println();
        calisanDB.findAllNonSpecific().forEach(System.out::println);
    }
}
