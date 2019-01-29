package Kattis;

import java.util.Scanner;

public class Encoded_Message {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt(); sc.nextLine();

		for (int loop = 0; loop < cases; loop++) {
				
			String input = sc.nextLine();

			int size = (int) Math.sqrt(input.length());

			char[][] encoded = new char[size][size];

			String[] decoded = new String[cases];

			int index = 0;

			for (int i = 0; i < encoded.length; i++) {
				for (int j = 0; j < encoded.length; j++) {
					encoded[i][j] = input.charAt(index);
					
					index++;
				}
			} 
			
			decoded[loop] = "";
			
			for (int i = encoded.length - 1; i >= 0; i--) {
				for (int j = 0; j < encoded[i].length; j++) {
					decoded[loop] += encoded[j][i];
				}
			}
			System.out.println(decoded[loop]);
		}
		
		
		
		
	}
	
}
