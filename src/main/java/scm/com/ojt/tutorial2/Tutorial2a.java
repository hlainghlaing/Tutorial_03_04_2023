package scm.com.ojt.tutorial2;

import java.util.Scanner;

public class Tutorial2a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number : ");
        int number = input.nextInt();
        input.close();
        // Ternary Operator with multiple conditions:
        String result = (number == 0) ? "Number 0 is neither positive nor negative."
                : ((number > 0) ? "Number is positive." : "Number is negative");
        System.out.println(result);
    }
}
