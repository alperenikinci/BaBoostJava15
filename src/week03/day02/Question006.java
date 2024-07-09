package week03.day02;

public class Question006 {
    /*
    6- Dizi içerisinde 1 ve 4 sayilarinin kac kere geçtiğini ve 1 sayısının adeti
    4 sayısının adetinden büyükse true değilse false yazdıralım.
    -> 1,4,5,6,1,1,4,8
     */
    public static void main(String[] args) {
        int[] numberArr = {1,4,5,6,1,1,4,8};
        boolean isOneCountMore;
        int oneCount = 0;
        int fourCount = 0;

        for (int i = 0; i< numberArr.length;i++){
            if(numberArr[i] == 1){
                oneCount++;
            } else if (numberArr[i] == 4){
                fourCount++;
            }
        }
        isOneCountMore = oneCount>fourCount;
        System.out.println(isOneCountMore);

    }
}
