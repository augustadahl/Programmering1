package Tävling;

import java.util.Scanner;

public class Studschiffer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();

		int col = sc.nextInt();

		String uncrypt = sc.next();

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

		while (letter < uncrypt.length()) {
			if (matrix[currentrow][currentcol] == ' ') {
				matrix[currentrow][currentcol] = uncrypt.charAt(letter);

				//System.out.println(currentcol + " " + currentrow + matrix[currentrow][currentcol]);

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

//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				if (matrix[i][j] != ' ') {
//					System.out.print(matrix[i][j]);
//				}
//			}
//		}

		//System.out.println();

		letter = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] != ' ') {
					matrix[i][j] = uncrypt.charAt(letter);
					letter++;
				}
			}
		}

//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				if (matrix[i][j] != ' ') {
//					System.out.print(matrix[i][j]);
//				}
//			}
//		}

		//System.out.println();
		
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
		
		

		while (letter < uncrypt.length()) {
			if (matrixbool[currentrow][currentcol] == false) {
				System.out.print(matrix[currentrow][currentcol]);
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

//		for (int i = 0; i < matrix[i].length; i++) {
//			for (int j = 0; j < matrix.length; j++) {
//				if (matrix[j][i] != ' ') {
//					System.out.print(matrix[j][i]);
//				}
//			}
//		}

//		while (currentcol < col - 1) {
//			for (int i = 0; i < matrix.length || currentcol < col - 1; i++) {
//				System.out.println(currentcol + " " + i);
//				currentcol++;
//			} 
//			for (int i = matrix.length - 2; i > 0 || currentcol < col - 1; i--) {
//				System.out.println(currentcol + " " + i);
//				currentcol++;
//			}
//		}

	}
}
