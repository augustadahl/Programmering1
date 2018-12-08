package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class Speed_Limit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> log = new ArrayList<Integer>();
		
		
		
		//alist.add("Steve");
		
		while (true) {
			int miles = 0;
			int N = sc.nextInt();
			
			if (N == -1) {
				break;
			}

			for (int i = 0; i < N; i++) {
				miles += sc.nextInt() * sc.nextInt();
			} 
			
			log.add(miles);
		}
		
		for (int i = 0; i < log.size(); i++) {
			System.out.println(log.get(i) + "miles");
		}
		
	}
	
	
}
