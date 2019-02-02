package Kattis;

import java.util.Scanner;

public class two_stones {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if (input % 2 == 1) {
			System.out.println("Alice");
		}
		else {
			System.out.println("Bob");
		}
		
	}
	
}
