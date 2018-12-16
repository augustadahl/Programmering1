package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_rot {

//	ABCDEFGHIJKLMNOPQRSTUVWXYZ_.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		while (true) {
			int rot = sc.nextInt();
			
			if (rot == 0) {
				break;
			}
			
			String uncrypt = reverse(sc.next());
			
			String crypt = "";

			for (int i = 0; i < uncrypt.length(); i++) {
				crypt += newChar(uncrypt.charAt(i), rot);
			}
			
			list.add(crypt);
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	public static String reverse(String str) {

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		return reverse;
	}
	
	public static char newChar(char chr, int places) {
		
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
		
		for (int i = 0; i < alpha.length(); i++) {
			if (alpha.charAt(i) == chr) {
				if (i + places >= alpha.length()) {
					chr = alpha.charAt((i + places) % alpha.length());
				}
				else {
				chr = alpha.charAt(i + places);
				}
				break;
			}
		}
		
		return chr;
	}
}
