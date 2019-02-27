package läxor;

import java.util.Scanner;

public class gissa_talet_fran_william {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Slumpa tal mellan 0-100
		int tal = (int) (Math.random() * 101);

		// score int som räknar poäng
		int score = 0;

		System.out.println("Gissa på ett tal mellan 1-100");

		while (true) {
			int input = sc.nextInt();
			if (input == tal) {
				System.out.println("you won! Score: " + (score + 1));
				break;
			}
			if (input < tal) {
				System.out.println("Högre");
			} else {
				System.out.println("Lägre");
			}
			score++;
		}
	}
}
