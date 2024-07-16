package week04.day01.maraton01;

public class Question001 {
    /*
     * * * * * * *
     * * * * * * *
     * * * * * * *
     * * * * * * *
     * * * * * *
     * * * * *
     * * * *
     * * *
     * * *
     */
    public static void main(String[] args) {
        drawStars();
    }

    public static void drawStars() {
        int i = 7;
        for (int j = 0; j < 4; j++) {
            System.out.println();
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
        }
        for (int j = 0; j < 3; j++) {
            System.out.println();
            i--;
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
        }
        i--;
        for (int j = 0; j < 2; j++) {
            System.out.println();
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
        }
    }
}
