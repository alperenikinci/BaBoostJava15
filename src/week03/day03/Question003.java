package week03.day03;

public class Question003 {
    /*
    3- int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654,
    33, 32, 67, 2 }, { 189, 35, 56, 89, 8 } };
    Yukarıdaki 2 boyutlu array'i tek boyutlu bir array olarak yazdıran metot.
     */

    public static void main(String[] args) {
        int[][] matrix = {{56, 23, 678, 231, 5}, {234, 21, 78, 26, 6}, {654,
                33, 32, 67, 2}, {189, 35, 56, 89, 8}};
        convert2dArrayTo1d(matrix);
    }

    public static void convert2dArrayTo1d(int[][] matrix) {
//        int length = matrix.length * matrix[0].length;
        int size = 0;
        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                size++;
//            }
            size += matrix[i].length;
        }
        int[] oneDArray = new int[size];
        int index = 0;
        for (int i = 0; i<matrix.length;i++){
            for (int j = 0; j< matrix[i].length;j++){
                oneDArray[index] = matrix[i][j];
                index++;
            }
        }
//        index = 0;
//        for(int[] numberArr : matrix){
//            for (int number : numberArr){
//                oneDArray[index] = number;
//                index++;
//            }
//        }
        Question002.printArray(oneDArray);
    }
}
