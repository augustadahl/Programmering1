package Kattis;

import java.util.Scanner;

public class Tarifa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int N = sc.nextInt();
		
		int Sol = X;
		
		for (int i = 0; i < N; i++) {
			
			Sol += X - sc.nextInt();
			
		}
		
		System.out.println(Sol);
		
	}
	
}
