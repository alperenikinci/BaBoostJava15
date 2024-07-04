package week02.day04;

public class Question003 {
    /*
    3- "Java,React,Spring" String degerinden bir
    for döngüsü içerisinde Java React ve Spring i ayrı ayrı yazdıralım.
     */

    public static void main(String[] args) {
        String value = "Java,React,Spring"; // -> Java React Spring
        int index = 0;

        for (int i = 0; i<value.length();i++){
            if(value.charAt(i) == ','){
                System.out.println(value.substring(index,i));
                index = i+1;
            }
        }
        System.out.println(value.substring(index));
        System.out.println("###############################");

        for (int i = 0; i< value.length();i++){
            if(value.charAt(i) == ','){
                System.out.println();
            } else{
                System.out.print(value.charAt(i));
            }
        }
        System.out.println("\n#################################");
        value = value.replace(",","\n");
        System.out.println(value);
    }
}
