package Techno_Hacks;

import java.util.Scanner;

public class QuizGame {
	public static void main(String[] args) {
		// Define questions, choices, and answers
		System.out.println("Welcome to Quiz Game!");
		String[][] questions = { { "what day is on june 12,2002", "A) Monday", "B)Sunday", "C)Friday", "D)Wednesday)" },
				{ "What was the day of the week on 28th may,2006", "A)Thursday", "B)Friday", "C)Saturday", "D)Sunday" },
				{ "what was the day of the week on 17th june,1998 ", "A)Monday", "B)Tuesday", "C) Wednesday",
						"D)Thursday" },
				{ "Look at this series 7,10,8,11,9,12,... What number should come next", "A)7", "B)10", "C)12",
						"D)13" },
				{ "what percentage of  numbers from 1to 70 have 1or9 in the unit's digit", "A)1", "B)14", "C)20",
						"D)21" } };
		// storing the correct answers in character array
		char[] answers = { 'D', 'D', 'C', 'B', 'c' };

		Scanner scanner = new Scanner(System.in);
		int score = 0;

		// Loop through each question
		for (int i = 0; i < questions.length; i++) {
			System.out.println("Question " + (i + 1) + ": " + questions[i][0]);
			for (int j = 1; j <= 4; j++) {
				System.out.println(questions[i][j]);
			}

			System.out.print("Enter the answers in (A, B, C, or D): ");
			char userAnswer = scanner.next().toUpperCase().charAt(0);

			if (userAnswer == answers[i]) {
				score++;
				System.out.println("Congrualtions!It is correct \n");
			} else {
				System.out.println("Sorry , It is wrong! \nThe correct answer is " + answers[i] + "\n");
			}
		}

		// Display the final score
		System.out.println("Your Score is : " + score + " out of " + questions.length + " questions correct.");

		scanner.close();
	}
}