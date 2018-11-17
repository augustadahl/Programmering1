package Kattis;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class What_does_the_fox_say {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// int cases = sc.nextInt();

		// for (int i = 0; i < cases; i++) {
		
		String record = sc.nextLine();

		String[] recordarr = new String[arrsize("gg")];

		int startAt = 0;

		for (int i = 0; i < recordarr.length; i++) {

			for (int j = startAt; j < record.length(); j++) {

				if (record.charAt(j) != ' ') {
					recordarr[i] = recordarr[i] + record.charAt(j);
				} else {
					startAt = j + 1;
					break;
				}
			}
		}
		
		for (int i = 0; i < recordarr.length; i++) {
			System.out.println(recordarr[i]);
		}

//			String notfox = "";
//			
//			while (true) {
//				String str = sc.nextLine();
//				if (str.equals("what does the fox say?")) {
//					break;
//				}
//				else {
//				notfox = notfox + animalsound(str) + " ";
//				}
//			}

		// }

	}

	// methods

	public static String arr(String str, int startAt) {

		String arr = "";

		for (int j = startAt; j < str.length(); j++) {

			if (str.charAt(j) != ' ') {
				arr = arr + str.charAt(j);
			} else {
				startAt = j;
				break;
			}
		}

		return arr;

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
