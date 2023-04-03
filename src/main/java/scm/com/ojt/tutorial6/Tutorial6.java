package scm.com.ojt.tutorial6;

import java.util.Scanner;

public class Tutorial6 {

    public static void main(String[] args) {
        int passwordLength = 8;
        int upChar = 0;
        int lowChar = 0;
        int special = 0;
        int digit = 0;
        char pwChar;
        // Ask user to enter password
        Scanner input = new Scanner(System.in);
        System.out.println("*Password must be at least 8 numbers.*");
        System.out.println("Use small & captital letters , special and digit to be strong!!!!\n");
        System.out.print("Enter passwrord : ");
        String userInput = input.nextLine();
        if (userInput.length() < passwordLength) {
            System.out.println("Invalid Password! Enter password at least 8 numbers.");
        } else {
            for (int i = 0; i < userInput.length(); i++) {
                // test each character of user input
                pwChar = userInput.charAt(i);
                // Call static method from Character Class
                if (Character.isUpperCase(pwChar)) {
                    upChar = 1;
                } else if (Character.isLowerCase(pwChar)) {
                    lowChar = 1;
                } else if (Character.isDigit(pwChar)) {
                    digit = 1;
                } else {
                    special = 1;
                }
            }
            if (upChar == 1 && lowChar == 1 && digit == 1 && special == 1) {
                System.out.println("Your password is Strong!");
            } else {
                System.out.println("Your password is Weak!");
            }
        }

    }

}
