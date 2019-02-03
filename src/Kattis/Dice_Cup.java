package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class Dice_Cup {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int M = sc.nextInt();

		int[] prob = new int[N + M];

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				prob[(i + j) - 1]++;
			}
		}
		
		ArrayList<Integer> likley = new ArrayList<Integer>();
		
		int highest = prob[0];
		
		for (int i = 0; i < prob.length; i++) {
			
			if (prob[i] > highest) {
				highest = prob[i];
			}
		}
		
		for (int i = 0; i < prob.length; i++) {
			if (prob[i] == highest) {
				likley.add(i + 1);
			}
		}
		
		for (int i = 0; i < likley.size(); i++) {
			System.out.println(likley.get(i));
		}

	}

}
