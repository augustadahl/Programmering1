package Misc;

import java.util.Scanner;

public class mangesekuner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int tim = input.nextInt();
		
		int min = input.nextInt();
		
		int sec = input.nextInt();
		
		min = min + tim * 60;
		sec = sec + min * 60;
		
		System.out.println(sec);
		
	}
	
}
