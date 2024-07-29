package week06.day01.interfaceornekler;

public class Tekniker extends Calisan implements SahaCalismasiYapabilir{
    public Tekniker() {
        this.setUnvan("Tekniker");
    }

    @Override
    public void sahaCalismasiYap() {
        System.out.println(this.getClass().getSimpleName() + " saha calismasi yurutuyor.");
    }
}
