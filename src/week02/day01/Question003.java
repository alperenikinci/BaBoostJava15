package week02.day01;

public class Question003 {
    /*
    3- İki tane string değişken, (isim ve soyisim), bu değişkenleri yazdıralım.

    3.1- bu değişkenleri tek bir çıktıda alt alta yazdıralım.

    3.2- a ve b karakterlerinin değerini ve karakterler değer toplamını yazdıralım.
    * */
    public static void main(String[] args) {

        String name = "Alperen";
        String surname = "Ikinci";

        System.out.println(name +" "+ surname);
        System.out.println(name + "\n"+surname); // \n alt satir kirilimi yapar.
        System.out.println("Isim\t\tSoyisim");
        System.out.println(name+"\t\t"+surname);

        char a = 'a'; // -> ASCII -> 97
        char b = 'b';
        System.out.println((int) a);
        System.out.println((int) b);
        char aa = (char) (a-32);
        System.out.println((int) aa);


    }
}
