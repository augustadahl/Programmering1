package Kattis;

import java.util.Scanner;

public class numbers_on_a_tree {
	
	//Programmet fungerar felfritt men är för ineffektivt enligt kattis (får memory limit exceeded)

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		sc.close();
		
		int space = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				space = i;
				break;
			}
		}
		
		int H;
		if(space != 0) {
			H = (Integer.parseInt(input.substring(0, space))) + 1;
			input = input.substring(space + 1, input.length()); 
		}
		else {
			H = (Integer.parseInt(input.substring(0, input.length()))) + 1;
			input = ""; 
		}

		int[][] tree = new int [H][];
		
		for (int i = 0; i < tree.length; i++) {
		
			if (i == 0) {
				tree[i] = new int[i + 1];
			}
			else {
				tree[i] = new int[(int) Math.pow(2, i)];
			}
			
		}
		
		int value = 1;
		
		for (int i = tree.length - 1; i >= 0; i--) {
			for (int j = tree[i].length - 1; j >= 0; j--) {
				tree[i][j] = value;
				value++;
			}
		}
		
		int possition = 0;
		int place = tree[0][0];
		
		if (!input.isEmpty()) {
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == 'L') {
					possition = ((possition + 1) * 2) - 2;
				} else {
					possition = ((possition + 1) * 2) - 1;
				}
				place = tree[input.length()][possition];
				System.out.println(place);
			} 
			
		}
		
		System.out.println(place);
		
	}
	
}
