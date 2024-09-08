/*Task_1-NUMBER GAME */

import java.util.Random;
import java.util.Scanner;

class GuessingGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playAgain = 1;
        int round = 1;
        int score = 0;

        while (playAgain == 1) {
            System.out.println("Round " + round + ":");
            int numberToGuess = random.nextInt(100) + 1;  // Random number between 1 and 100
            int guess = 0;
            int attempts = 10;  // Limiting to 10 attempts
            int attemptsUsed = 0;

            System.out.println("You have 10 attempts to guess the number between 1 and 100.");

            while (guess != numberToGuess && attemptsUsed < attempts) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attemptsUsed++;

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! You've guessed the number.");
                    score++;
                }

                if (attemptsUsed == attempts && guess != numberToGuess) {
                    System.out.println("Sorry, you've used all attempts. The correct number was " + numberToGuess);
                }
            }

            System.out.println("Score: " + score);
            System.out.println("Do you want to play again? (1 for yes, 0 for no): ");
            playAgain = scanner.nextInt();
            round++;
        }

        System.out.println("Game over! Your final score is: " + score);
        scanner.close();
    }
}
