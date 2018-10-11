package Misc;

import java.util.Scanner;

public class metodMINSTOR {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		
		int b = input.nextInt();
		
		int min = min(a, b);
		
		System.out.println(min);
		
	}
	
	public static int min(int a, int b) {
		if(a < b) {
			return a;
		}
		else {
			return b;
		}
	}

}
