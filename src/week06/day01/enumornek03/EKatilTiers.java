package week06.day01.enumornek03;

public enum EKatilTiers {
    TIER0("Herkes Icin Gecerli",0 ),TIER1("Katil Uyesi",5d),TIER2("Has Uye",20d);

    private String name;
    private double price;

    EKatilTiers(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
