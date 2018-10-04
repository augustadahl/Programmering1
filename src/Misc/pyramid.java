package Misc;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int bas = input.nextInt();
		
		for(int i = 1; i <= bas; i++) {
			
			for(int j = 1 ; j <= bas - i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print("x ");
			}
			
			System.out.println();
			
		}
		
	}
	
}
