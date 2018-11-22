package Tic_Tac_toe;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	
	public static Random rd = new Random();

	public static void main(String[] args) {

		System.out.println("---- Tic Tac Toe ----");

		String[] grid = new String[9];

		for (int i = 0; i < grid.length; i++) {
			grid[i] = "*";
		}

		while (true) {

			grid = PlayerTurn(grid);
			
			boolean done = TestForWinner(grid);

			if (done == true) {
				break;
			}

			grid = ComputerTurn(grid);

			done = TestForWinner(grid);

			if (done == true) {
				break;
			}

		}

	}

	public static String[] PlayerTurn(String[] grid) {
		System.out.println("Pic a square [1-9]");

		while (true) {
			int place = sc.nextInt();

			if (place >= 1 && place <= 9) {
				if(grid[place - 1].equals("*")) {
					grid[place - 1] = "X";
					Grid(grid);
					break;
				}
				else {
					System.out.println("Occupied");
				}
			}
			else {
				System.out.println("Out of bounds");
			}	
		}

		return grid;
	}

	public static String[] ComputerTurn(String[] grid) {

		System.out.print("Computer picked: ");
		
		while (true) {

			int place = rd.nextInt(8 - 0) - 0;

			if (grid[place].equals("*")) {
				grid[place] = "O";
				System.out.println(place + 1);
				Grid(grid);
				break;
			} 
		}
		
		

		//grid[place - 1] = "O";
		//Grid(grid);
		
		return grid;
	}

	public static void Grid(String[] grid) {

		int current = 0;

		System.out.print(" " + grid[current] + " ");
		current++;

		System.out.print("|");

		System.out.print(" " + grid[current] + " ");
		current++;

		System.out.print("|");

		System.out.print(" " + grid[current] + " ");
		current++;

		System.out.println();

		for (int i = 0; i < 11; i++) {
			System.out.print("-");
		}
		System.out.println();

		System.out.print(" " + grid[current] + " ");
		current++;

		System.out.print("|");

		System.out.print(" " + grid[current] + " ");
		current++;

		System.out.print("|");

		System.out.print(" " + grid[current] + " ");
		current++;

		System.out.println();

		for (int i = 0; i < 11; i++) {
			System.out.print("-");
		}
		System.out.println();

		System.out.print(" " + grid[current] + " ");
		current++;

		System.out.print("|");

		System.out.print(" " + grid[current] + " ");
		current++;

		System.out.print("|");

		System.out.print(" " + grid[current] + " ");
		current++;

		System.out.println();

	}

	public static String[] RowCreator(String[] grid) {

		String[] rows = new String[8];

		rows[0] = grid[0] + grid[1] + grid[2];

		rows[1] = grid[3] + grid[4] + grid[5];

		rows[2] = grid[6] + grid[7] + grid[8];

		rows[3] = grid[0] + grid[3] + grid[6];

		rows[4] = grid[1] + grid[4] + grid[7];

		rows[5] = grid[2] + grid[5] + grid[8];

		rows[6] = grid[0] + grid[4] + grid[8];

		rows[7] = grid[2] + grid[4] + grid[6];

		
		return rows;

	}

	public static boolean TestForWinner(String[] grid) {

		boolean stalemate = true;
		
		boolean done = false;

		String[] rows = RowCreator(grid);

		for (int i = 0; i < rows.length; i++) {
			
			if (rows[i].equals("XXX")) {
				System.out.println("*Player Wins*");
				done = true;
				break;
			} else if (rows[i].equals("OOO")) {
				System.out.println("*Computer Wins*");
				done = true;
				break;
			}
				
		}
		
		for (int j = 0; j < grid.length; j++) {
			if (grid[j].equals("*")) {
				stalemate = false;
			}
		}
		
		if (stalemate == true) {
			done = true;
		}
		
		return done;

	}

}
