package maratonlar.maraton01;

public class CustomStringTR {


    public static int uzunluk(String str){
            char[] chArr = karakterDizisi(str);
            int uzunluk = 0;
            char ch;
            try{
                for (int i = 0;;i++){
                    ch = chArr[i];
                    uzunluk++;
                }
            } catch (IndexOutOfBoundsException e){
                System.out.println("Out Of Bounds : Uzunluk : " + uzunluk);
            }
            return uzunluk;
    }

    public static char[] karakterDizisi(String str){ //toCharArray

            char[] chrArr = new char[str.length()];
            for (int i = 0; i< str.length();i++){
                chrArr[i] = str.charAt(i);
            }
            return chrArr;

    }
    public static char konumdakiKarakter(String str, int index){ // charAt
        char[] chArr = str.toCharArray();
        return chArr[index];
    }

    public static String kucukHarfeCevir(String str){
        char[] chArr = karakterDizisi(str);
        for (int i = 0; i<str.length();i++){
            if(chArr[i]>=65 && chArr[i] <= 90){
                chArr[i] = (char)(chArr[i] + 32);
            }
        }
        return karakterBirlestirStrBuilder(chArr);
    }

    public static String buyukHarfeCevir(String str){
        char[] chArr = karakterDizisi(str);
        for (int i = 0; i<str.length();i++){
            if(chArr[i]>=97 && chArr[i] <= 122){
                chArr[i] = (char)(chArr[i] - 32);
            }
        }
        return karakterBirlestirStrBuilder(chArr);
    }

    public static String karakterBirlestir (char[] chArr){
        String kelime = "";
        for (int i = 0; i<chArr.length;i++){
            kelime += chArr[i];
        }
        return kelime;
    }

    public static String karakterBirlestirStrBuilder (char[] chArr){
        String kelime = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<chArr.length;i++){
            sb.append(chArr[i]);
        }
        return sb.toString();
    }

}
