package l�xor;

import java.util.Random;
import java.util.Scanner;

public class gissa_talet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random rd = new Random();

		System.out.println("Hej vilken sv�righetsgrad vill du v�lja");

		String grad = sc.next();

		int score = 0;

		if (grad.equals("A")) {

			for (int i = 1; i <= 10; i++) {
				int tal = rd.nextInt(0 + 10) + 1;
				if (sc.nextInt() == tal) {
					System.out.println("R�tt");
					score++;
				} else {
					System.out.println("Fel");
				}
			}
			
			System.out.println("po�ng: " + score);
		}

		if (grad.equals("B")) {
			for (int i = 1; i <= 20; i++) {
				int tal = rd.nextInt(0 + 20) + 1;
				if (sc.nextInt() == tal) {
					System.out.println("R�tt");
					score++;
				} else {
					System.out.println("Fel");
				}
			}
			
			System.out.println("po�ng: " + score);
		}

		if (grad.equals("C")) {
			for (int i = 1; i <= 30; i++) {
				int tal = rd.nextInt(0 + 30) + 1;
				if (sc.nextInt() == tal) {
					System.out.println("R�tt");
					score++;
				} else {
					System.out.println("Fel");
				}
			}
			
			System.out.println("po�ng: " + score);
		}

	}

}
