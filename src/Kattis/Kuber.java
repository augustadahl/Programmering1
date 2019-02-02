package Kattis;

import java.util.Scanner;

public class Kuber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tal = sc.nextInt();
		
		int result = 0;
		
		for (int i = 1; i <= tal; i++) {
			
			result += Math.pow(i, 3);
			
		}
		
		System.out.println(result);
	}
	
}
