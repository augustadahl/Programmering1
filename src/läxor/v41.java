package läxor;

import java.util.Scanner;

public class v41 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println(volume(sc.nextDouble()));
		
		//System.out.println(reverse(sc.nextLine()));
		
		System.out.println(count(sc.nextLine(), sc.next().charAt(0)));
		
		//System.out.println(sjorovare(sc.nextLine()));
		
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
		
		String vokaler = "aouåeiyäö";
		
		String konsonanter = "bcdfghjklmnpqrstvwz";
		
		String StoraVokaler = "AOUÅEIYÄÖ";
		
		String StoraKonsonanter = "BCDFGHJKLMNPQRSTVWZ";
		
		for(int i = 0; i < str.length(); i++) {
			
			for(int a = 0; a < vokaler.length(); a++) {
				
				if(str.charAt(i) == vokaler.charAt(a)) {
					sjorovare = sjorovare + str.charAt(i);
				}	
			}
			
			
			for(int c = 0; c < StoraVokaler.length(); c++) {
				
				if(str.charAt(i) == StoraVokaler.charAt(c)) {
					sjorovare = sjorovare + str.charAt(i);
				}	
			}
			
			for(int b = 0; b < konsonanter.length(); b++) {
				
				if(str.charAt(i) == konsonanter.charAt(b)) {
					sjorovare = sjorovare + str.charAt(i) + 'o' + str.charAt(i);
				}				
			}
			
			for(int d = 0; d < StoraKonsonanter.length(); d++) {
				
				if(str.charAt(i) == StoraKonsonanter.charAt(d)) {
					sjorovare = sjorovare + str.charAt(i) + 'o' + str.toLowerCase().charAt(i);
				}				
			}
			
			if(str.charAt(i) == 'x') {
				sjorovare = sjorovare + "koksos";
			}
			
			if(str.charAt(i) == 'X') {
				sjorovare = sjorovare + "Koksos";
			}
			
			if(str.charAt(i) == ' ') {
				sjorovare = sjorovare + ' ';
			}
			
		}
		
		return sjorovare;
		
	}
	
}

