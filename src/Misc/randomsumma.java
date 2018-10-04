package Misc;

import java.util.Scanner;

public class randomsumma {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int tal = input.nextInt();
		int summa = 0;
		double antaltal = 0;

		while (tal != 0) {
			summa = summa + tal;
			tal = input.nextInt();
			antaltal++;
		}

		System.out.println("Summa = " + summa);
		System.out.println("Medelvärde = " + summa / antaltal);

	}

}
