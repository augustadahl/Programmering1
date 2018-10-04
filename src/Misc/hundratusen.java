package Misc; //DEN GÖR INTE DET MAN VILL!!!

import java.util.Scanner;

public class hundratusen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int produkt = 1;
		
		int talmangd = 0;
		
		int tal = input.nextInt();
		
		while(produkt <= 100000 && talmangd < 10) {
			talmangd ++;
			produkt = produkt * tal;
			System.out.println(produkt);
			tal = input.nextInt();
			
		}
		
		System.out.println("produkt: " + produkt);
		System.out.println("antal tal: " + talmangd);
		
	}
	
	
}
