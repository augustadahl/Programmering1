package läxor;

import java.util.Scanner;

public class v41 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println(volume(sc.nextDouble()));
		
		//System.out.println(reverse(sc.nextLine()));
		
		//System.out.println(count(sc.nextLine(), sc.next().charAt(0)));
		
		System.out.println(sjorovare(sc.nextLine()));
		
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
	
	public static int count(String str, char c) {
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}
		return count;
		
	}
	
	public static String sjorovare(String str) {
		
		String sjorovare = "";
		
		String konsonanter = "bcdfghjklmnpqrstvwz";
		
		boolean konsonant = false;

		
		for(int i = 0; i < str.length(); i++) {
			
			konsonant = false;
			
			for(int a = 0; a < konsonanter.length(); a++) {
				
				if(str.toLowerCase().charAt(i) == konsonanter.charAt(a)) {
					sjorovare = sjorovare + str.charAt(i) + 'o' + str.toLowerCase().charAt(i);
					konsonant = true;
				}
				
			}
			
			if(str.charAt(i) == 'x') {
				sjorovare = sjorovare + "koksos";
				konsonant = true;
			}
			
			if(str.charAt(i) == 'X') {
				sjorovare = sjorovare + "Koksos";
				konsonant = true;
			}
			
			if(konsonant != true) {
				sjorovare = sjorovare + str.charAt(i);
			}
			
		}
		
		return sjorovare;
		
		
	}
	
}

