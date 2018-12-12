package Kattis;

import java.util.Scanner;

public class What_does_the_fox_say {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int cases = sc.nextInt();sc.nextLine();
		
		String[] foxsounds = new String[cases];

		for (int i = 0; i < cases; i++) {

			foxsounds[i] = fox();
//			System.out.println(foxsounds[i]);
		}

		for (int i = 0; i < foxsounds.length; i++) {
			System.out.println(foxsounds[i]);
		}

	}

	// methods

	public static String fox() {


		String record = sc.nextLine(); // inspelningen.

		String notfox = "";

		while (true) { // skriver om alla animal goes sound till en string med bara sound
			String str = sc.nextLine();
			if (str.equals("what does the fox say?")) { // bryter när what does the fox say? skrivs.
				break;
			} else {
				notfox += animalsound(str) + " ";
			}
		}

		String[] notfoxArr = new String[arrsize(notfox)]; // gör om stringen notfox till en array

		int j2 = 0;

		for (int j = 0; j < notfoxArr.length; j++) {

			notfoxArr[j] = "";

			for (; j2 < notfox.length(); j2++) {

				if (notfox.charAt(j2) != ' ') {
					notfoxArr[j] += notfox.charAt(j2);
				} else {
					j2++;
					break;
				}
			}

		}
		// System.out.println(Arrays.toString(notfoxArr));

		String[] recordArr = new String[arrsize(record)]; // gör om stringen record till en array

		int j3 = 0;

		for (int j = 0; j < recordArr.length; j++) {

			recordArr[j] = "";

			for (; j3 < record.length(); j3++) {

				if (record.charAt(j3) != ' ') {
					recordArr[j] += record.charAt(j3);
				} else {
					j3++;
					break;
				}
			}

		}
		// System.out.println(Arrays.toString(recordArr));

		String foxsound = "";

		boolean fox = true;

		for (int j = 0; j < recordArr.length; j++) {

			for (int k = 0; k < notfoxArr.length; k++) {

				if (recordArr[j].equals(notfoxArr[k])) {
					fox = false;
				}

			}

			if (fox == true) {
				foxsound += recordArr[j] + " ";
			} else {
				fox = true;
			}

		}

		return foxsound;
	}

	public static int arrsize(String str) {
		int arrsize = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				arrsize++;
			}
		}
		if (str.charAt(str.length() - 1) != ' ') {
			arrsize++;
		}

		return arrsize;
	}

	public static String animalsound(String str) {

		String sound = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ') {
				sound = sound + str.charAt(i);
			} else {
				break;
			}
		}

		sound = reverse(sound);

		return sound;
	}

	public static String reverse(String str) {

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		return reverse;
	}

}
