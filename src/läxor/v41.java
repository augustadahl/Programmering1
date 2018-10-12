package läxor;

import java.util.Scanner;

public class v41 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println(volume(sc.nextDouble()));
		
		System.out.println(reverse(sc.nextLine()));
		
	}
	
	public static double volume(double radius) {
		
		double volume = radius * radius * radius * 3.14 * 4 / 3;
		
		
		return volume;
	}
	
	public static String reverse(String str) {
		
		String reverse = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		return reverse;
	}
	
}

