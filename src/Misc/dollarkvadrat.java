package Misc;

import java.util.Scanner;

public class dollarkvadrat {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int storlek = input.nextInt();
		
		for(int i = 1; i <= storlek; i++) {
			System.out.print("$");
		}
		
		System.out.println();
		
		for(int j = 1; j <= storlek - 2; j++) {
			System.out.print("$");
			for(int k = 1; k <= storlek - 2; k++) {
				System.out.print(" ");
			}
			System.out.println("$");
		}
		
		for(int l = 1; l <= storlek; l++) {
			System.out.print("$");
		}
		
	}
	
}
