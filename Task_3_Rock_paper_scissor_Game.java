package Techno_Hacks;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// creating scanner class object to take values by user
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Game!!");
		System.out.println("Do you want to play game");
		String play_Again = sc.next();
		// Taking while loop to play the game again
		while (play_Again.equalsIgnoreCase("yes")) {
			System.out.println("0 for rock | 1 for paper | 2 for Scissor");
			int User_Input = sc.nextInt();
			// System.out.println("Computer generating");
			// creating object random that  generates random number by computer
			Random ran = new Random();
			int computer_move = ran.nextInt(3);
			System.out.println("Computer generating:" + computer_move);
			// comparing user input and computer move in order to see whether there game is
			// draw or not
			if (User_Input == computer_move) {
				System.out.println("Game draw play again");
			}
			// if the user input and computer move is not equal checks other if statement
			if (User_Input == 1 && computer_move == 0 || User_Input == 0 && computer_move == 2
					|| User_Input == 2 && computer_move == 1) {
				System.out.println("you won");
			} else {
				System.out.println("you lost");
				
			}
			System.out.println("Do you want to continue the  game");
			 play_Again = sc.next();
		}
		System.out.println("Thanks for playing");

	}

}