package Kattis;

import java.util.Scanner;

public class Autori {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String[] names = input.split("-");
		
		String initials = "";
		
		for (int i = 0; i < names.length; i++) {
			initials += names[i].charAt(0);
		}
		
		System.out.println(initials);
		
	}
	
}
