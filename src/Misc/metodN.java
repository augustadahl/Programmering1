package Misc;

import java.util.Scanner;

public class metodN {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		N(input.nextInt());
	}
	
	public static void N(int N) {
		for(int i = 1; i <= N; i++) {
			System.out.println(i);
		}
	}

}
