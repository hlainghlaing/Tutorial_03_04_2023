package scm.com.ojt.tutorial2;

import java.util.Scanner;

public class Tutorial2c {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = input.nextInt();
        input.close();
        // use ternary operator instead of nested if
        String result = (year % 4 == 0)
                ? ((year % 100 == 0) ? ((year % 400 == 0) ? " is a leap year " : "is not a leap year.")
                        : " is a leap year")
                : " is not a leap year.";
        System.out.println(year + result);
    }
}
