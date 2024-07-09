package week03.day02;

public class Question002 {
    /*
    2- En büyük ve en küçük sayiyi tespit edelim.
    -> 0, 120, 5, 85, -256, 16, 1258, 81, 14
     */
    public static void main(String[] args) {
        int[] numberArr = {1258, 120, 5, 85, -256, 16,0 , 81, 14};
//        int min = numberArr[0];
//        int max = numberArr[0];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<numberArr.length;i++){
            if(numberArr[i] < min){
                min = numberArr[i];
            }
            if(numberArr[i] > max){
                max = numberArr[i];
            }
        }
        System.out.println("Min : " + min + " Max " + max);
    }
}
