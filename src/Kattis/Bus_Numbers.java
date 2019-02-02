package Kattis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//incomplete

public class Bus_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] Bus = new int[N];
		
		for (int i = 0; i < N; i++) {
			Bus[i] = sc.nextInt();

		}
		Arrays.sort(Bus);
		
		int lo = Bus[0];
		
		int hi = 0;
		
		System.out.println(Bus[0]);
		
		for (int i = 0; i < Bus.length; i++) {
			if (true) {
				
			}
		}
		
		
	
		
		
	}
	
}
