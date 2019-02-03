package Kattis;

import java.util.Scanner;

public class Cryptographers_Conundrum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int PERs = input.length() / 3;
		
		String Goal = "";
		
		for (int i = 0; i < PERs; i++) {
			Goal += "PER";
		}
		
		int Days = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (Goal.charAt(i) != input.charAt(i)) {
				Days++;
			}
		}
		
		System.out.println(Days);
	}
	
}
