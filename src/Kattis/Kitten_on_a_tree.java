package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class Kitten_on_a_tree {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
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
		
		boolean tree = true;
		
		ArrayList<Integer> way = new ArrayList<Integer>();
		
		way.add(current);
		
		while (tree) {
			
			tree = false;
			
			for (int i = 0; i < branch.length; i++) {
				for (int j = 1; j < branch[i].length; j++) {
					if (current == branch[i][j]) {
						current = branch[i][0];	
						way.add(current);
						tree = true;
					}
				}
			}
		}
		
		for (int i = 0; i < way.size(); i++) {
			System.out.print(way.get(i) + " ");
		}
		
		

		//use continue.
		
	}
	
}
