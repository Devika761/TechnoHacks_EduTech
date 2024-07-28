package number_Game;

import java.util.Random;
import java.util.Scanner;

public class RandomNo {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        boolean playagain = true; // Variable to control if the user wants to play again
        int score = 0; // Variable to keep track of the user's score

        // Display the welcome message and instructions
        System.out.println("Welcome to the guess the number game!");
        System.out.println("You have 3 chances to win. Try to guess a number between 1 and 100.");

        // Loop to allow the user to play multiple rounds
        while (playagain) {
            // Generate a random number between 1 and 100
            int generatedNo = random.nextInt(100) + 1;
            int numberOfTries = 0; // Variable to count the number of tries
            boolean win = false; // Variable to check if the user has won the game

            // Loop to give the user 3 chances to guess the number
            while (numberOfTries < 3) {
                System.out.print("Enter your guess : ");
                if (scanner.hasNextInt()) { // Check if the input is an integer
                    int guess = scanner.nextInt(); // Read the user's guess
                    numberOfTries++; // Increment the number of tries

                    if (guess < 1 || guess > 100) { // Check if the guess is within the valid range
                        System.out.println("Invalid input!");
                    } else if (guess < generatedNo) { // Check if the guess is too low
                        System.out.println("Too low! Try again.");
                    } else if (guess > generatedNo) { // Check if the guess is too high
                        System.out.println("Too high! Try again.");
                    } else { // The guess is correct
                        win = true; // Set win to true
                        score++; // Increment the score
                        System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
                        break; // Exit the loop as the user has won
                    }
                } else { // The input is not an integer
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next(); // Clear the invalid input
                }
            }

            // If the user did not guess the number within 3 tries
            if (!win) {
                System.out.println("Sorry! You lost the Game. The correct number was: " + generatedNo);
            }

            // Display the user's current score
            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playagainInput = scanner.next().toLowerCase(); // Read the user's input and convert it to lowercase
            scanner.nextLine(); // Consume the newline character

            // Check if the user wants to play again
            if (!playagainInput.equals("yes")) {
                playagain = false; // Set playagain to false to exit the loop
            }
        }

        // Display the exit message and close the scanner
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
