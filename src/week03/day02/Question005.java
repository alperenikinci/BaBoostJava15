package week03.day02;

public class Question005 {
    /*
    5 -
    Dizideki bütün sayıların toplamını yazdıralım.
    Dizinin her bir elemanı için;
    çift ise çifttir, tek ise tektir yazdıralım.
    -> 0, 120, 5, 85, -256, 16, 1258, 81, 14
     */
    public static void main(String[] args) {
        int[] numberArr = {0, 120, 5, 85, -256, 16, 1258, 81, 14};
//        boolean[] oddEvenArr = new boolean[numberArr.length];
        int total = 0;
            int i = 0;
            for (int number : numberArr) {
                total += number;
                if (number % 2 == 0) {
                    System.out.println(number + " is even");
//                oddEvenArr[i] = true;
                } else {
                    System.out.println(number + " is odd");
                }
            i++;
        }
//        for (i = 0; i < oddEvenArr.length; i++) {
//            if (oddEvenArr[i] == true) {
//                System.out.println(numberArr[i] + " is even");
//            } else {
//                System.out.println(numberArr[i] + " is odd");
//            }
//            }
//        }
//            for (i = 0; i < oddEvenArr.length; i++) {
//                if (oddEvenArr[i] == false) {
//                    System.out.println(numberArr[i] + " is odd");
//                }
//            }

            System.out.println("Total = " + total);
        }
}

