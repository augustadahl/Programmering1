package saker;

import java.util.Scanner;

public class Stocks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double monthSaving = sc.nextDouble();
		
		double Ranta = sc.nextDouble();
		
		double total = 0;
		
		for (int years = 0; years < 70; years++) {
			
			for (int month = 0; month < 12; month++) {
				
				total += monthSaving;
				total *= Ranta/12;
				
			}
			
			System.out.println("År = " + years + "Para = " + total);
		}
		
	}

}
