

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        // Display the welcome message
        System.out.println("Welcome to the Basic Calculator!");

        // Loop to allow the user to perform multiple calculations
        while (continueCalculation) {
            // Prompt the user to enter the first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Prompt the user to enter the operator
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Prompt the user to enter the second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            // Perform the operation based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // Check if the second number is zero to avoid division by zero
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please enter one of +, -, *, /.");
                    validOperation = false;
                    break;
            }

            // Display the result if the operation was valid
            if (validOperation) {
                System.out.println("The result is: " + result);
            }

            // Ask the user if they want to perform another calculation
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String continueInput = scanner.next().toLowerCase();

            if (!continueInput.equals("yes")) {
                continueCalculation = false;
            }
        }

        // Display the exit message and close the scanner
        System.out.println("Thank you for using the Basic Calculator!");
        scanner.close();
    }
}
