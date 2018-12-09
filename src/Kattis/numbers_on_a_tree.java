package Kattis;

import java.util.Arrays;
import java.util.Scanner;

public class numbers_on_a_tree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt() + 1;
		
		int[][] tree = new int [H][];
		
		
		
		for (int i = 0; i < tree.length; i++) {
		
			if (i == 0) {
				tree[i] = new int[i + 1];
			}
			else {
				tree[i] = new int[(int) Math.pow(2, i)];
			}
			
//			System.out.println(Arrays.toString(tree[i]));
		}
		
		int value = 1;
		
		for (int i = tree.length - 1; i >= 0; i--) {
			for (int j = tree[i].length - 1; j >= 0; j--) {
				tree[i][j] = value;
				value++;
			}
			System.out.println(Arrays.toString(tree[i]));
		}
		
		
		
		
		
	}
	
}
