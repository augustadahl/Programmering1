package Kattis;

import java.util.Scanner;

public class BackspaceBool {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		
		boolean[] write = new boolean[input.length()];
		
		int backspace = 0;
		
		for (int i = input.length() - 1; i >= 0; i--) {
			write[i] = true;
			if (input.charAt(i) == '<') {
				backspace++;
				write[i] = false;
			}
			else if (backspace > 0) {
				write[i] = false;
				backspace--;
			}
		}
		
		StringBuilder out = new StringBuilder(write.length);
		
		for (int i = 0; i < write.length; i++) {
			if (write[i]) {
				out.append(input.charAt(i));
			}
		}
		
		System.out.println(out);

	}
}
