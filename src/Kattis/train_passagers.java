package Kattis;

import java.util.Scanner;

public class train_passagers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int capacity = sc.nextInt();
		
		int stations = sc.nextInt();
		
		int passengers = 0;
		
		int waiting = 0;
		
		boolean possible = true;
		
		for (int i = 0; i < stations; i++) {
			
			passengers -= sc.nextInt();
			
			if (passengers < 0) {
				possible = false;
			}
			
			
			passengers += sc.nextInt();
			
			if (passengers > capacity) {
				possible = false;
			} 
			
			
			waiting = sc.nextInt();
			
			if (waiting > 0 && passengers < capacity) {
				possible = false;
			}
			
		}
		
		if (passengers > 0 || waiting > 0) {
			possible = false;
		}
		
		if (possible == true) {
			System.out.println("possible");
		}
		else {
			System.out.println("impossible");
		}
		
		
		
		
		
		
		
	}
	
}
