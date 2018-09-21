package Kattis;

import java.util.Scanner;

public class Stuck_in_a_time_loop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int i = input.nextInt();

		input.close();
		
		for (int j = 1; j < i + 1; j++) {
			System.out.println(j + " Abracadabra");
		}

	}

}
