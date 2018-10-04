package Misc;

import java.util.Scanner;

public class Siffersumma {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int tal = input.nextInt();

		int summa = 0;

		while (tal != 0) {
			summa = summa + tal % 10;
			tal = tal - tal % 10;
			tal = tal / 10;
		}

		System.out.println(summa);

	}

}
