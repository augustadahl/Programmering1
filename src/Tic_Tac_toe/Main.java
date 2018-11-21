package Tic_Tac_toe;

import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("---- Tic Tac Toe ----");
		
		String[] grid = new String[9];
		
		for (int i = 0; i < grid.length; i++) {
			grid[i] = "*";
		}
		
		while (true) {
			
			String turn = "X";
			System.out.println("Pic a square [1-9]");
			
			int place = sc.nextInt();
			
			if (place >= 1 && place <= 9) {
				grid[place - 1] = turn;
			}
			
			Grid(grid);
			
			turn = "O";
			System.out.print("Computer picked: ");
			
			RowTester(grid);
			
		}
		

	}

	
	
	
	public static void Grid(String[] grid) {
		
		int current = 0;
		
		System.out.print(" " + grid[current] + " " );
		current++;
		
		System.out.print("|");
		
		System.out.print(" " + grid[current] + " " );
		current++;
		
		System.out.print("|");
		
		System.out.print(" " + grid[current] + " " );
		current++;
		
		System.out.println();
		
		for (int i = 0; i < 11; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		System.out.print(" " + grid[current] + " " );
		current++;
		
		System.out.print("|");
		
		System.out.print(" " + grid[current] + " " );
		current++;
		
		System.out.print("|");
		
		System.out.print(" " + grid[current] + " " );
		current++;
		
		System.out.println();
		
		for (int i = 0; i < 11; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		System.out.print(" " + grid[current] + " " );
		current++;
		
		System.out.print("|");
		
		System.out.print(" " + grid[current] + " " );
		current++;
		
		System.out.print("|");
		
		System.out.print(" " + grid[current] + " " );
		current++;
		
		System.out.println();
		
		
	}

	public static void RowTester(String[] grid) {
		int i = 1;
		String winner = "";
		
		for (int j = 0; j < 3; j += 3) {
			if (grid[i].equals(grid[i - 1]) && grid[i].equals(grid[i + 1])) {
				winner = grid[i];
				System.out.println(winner);
			} 
		}
		
		
		
	}
	
	
}
