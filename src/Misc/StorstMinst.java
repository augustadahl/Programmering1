package Misc;

import java.util.Scanner;

public class StorstMinst {

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);

		int ett = Input.nextInt();
		int tva = Input.nextInt();

		if (ett > tva) {
			System.out.println("Ett �r st�rst");
		}
		if (ett < tva) {
			System.out.println("Tv� �r st�rst");
		}

	}

}
