package Hangman;

import java.util.ArrayList;
import java.util.Scanner;

//Skriv in hemligt ord och gissa därefter dig fram till rätt ord en bokstav i taget


public class hangman_main {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String Input = sc.nextLine();
		
		char[] SecretHidden = new char[Input.length()];
		
		char[] SecretVisible = new char[Input.length()];
		
		for (int i = 0; i < SecretVisible.length; i++) {
			
			SecretVisible[i] = Input.charAt(i);
			
			if (SecretVisible[i] == ' ') {
				SecretHidden[i] = ' ';
			} else {
				SecretHidden[i] = '_';
			}
		}
		
		int limbs = 6;
		
		ArrayList<Character> taken = new ArrayList<Character>();
		
		boolean lost = true;
		
		status(SecretHidden, limbs, taken, lost);
		
		boolean running = true;
		
		
		//_________________________________________________________________________
		
		
		while (running) {
			
			lost = false;
			
			char letter = sc.next().charAt(0);
			
			if (validater(taken, letter)) {
				boolean wrong = true;
				
				char[] temp = new char[SecretHidden.length];
				
				for (int i = 0; i < SecretHidden.length; i++) {
					temp[i] = SecretHidden[i];
				}
				
				SecretHidden = updater(SecretHidden, SecretVisible, letter); 
				
				taken.add(letter);
				
				for (int i = 0; i < temp.length; i++) {
					if (temp[i] != SecretHidden[i]) {
						wrong = false;
					}
				}
				
				if (wrong) {
					limbs--;
					if (limbs <= 6) {
						lost = true;
					}
				}
				
				if (taken.size() == 4) {
					boolean nuke = true;
					
					String easteregg = "nuke";
					
					for (int i = 0; i < taken.size(); i++) {
						if (easteregg.charAt(i) != Character.toLowerCase(taken.get(i))) {
							nuke = false;
						}
					} 
					
					if (nuke) {
						limbs += 8;
						lost = true;
					}
					
				}
				
				status(SecretHidden, limbs, taken, lost);
			}
			
			if (limbs == 0) {
				running = false;
				System.out.println("Game Over");
			}
			
			boolean win = true;
			
			for (int i = 0; i < SecretVisible.length; i++) {
				if (SecretVisible[i] != SecretHidden[i]) {
					win = false;
				}
			}
			
			if (win) {
				System.out.println("YOU WIN!!!");
				running = false;
			}
			
			
		}
		
	}
	
	
	
	
	public static boolean validater(ArrayList<Character> taken, char letter) {
		
		boolean yes = true;
		
		for (int i = 0; i < taken.size(); i++) {
			if (taken.get(i) == letter || letter == ' ') {
				yes = false;
			}
		}
		
		if (!yes) {
			System.out.println("WRONG");
			return false;
		}
		else {
			return true;
		}
		
	}

	
	public static char[] updater(char[] SecretHidden, char[] SecretVisible, char letter) {
		
		for (int i = 0; i < SecretVisible.length; i++) {
			if (Character.toLowerCase(letter) == Character.toLowerCase(SecretVisible[i])) {
				SecretHidden[i] = SecretVisible[i];
			}
		}
		
		return SecretHidden;
		
	}
	
	public static void status(char[] SecretHidden, int limbs, ArrayList<Character> taken, boolean lost) {
		
		System.out.println("Game Status:");
		
		System.out.print("|");
		
		for (int i = 0; i < SecretHidden.length; i++) {
			System.out.print(SecretHidden[i] + "|");
		}
		
		//System.out.println(SecretHidden);
		
		System.out.println();
		

		System.out.println("Taken Characters:");
		
		System.out.print("|");
		
		for (int i = 0; i < taken.size(); i++) {
			System.out.print(taken.get(i) + "|");
		}
		
		System.out.println();
		
		System.out.println("Limbs remaining: " + limbs);
		
		
		
		if (lost) {
			if (limbs > 6) {
				System.out.println("*Chernobly is hell of a place*");
			}
			if (limbs == 6) {
				System.out.println("*you're one healthy bastard*");
			}
			if (limbs == 5) {
				System.out.println("*You just lost a leg*");
			}
			if (limbs == 4) {
				System.out.println("*Aw man not even a cane can help you now*");
			}
			if (limbs == 3) {
				System.out.println("*Lets hope you still have your good arm*");
			}
			if (limbs == 2) {
				System.out.println("*Keep yo head cool*");
			}
			if (limbs == 1) {
				System.out.println("*PROTECT THE COCK AT ALL COSTS*");
			} 
		}
		
		
	}
	
	
	
	
}
