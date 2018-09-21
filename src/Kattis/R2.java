package Kattis;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int R1 = input.nextInt();
				
		int S = input.nextInt();
		
		input.close();
		
		System.out.println(S * 2 - R1);
			
	}

}
