package Kattis;

import java.util.Scanner;

//incomplete

public class Grid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int M = sc.nextInt();

		int[] input = new int[N];

		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}

		sc.close();
		
		String[] converter = new String[N];

		for (int i = 0; i < converter.length; i++) {
			converter[i] = Integer.toString(input[i]);
		}

		int[][] grid = new int[N][M];

		for (int i = 0; i < grid.length; i++) {
			
			for (int j = 0; j < grid[i].length; j++) {
				
				grid[i][j] = Integer.parseInt(converter[i].substring(j, j + 1)); // Integer.parseInt(null,
																					// converter[i].charAt(i));

			}

			
		}

		int[][] value = new int[N][M];

		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value[i].length; j++) {
				value[i][j] = -1;
			}
		}

		int current = 0;

		value[0][0] = 0;
		
		boolean possible = true;

		while (value[N - 1][M - 1] == -1 && possible) {
			
			possible = false;
			
			for (int i = 0; i < value.length; i++) {
				for (int j = 0; j < value[i].length; j++) {
					
					if (value[i][j] == current) {
						
						possible = true;
						
						if (i - grid[i][j] >= 0 && value[i - grid[i][j]][j] == -1) {
							value[i - grid[i][j]][j] = current + 1;
							
						}
						
						if (i + grid[i][j] < N && value[i + grid[i][j]][j] == -1) {
							value[i + grid[i][j]][j] = current + 1;

						}
						
						if (j - grid[i][j] >= 0 && value[i][j - grid[i][j]] == -1) {
							value[i][j - grid[i][j]] = current + 1;

						}
						
						if (j + grid[i][j] < M && value[i][j + grid[i][j]] == -1) {
							value[i][j + grid[i][j]] = current + 1;
						}
					}
				}
			}
			
			current++;
			
		}
		
		System.out.println(value[N - 1][M - 1]);

//		int[][] way = new int[M * N][];
//		
//		for (int i = 0; i < grid.length; i++) {
//			for (int j = 0; j < grid[i].length; j++) {
//				int 
//			}
//		}

	}

}
