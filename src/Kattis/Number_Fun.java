package Kattis;

import java.util.Scanner;

public class Number_Fun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		boolean[] answers = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			
			answers[i] = false;
			
			int X = sc.nextInt();
			
			int Y = sc.nextInt();
			
			int Goal = sc.nextInt();
			
			if (X + Y == Goal || X - Y == Goal || Y - X == Goal) {
				answers[i] = true;
			}
			
			double divisionYX = (double) Y / X;
			
			double divisionXY = (double) X / Y;
			
			if (Goal == divisionXY || divisionYX == Goal) {
				answers[i] = true;
			}
			
			double multimultiplication = (double) X * Y;
			
			if (multimultiplication == Goal) {
				answers[i] = true;
			}
			
		}
		
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == true) {
				System.out.println("Possible");
			}
			else {
				System.out.println("Impossible");
			}
		}
		
		
	}
}
