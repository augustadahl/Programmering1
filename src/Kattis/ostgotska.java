package Kattis;

import java.util.Scanner;

public class ostgotska {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		double aecount = 0;
		
		double wordcount = 1;
		
		boolean tested = false;
		
		for (int i = 0; i < input.length() - 1; i++) {

			if (tested == false) {
				if (input.substring(i, i + 2).equals("ae")) {
					aecount++;
					tested = true;
				} 
			}
			
			if (input.charAt(i) == ' ') {
				wordcount++;
				tested = false;
			}
			
		}

		if (aecount / wordcount >= 0.4) {
			System.out.println("dae ae ju traeligt va");
		}
		else {
			System.out.println("haer talar vi rikssvenska");
		}
		
	}
	
}
