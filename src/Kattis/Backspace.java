package Kattis;

import java.util.Scanner;

public class Backspace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		String output = "";

		int backspace = 0;

		for (int i = input.length() - 1; i >= 0; i--) {
			if (input.charAt(i) == '<') {
				backspace++;
			} else if (backspace > 0) {
				backspace--;
			} else {
				output += input.charAt(i);
			}
		}
		if (!output.isEmpty()) {
			System.out.println(reverse(output));
		}

	}

	public static String reverse(String str) {

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		return reverse;
	}

}
