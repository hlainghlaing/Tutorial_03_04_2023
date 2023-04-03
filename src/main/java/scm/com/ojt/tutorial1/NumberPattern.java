package scm.com.ojt.tutorial1;

public class NumberPattern {

    public static void main(String[] args) {

        for (int r = 7; r > 0; r--) {
            for (int i = 1; i < 8 - r; i++) {
                System.out.print(" ");
            }
            for (int j = 8 - r; j < 8; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int r = 2; r < 8; r++) {
            for (int i = 1; i < 8 - r; i++) {
                System.out.print(" ");
            }
            for (int j = 8 - r; j < 8; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
