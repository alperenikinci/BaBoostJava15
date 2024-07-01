package week02.day01;

public class Question002 {

    /*
    2- Türk Lirasınını dolara cevirelim.
    */
    public static void main(String[] args) {
        double amount = 100;
        double exchangeRate = 32.68; //8 Byte
        float exchange = (float) (amount / exchangeRate);
        System.out.println(amount+ " TL " + exchange + " Dolara eşittir.");


    }
}
