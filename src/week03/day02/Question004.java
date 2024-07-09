package week03.day02;

public class Question004 {
    /*
    4- Bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp döngüyü sonlandiralim yoksa false yazsin.
    -> 2, -256, 2, 1258, 2, 2
     */
    public static void main(String[] args) {
        int[] numberArr = {2, -256, 2, 1258, 2,2};
        boolean isRepeating = false;

        for (int i = 0; i < numberArr.length-1;i++){
            if(numberArr[i] == 2 && numberArr[i+1] == 2){
                isRepeating = true;
                break;
            }
        }
        System.out.println(isRepeating);
    }
}
