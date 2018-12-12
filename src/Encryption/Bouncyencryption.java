package Encryption;

import java.util.Scanner;

public class Bouncyencryption {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String decrypt = sc.nextLine();

		System.out.println(cryptate(decrypt));

		System.out.println(decrypt(cryptate(decrypt)));

		// System.out.println(decrypt("AJAJHASSE"));

	}

	public static String cryptate(String uncrypt) {
		
		int row = uncrypt.length() / 3;
		
		if (row < 2) {
			row = 2;
		}

		int col = (row * 2) - 1;
		
		char[][] matrix = new char[row][col];

		int letter = 0;

		int dircol = 1;
		int dirrow = 1;

		int currentcol = 0;

		int currentrow = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ' ';
			}
		}
		
		String crypt = "";
		
		while (letter < uncrypt.length()) {
			if (matrix[currentrow][currentcol] == ' ') {
				matrix[currentrow][currentcol] = crypt.charAt(letter);

				letter++;
			}

			currentcol += dircol;
			currentrow += dirrow;

			if (currentcol >= col) {
				dircol = dircol * -1;
				currentcol -= 2;
			}
			if (currentrow >= row) {
				dirrow = dirrow * -1;
				currentrow -= 2;
			}
			if (currentcol < 0) {
				dircol = 1;
				currentcol += 2;
			}
			if (currentrow < 0) {
				dirrow = 1;
				currentrow += 2;
			}

		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] != ' ') {
					crypt += matrix[i][j];
				}
			}
		}
		
		
		return crypt;
		
	}
	
	
	
	public static String decrypt(String crypt) {

		int row = crypt.length() / 3;
		
		if (row < 2) {
			row = 2;
		}

		int col = (row * 2) - 1;

		char[][] matrix = new char[row][col];

		int letter = 0;

		int dircol = 1;
		int dirrow = 1;

		int currentcol = 0;

		int currentrow = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ' ';
			}
		}

		while (letter < crypt.length()) {
			if (matrix[currentrow][currentcol] == ' ') {
				matrix[currentrow][currentcol] = crypt.charAt(letter);

				// System.out.println(currentcol + " " + currentrow +
				// matrix[currentrow][currentcol]);

				letter++;
			}

			currentcol += dircol;
			currentrow += dirrow;

			if (currentcol >= col) {
				dircol = dircol * -1;
				currentcol -= 2;
			}
			if (currentrow >= row) {
				dirrow = dirrow * -1;
				currentrow -= 2;
			}
			if (currentcol < 0) {
				dircol = 1;
				currentcol += 2;
			}
			if (currentrow < 0) {
				dirrow = 1;
				currentrow += 2;
			}

		}

		letter = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] != ' ') {
					matrix[i][j] = crypt.charAt(letter);
					letter++;
				}
			}
		}

		letter = 0;

		dircol = 1;
		dirrow = 1;

		currentcol = 0;

		currentrow = 0;

		boolean[][] matrixbool = new boolean[row][col];

		for (int i = 0; i < matrixbool.length; i++) {
			for (int j = 0; j < matrixbool[i].length; j++) {
				matrixbool[i][j] = false;
			}
		}

		String uncrypt = "";

		while (letter < crypt.length()) {
			if (matrixbool[currentrow][currentcol] == false) {
				uncrypt += matrix[currentrow][currentcol];
				matrixbool[currentrow][currentcol] = true;
				letter++;
			}

			currentcol += dircol;
			currentrow += dirrow;

			if (currentcol >= col) {
				dircol = dircol * -1;
				currentcol -= 2;
			}
			if (currentrow >= row) {
				dirrow = dirrow * -1;
				currentrow -= 2;
			}
			if (currentcol < 0) {
				dircol = 1;
				currentcol += 2;
			}
			if (currentrow < 0) {
				dirrow = 1;
				currentrow += 2;
			}

		}

		return uncrypt;

	}
}
