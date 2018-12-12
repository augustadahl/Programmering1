package Tävling;

import java.util.Scanner;

public class uppg1_kuber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int smakuber = 0;
		
		for (int i = 1; i <= N; i++) {
			
			smakuber += (i*i*i);
			
		}
		
		System.out.println(smakuber);

	}

}
