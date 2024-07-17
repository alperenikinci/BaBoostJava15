package week04.day02;

public class OzelListeTest {
    public static void main(String[] args) {
        OzelListe ozelListe = new OzelListe();
        ozelListe.add(15);
        ozelListe.add(20);
        ozelListe.add(25);
        ozelListe.add(30);
        ozelListe.add(35);
//        for (int sayi : ozelListe.getSayiDizisi()){
//            System.out.println(sayi);
//        }
//        System.out.println();
        ozelListe.remove(8);

//        for (int sayi : ozelListe.getSayiDizisi()){
//            System.out.println(sayi);
//        }
//        try {
//            ozelListe.remove(ozelListe.getSayiDizisi().length-1);
//        } catch (NullPointerException e ){
//            System.out.println("Liste Boş");
//        }
        int[] numArr = {3,5,7,9};
        ozelListe.addAll(numArr);
        ozelListe.remove(8);
        ozelListe.list();
        System.out.println();
        int[] indexesToBeRemoved = {3,0,7,5};
        ozelListe.removeAllIndexes(indexesToBeRemoved);
        ozelListe.list();

    }
}
