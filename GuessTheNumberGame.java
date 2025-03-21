import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1; // Set the lower bound of the number range
        int upperBound = 100; // Set the upper bound of the number range
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int maxAttempts = 10; // Set the maximum number of attempts

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            // Task 1: Implement logic to check if the user's guess is correct.
            // If the guess is correct, set hasGuessedCorrectly to true and break out of the
            // loop.
            // Otherwise, provide a hint to the user (e.g., "Too high" or "Too low").

            // Task 2: Display the number of attempts remaining to the user.
        }

        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess + ".");
        }

        // Task 3: Add an option for the player to play again if they want.
        // Task 4: Implement input validation to handle non-integer inputs and
        // out-of-range guesses.

        scanner.close();
    }
}