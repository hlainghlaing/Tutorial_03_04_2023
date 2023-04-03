package scm.com.ojt.tutorial2;

import java.util.Scanner;

public class Tutorial2a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number : ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is Negative.");
        } else {
            System.out.println("Number 0 is neither positive nor negative.");
        }

    }

}
