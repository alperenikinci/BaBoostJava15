package week03.day02;

public class ArrayFundamentals {
    public static void main(String[] args) {
        // Aynı turde coklu veri saklar.
        // Boyutu sabittir. Bir kere boyutlandirildi mi, bir daha yeniden boyutlandirma dogrudan yapilamaz.

        String[] stringArray = new String[4];
        System.out.println(stringArray.length);
        String[] stringArray2 = {"Kelime1","Kelime2"};
        String stringArray3[] = new  String[5];
        boolean[] booleanArray = new boolean[3];
        System.out.println(booleanArray[0]); // Boolean'lar default'ta false degerini alir.
        System.out.println(stringArray[0]); // String'ler default'ta null degerini alir.
        String str = stringArray[0];
        // {0,1,2,3,4,5,6,7,8,9,10};
        // {true,false,true,false,true,false,true,false,true,false,true}
//        boolean bool = str.equals("Alperen"); //Null Pointer Exception.
//        System.out.println(stringArray[5]); // Array.Index.Out of.Bounds
        booleanArray[0] = (3 == (1+2));
        System.out.println(booleanArray[0]);
        int[] intArr;




    }
}
