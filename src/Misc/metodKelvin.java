package Misc;

import java.util.Scanner;

public class metodKelvin {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(kelvin(input.nextDouble()));
		
	}
	
	public static double kelvin(double celcius) {
		
		double kelvin = -273.15 + celcius;
		
		return kelvin;
	}
	
}
