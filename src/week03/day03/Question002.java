package week03.day03;

public class Question002 {
    /*
    2- Bir metot yazalım ve bu metot dizi içindeki tek elemanları alıp,
    başka bir diziye atsın ve o diziyi yazdırsın.
     */

    public static void main(String[] args) {
        int[] numberArr = {1,3,2,10,-20,15,7,13,55,100,80,6,9,16};
        findOddNumbersInArray(numberArr);
    }

    public static int[] findOddNumbersInArray(int[] numberArr){
        int[] oddNumberArr = new int[findCountOfOddNumbers(numberArr)];
        int i = 0;
        for(int number : numberArr){
            if(number%2 != 0){
                oddNumberArr[i] = number;
                i++;
            }
        }
        printArray(oddNumberArr);
        return oddNumberArr;
    }

    public static int findCountOfOddNumbers(int[] numberArr){
        int oddCount = 0;
        for(int number : numberArr){
            if(number%2 != 0){
                oddCount++;
            }
        }
        return oddCount;
    }

    public static void printArray(int[] numberArr){
        System.out.print("{");
        for (int number: numberArr){
            System.out.print(number + ",");
        }
        System.out.println("}");
    }
}
