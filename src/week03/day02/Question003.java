package week03.day02;

public class Question003 {
    /*
    3- Dizideki en buyuk 2. sayiyi bulalim.
    -> 120, 130, 125, -256, 16, 1300, 1258, 81, 14
     */
    public static void main(String[] args) {
        int[] numberArr = {1300,120, 130, 125, -256, 16, 1258, 81, 14};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        boolean isFirstTime = true;
        for(int i = 0; i<numberArr.length;i++){
            if(numberArr[i] > max){
                max = numberArr[i];
            }
//            if(i == numberArr.length-1 && isFirstTime == true){
//               i = 0;
//               isFirstTime = false;
//            }
//            if(numberArr[i] < max && numberArr[i] > secondMax){
//                secondMax = numberArr[i];
//            }
        }
//        if(numberArr[0] == max){
//            numberArr[0] = Integer.MIN_VALUE;
//        }

        for(int i = 0; i<numberArr.length;i++){
            if(numberArr[i] < max && numberArr[i] > secondMax){
                secondMax = numberArr[i];
            }
        }

        System.out.println(secondMax);
    }
}
