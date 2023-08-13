/*  write a guessing number game in java where user have 3 attempts to guess a number from 1 to 100
 upon guessing correctly user will receive a message "you have guessed correctly!" and on wrong 
 guess "Wrong guess you have n chance left" where n will decrease upon every wrong guess. After all
  chances are gone system will print "you don't have any chances left ! play again" then user can
   either play again or quit the game everything will be well instructed adn prompted [you can use 
   scanner class for input switch case for loop and other concepts].*/

import java.util.Random;
import java.util.Scanner;

class Game {
    int userInput;
    int computerNumber;
    int numberOfGuesses = 3;
    Scanner sc = new Scanner(System.in);

    public void takeUserInput() {
        System.out.println("Please Enter a Number: ");
        // Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();

    }

    public boolean isCorrect() {
        if (computerNumber == userInput) {
            System.out.println("You have guessed correctly!");
            return true;
        } else {
            numberOfGuesses--;
            System.out.printf("Wrong guess, you have %d chances left\n", numberOfGuesses);
        }
        return false;

    }

    public void noChanceLeft() {
        System.out.println("You don't have any chances left!");
        System.out.println("Press 1 To Play Again");
        System.out.println("Press 2 To Quit ");
        System.out.format("Enter your choice \t");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                playAgain();
                break;
            case 2:
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
        }
    }

    public void playAgain() {
        boolean check = false;
        while (!check) {
            this.takeUserInput();
            check = this.isCorrect();
        }

    }

    Game(int range) {
        Random rand = new Random();
        computerNumber = rand.nextInt(range);
        System.out.println("Computer Guess is: " + computerNumber);
    }
}

public class GuessingNumber {
    public static void main(String[] args) {
        Game playGame = new Game(100);
        System.out.println("===============================");
        System.out.println("WELCOME TO GUESSING NUMBER GAME");
        System.out.println("===============================");
        boolean check = false;
        while (!check) {
            playGame.takeUserInput();
            check = playGame.isCorrect();
        }

    }
}
