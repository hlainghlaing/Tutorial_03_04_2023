package scm.com.ojt.tutorial2;

import java.util.Scanner;

public class Tutorial2b {

    public static void main(String[] args) {
        // create scanner object to ask user input
        Scanner input = new Scanner(System.in);
        System.out.print("Input the 1st number : ");
        int firstNum = input.nextInt();
        System.out.print("Input the 2nd number : ");
        int secondNum = input.nextInt();
        System.out.print("Input the 3rd number : ");
        int thirdNum = input.nextInt();
        input.close();
        int result = (firstNum >= secondNum && firstNum >= thirdNum) ? firstNum
                : ((secondNum >= firstNum && secondNum >= thirdNum) ? secondNum : thirdNum);
        System.out.println("The greatest : " + result);
    }
}
