package _2048;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game_2048 {

	public static Random rd = new Random();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] grid = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				grid[i][j] = 0;
			}
		}

		grid = spawner(grid);
		grid = spawner(grid);

		System.out.println("Current game status:");

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

		boolean running = true;

		while (true) {

			while (true) {
				int dirr = sc.nextInt();

				if (dirr == 4 || dirr == 8 || dirr == 6 || dirr == 2) {
					grid = mover(grid, dirr);

					grid = spawner(grid);

					break;
				} else {
					System.out.println(
							"Input needs to be either 4 (left), 8 (up), 6 (right) or 2 (down). tip look at your numpad");
				}
			}

			System.out.println("Current game status:");

			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					System.out.print(grid[i][j] + " ");
				}
				System.out.println();
			}

			running = tester(grid);

			if (!running) {
				break;
			}
		}

		System.out.println("Game over");

	}

	public static boolean tester(int[][] grid) {
		
		int[][] temp = new int[4][4];
		
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				temp[i][j] = grid[i][j];
			}
		}
		
		boolean possible = false;

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				if (temp[i][j] == 0) {
					possible = true;
					System.out.println("possible");
				}
			}
		}

		
		if (!possible) {
			temp = mover(temp, 4);
			
			for (int i = 0; i < grid.length; i++) {
				System.out.println(Arrays.toString(grid[i]) + Arrays.toString(temp[i]));
			}

			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if (grid[i][j] != temp[i][j]) {
						possible = true;
						System.out.println("possible left");
					}
				}
			}

		}


		if (!possible) {
			temp = mover(temp, 8);

			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if (grid[i][j] != temp[i][j]) {
						possible = true;
						System.out.println("possible up");
					}
				}
			}
			
			for (int i = 0; i < grid.length; i++) {
				System.out.println(Arrays.toString(grid[i]) + Arrays.toString(temp[i]));
			}
			
		}

		if (!possible) {
			temp = mover(temp, 6);

			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if (grid[i][j] != temp[i][j]) {
						possible = true;
						System.out.println("possible right");
					}
				}
			}
			
			for (int i = 0; i < grid.length; i++) {
				System.out.println(Arrays.toString(grid[i]) + Arrays.toString(temp[i]));
			}
			
		}


		if (!possible) {
			temp = mover(temp, 2);

			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if (grid[i][j] != temp[i][j]) {
						possible = true;
						System.out.println("possible down");
					}
				}
			}
			
			for (int i = 0; i < grid.length; i++) {
				System.out.println(Arrays.toString(grid[i]) + Arrays.toString(temp[i]));
			}
			
		}

		return possible;

	}

	public static int[][] spawner(int[][] grid) {

		boolean possible = false;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 0) {
					possible = true;
				}
			}
		}

		if (possible) {
			while (true) {

				int row = rd.nextInt(4 - 0) - 0;

				int col = rd.nextInt(4 - 0) - 0;

				if (grid[row][col] == 0) {
					grid[row][col] = tile();
					break;
				}
			}
		}

		return grid;

	}

	public static int tile() {

		int tile = 2;

		int random = rd.nextInt(10) + 1;

		if (random == 1) {
			tile = 4;
		}

		return tile;

	}

	public static int[][] mover(int[][] grid, int dirr) {

		if (dirr == 4) {

			for (int row = 0; row < 4; row++) {

				boolean[] fused = new boolean[4];

				for (int repeater = 0; repeater < 3; repeater++) {

					for (int col = 1; col < 4; col++) {

						if (grid[row][col] == grid[row][col - 1] && grid[row][col] != 0 && !fused[col - 1]
								&& !fused[col]) {
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

		if (dirr == 8) {

			for (int col = 0; col < 4; col++) {

				boolean[] fused = new boolean[4];

				for (int repeater = 0; repeater < 3; repeater++) {

					for (int row = 1; row < 4; row++) {

						if (grid[row][col] == grid[row - 1][col] && grid[row][col] != 0 && !fused[row - 1]
								&& !fused[row]) {
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

		if (dirr == 6) {

			for (int row = 0; row < 4; row++) {

				boolean[] fused = new boolean[4];

				for (int repeater = 0; repeater < 3; repeater++) {

					for (int col = 2; col >= 0; col--) {

						if (grid[row][col] == grid[row][col + 1] && grid[row][col] != 0 && !fused[col + 1]
								&& !fused[col]) {
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

		if (dirr == 2) {

			for (int col = 0; col < 4; col++) {

				boolean[] fused = new boolean[4];

				for (int repeater = 0; repeater < 3; repeater++) {

					for (int row = 2; row >= 0; row--) {

						if (grid[row][col] == grid[row + 1][col] && grid[row][col] != 0 && !fused[row + 1]
								&& !fused[row]) {
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
