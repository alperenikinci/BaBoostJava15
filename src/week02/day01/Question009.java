package week02.day01;

public class Question009 {
    /*
    9- 1 den başlayarak gelen bütün sayıları toplayalım. Toplamımız 50'yi geçene kadar çalışsın.
     En son toplamı yazdıralım ve bu döngünün kaç kere çalıştığını yazdıralım.
     */
    public static void main(String[] args) {
        int i = 1;
        int total = 0;
        int limit = 50;
//        for (total = 0; total <= limit; i++){
//            total +=i;
//            System.out.println(total);
//            System.out.println(i);
//        } // ctrl + numpad "/";

        while (total <= limit) {
          total +=i;
//          if (total > limit){
//              break;
//          }
          i++;
        }
        System.out.println("Toplam : " + total + "\tDongu : " + (i-1));
    }
}
