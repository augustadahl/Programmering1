package Kattis;

import java.util.Scanner;

public class Spavanac {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int hour = input.nextInt();
		
		int minute = input.nextInt();
		
		minute = minute - 45;
		
		if(minute < 0) {
			hour = hour - 1;
			minute = 60 + minute;
		}
		
		if(hour < 0) {
			hour = 24 + hour;
		}
		
		System.out.print(hour + " " + minute);
		
		
	}

}
