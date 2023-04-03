package scm.com.ojt.tutorial5;

import java.util.Random;
import java.util.Scanner;

public class Tutorial5 {

    public static void main(String[] args) {
        // Ask input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Make your choice ( rock, paper , scissor) : ");
        String userChoice = input.nextLine();
        if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissor")) {
            // Random number from computer
            Random random = new Random();
            // random number less than 3 ( 0, 1 , 2 )
            int randomNum = random.nextInt(3);
            String computerChoice;
            if (randomNum == 0) {
                computerChoice = "rock";
            } else if (randomNum == 1) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissor";
            }
            System.out.println("Random Choice from Computer : " + computerChoice);
            if (userChoice.equals(computerChoice)) {
                System.out.println("It is a draw!");
            } else if (playerWin(userChoice, computerChoice)) {
                System.out.println("You Win!");
            } else {
                System.out.println("Oops! You lose. Sorry about that.Let's play again!");
            }
        } else {
            System.out.println("Invalid Choice! Let's play again .");
            System.out.println("Enter Right Choice next time.");
        }

    }

    private static boolean playerWin(String userChoice, String computerChoice) {
        if (userChoice.equals("rock")) {
            return computerChoice.equals("scissor");
        } else if (userChoice.equals("paper")) {
            return computerChoice.equals("rock");
        } else {
            return computerChoice.equals("paper");
        }
    }

}
