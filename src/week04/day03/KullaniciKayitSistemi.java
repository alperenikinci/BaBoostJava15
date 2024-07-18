package week04.day03;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

public class KullaniciKayitSistemi {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        Kullanici kullanici1= new Kullanici();
//        Kullanici kullanici2 = new Kullanici();
//
//        System.out.println("Id: " + kullanici1.getId() + " kullaniciCount : " + Kullanici.getKullaniciCount() + " kayitTarihi : " +kullanici1.getKayitTarihi());
//        System.out.println("Id: " + kullanici2.getId() + " kullaniciCount : " + Kullanici.getKullaniciCount() + " kayitTarihi : " +kullanici2.getKayitTarihi());
//
//        System.out.print("Lutfen telno giriniz : +90 ");
//        scanner.nextLine();

    }

    public static void menu(){
        int secim = 0;
        do {
            System.out.println("### KULLANICI KAYIT SISTEMI ###");
            System.out.println("1- Kayit Ol");
            System.out.println("0- Cikis");
            System.out.print("Lutfen bir secim yapiniz : ");
            secim = scanner.nextInt();
            scanner.nextLine();
            durum(secim);


        } while (secim != 0);

    }

    private static void durum(int secim) {
        switch (secim){
            case 1: {
                Kullanici kullanici = kullaniciKaydi();
                break;
            }
        }
    }

    private static Kullanici kullaniciKaydi() {
       String isim;
       String soyisim;
       String email;
       String telNo;
       String sifre;
       String sifreYeniden;
       String kullaniciAdi;
       String tcKimlik;
       LocalDate dogumTarihi;
       Kullanici kullanici;
       dogumTarihi = dogumTarihiAl();
       if(dogumTarihKontrol(dogumTarihi)){
           kullanici = new Kullanici();
           kullanici.setDogumTarihi(dogumTarihi);

       } else{
           System.out.println("18 Yasindan kucukler kayit islemi gerceklestiremez.");
       }
        return null;
    }

    private static LocalDate dogumTarihiAl() {
        while (true){
            System.out.print("Lutfen dogum tarihinizi giriniz (yyyy-MM-dd) : ");
            String date = scanner.nextLine();
            try {
                LocalDate localDate = LocalDate.parse(date);
                return localDate;
            } catch (Exception e){
                System.out.println("Lutfen dogum tarihinizi yil-ay-gun formatinda giriniz!!!\n");
            }
        }
    }

    private static boolean dogumTarihKontrol(LocalDate date) {
        int yas = Period.between(date,LocalDate.now()).getYears();
        boolean resitMi = (yas<18) ? false : true;
        return resitMi;
    }
}
