package Kattis;

import java.util.Arrays;
import java.util.Scanner;

public class tvåtusen48 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] grid = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				grid[i][j] = sc.nextInt();
			}
		}

		

		int dirr = sc.nextInt();

		grid = mover(grid, dirr);

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		
//		for (int j = 0; j < 4; j++) {
//			System.out.println(Arrays.toString(grid[j]));
//		}

	}

	public static int[][] mover(int[][] grid, int dirr) {

		if (dirr == 0) {

			for (int row = 0; row < 4; row++) {

				boolean[] fused = new boolean[4];

				for (int repeater = 0; repeater < 3; repeater++) {

					for (int col = 1; col < 4; col++) {

						if (grid[row][col] == grid[row][col - 1] && grid[row][col] != 0 && !fused[col-1] && !fused[col]) {
							grid[row][col - 1] = grid[row][col] + grid[row][col - 1];
							grid[row][col] = 0;
							fused[col - 1] = true;
						}

						if (grid[row][col - 1] == 0 && grid[row][col] != 0) {
							grid[row][col - 1] = grid[row][col];
							grid[row][col] = 0;
						}
					}
				}
			}
		}

		if (dirr == 1) {

			for (int col = 0; col < 4; col++) {

				boolean[] fused = new boolean[4];

				for (int repeater = 0; repeater < 3; repeater++) {

					for (int row = 1; row < 4; row++) {

						if (grid[row][col] == grid[row - 1][col] && grid[row][col] != 0 && !fused[row-1] && !fused[row]) {
							grid[row - 1][col] = grid[row][col] + grid[row - 1][col];
							grid[row][col] = 0;
							fused[row - 1] = true;
						}

						if (grid[row - 1][col] == 0 && grid[row][col] != 0) {
							grid[row - 1][col] = grid[row][col];
							grid[row][col] = 0;
						}

					}
				}
			}
		}
		
		if (dirr == 2) {

			for (int row = 0; row < 4; row++) {

				boolean[] fused = new boolean[4];

				for (int repeater = 0; repeater < 3; repeater++) {

					for (int col = 2; col >= 0; col--) {

						if (grid[row][col] == grid[row][col + 1] && grid[row][col] != 0 && !fused[col+1] && !fused[col]) {
							grid[row][col + 1] = grid[row][col] + grid[row][col + 1];
							grid[row][col] = 0;
							fused[col + 1] = true;
						}

						if (grid[row][col + 1] == 0 && grid[row][col] != 0) {
							grid[row][col + 1] = grid[row][col];
							grid[row][col] = 0;
						}
					}
				}
			}
		}
		
		if (dirr == 3) {

			for (int col = 0; col < 4; col++) {

				boolean[] fused = new boolean[4];

				for (int repeater = 0; repeater < 3; repeater++) {

					for (int row = 2; row >= 0; row--) {

						if (grid[row][col] == grid[row + 1][col] && grid[row][col] != 0 && !fused[row+1] && !fused[row]) {
							grid[row + 1][col] = grid[row][col] + grid[row + 1][col];
							grid[row][col] = 0;
							fused[row + 1] = true;
						}

						if (grid[row + 1][col] == 0 && grid[row][col] != 0) {
							grid[row + 1][col] = grid[row][col];
							grid[row][col] = 0;
						}

					}
				}
			}
		}

		return grid;

	}

}
