package scm.com.ojt.tutorial6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tutorial6 {
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static void main(String[] args) {
//        int passwordLength = 8;
//        boolean upChar = false;
//        boolean lowChar = false;
//        boolean special = false;
//        boolean digit = false;
//        char pwChar;
        // Ask user to enter password
        Scanner input = new Scanner(System.in);
        System.out.println("*Password must be at least 8 numbers.*");
        System.out.println("Use small & captital letters , special and digit to be strong!!!!\n");
        System.out.print("Enter passwrord : ");
        String userInput = input.nextLine();
        input.close();
        if (userInput.length() < 8) {
            System.out.println("Invalid Password! Enter password at least 8 numbers.");
        } else {
            Matcher matcher = pattern.matcher(userInput);
            System.out.println((matcher.matches()) ? "Your Password is strong!" : "Your Password is weak!");
        }
        /**
         * if (userInput.length() < passwordLength) { System.out.println("Invalid
         * Password! Enter password at least 8 numbers."); } else { for (int i = 0; i <
         * userInput.length(); i++) { // test each character of user input pwChar =
         * userInput.charAt(i); // Call static method from Character Class if
         * (Character.isUpperCase(pwChar)) { upChar = true; } else if
         * (Character.isLowerCase(pwChar)) { lowChar = true; } else if
         * (Character.isDigit(pwChar)) { digit = true; } else { special = true; } }
         * System.out.println( (upChar && lowChar && digit && special) ? "Your password
         * is Strong!" : "Your password is Weak!"); }
         */
    }
}
