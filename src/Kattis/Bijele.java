package Kattis;

import java.util.Scanner;

public class Bijele {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int King = input.nextInt();
	
		int Queen = input.nextInt();
	
		int Rooks = input.nextInt();
	
		int Bishops = input.nextInt();
	
		int Knights = input.nextInt();
	
		int Pawns = input.nextInt();
		
		System.out.print(1 - King + " ");
		System.out.print(1 - Queen + " ");
		System.out.print(2 - Rooks + " ");
		System.out.print(2 - Bishops + " ");
		System.out.print(2 - Knights + " ");
		System.out.print(8 - Pawns + " ");
		
	}
	
}
