package week02.day02;

public class Question002 {
    /*
    2- a'dan z'ye alfabeyi yazdıralım.
     */

    public static void main(String[] args) {
        char begin = 'a';
        char end = 'z';
        int sayi = begin + 10;

        for (;begin<= end;begin++){
            System.out.print(begin+ " ");
        }
//        begin = 'a';

//        while(begin <= end){
//            System.out.print(begin+ " ");
//            begin++;
//        }

    }
}
