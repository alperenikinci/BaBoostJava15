package week03.day02;

public class Question007 {
    /*
    7- Dizide 13 sayısına denk gelene kadar devam edelim.
    13 sayısı bulunduktan sonra ondan bir sonraki gelen sayı 13 değil ise 13'den sonra gelen sayıyı toplama ekleyelim.
    -> 1, 13, 13, 13, 5, 13
     */
    public static void main(String[] args) {
        int[] numberArr = {1, 13, 13, 13, 5, 13};
        int total = 0;

        for (int i = 0; i< numberArr.length-1;i++){
            if(numberArr[i] == 13 /*&& numberArr[i+1] !=13*/){
                if(numberArr[i+1] !=13){
                    total+= numberArr[i+1];
                }
            }
        }
        System.out.println("Total : " + total);
    }
}
