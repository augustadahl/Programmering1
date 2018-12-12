package Kattis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kitten_on_a_tree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int current = sc.nextInt(); sc.nextLine();
		
		ArrayList<String> input = new ArrayList<String>();
		
		while (true) {
			String temp = sc.nextLine();
			
			if (!temp.equals("-1")) {
				input.add(temp);
			} else {
				break;
			}
		}
		
		int[][] branch = new int[input.size()][];
		
		for (int i = 0; i < input.size(); i++) {
			
			String[] temp2 = input.get(i).split(" ");
			
			branch[i] = new int[temp2.length];
			
			for (int j = 0; j < branch[i].length; j++) {
				branch[i][j] = Integer.parseInt(temp2[j]);
			}
		
		}
		
		

		//use continue.
		
	}
	
}
