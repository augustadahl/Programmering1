package Kattis;

// INCOMPLETE


import java.util.Scanner;

public class Need_for_speed {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int Hours = sc.nextInt();

		int[] Miles = new int[N];
		
		int milesSum = 0;

		int[] reading = new int[N];

		for (int i = 0; i < N; i++) {

			Miles[i] = sc.nextInt();

			milesSum = Miles[i];
			
			reading[i] = sc.nextInt();

		}

			Double AvgMph = (double) (milesSum / Hours);
			
			

			
			
			
			
//		Double AvgReading = (double) (reading / N);
//
//		Double Answer = AvgMph + reading;
//
//		System.out.println(Answer);

	}

}
