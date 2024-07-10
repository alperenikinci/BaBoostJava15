package week03.day03.methods;

public class MethodFundamentals {

    public static void main(String[] args) {
        System.out.println();
        int mahmut = 3;
        String name = "Alperen";
        int age = 28;

        Person person = parameterizedNonReturnTypedMethod(name,age);
        System.out.println(person);

    }
    /*
        Static - non-Static
        Static -> Sinif metodu/degiskenidir
        non-static -> Nesne metodu/degiskenidir.

        static -> Person sinifinin degiskeni olarak tanimlamis olurum. Dolayisiyla "Person" uzerinden uretilen/olusturulan her nesne
        icin ayni sekilde davranir.
     */

    /*
    1- Geriye deger donduren.
    2- Geriye deger dondurmeyen.
    3- Parametre alan.
        3.1 - Birden fazla parametre alan.
        3.2 - Tek parametre alan.
    4- Parametre almayan.
    5- Overloaded methods.
    Metot icerisinde metot cagirilabilir. Ancak metot icerisinde metot tanimlanamaz.
    Metotlar class scope'unda tanimlanir.
     */

    // Parametresiz metot.
    public static void nonParameterizedMethod(){
        System.out.println("non-Parameterized method.");
    }

    // Parametresiz ama geri donus tipi olan metot.
    public static String nonParameterizedReturnTypedMethod(){
        return "Hello World!";
    }

    // Parametreli geri donuslu.
    public static String parameterizedReturnTypedMethod(int number){
        int number2 = 5; // -> Garbage collector.
        number +=number2;
        return "Merhaba " + number;
    }

//     Parametreli geri donus tipsiz
    public static Person parameterizedNonReturnTypedMethod(String name, int age){

        Person person = new Person();
        person.name = name; // Alperen
        person.age = age;
        System.out.println(name + " yasi " + age);
        Person person2 = new Person();
        person2.name ="Mahmut"; // Mahmut
        Person person3 = new Person();
        person3.name = "Ali"; // Ali
        System.out.println(person2.name +" "+ person.name);
        return person;
    }
}
