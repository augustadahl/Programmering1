package Kattis;

import java.util.Scanner;

public class Ive_Been_Everywhere_Man {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt(); 
		int[] cities = new int [cases];
		
		for (int i = 0; i < cases; i++) {
			
			cities[i] = 0;

			String[] names = new String[sc.nextInt()];
			
			boolean[] tested = new boolean[names.length];
					
			for (int j = 0; j < names.length; j++) {
				names[j] = sc.next();
				tested[j] = false;
			}
			
			
			for (int j = 0; j < names.length; j++) {
				
				if (tested[j] != true) {
					
					for (int j2 = 0; j2 < names.length; j2++) {
						
						if (j != j2) {
							
							if (names[j].equals(names[j2])) {
								tested[j2] = true;
							}
						}		
					}
					cities[i]++;
					tested[j] = true;
					
				}			
			}	
		}
		
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
		
		
				
	}
}
