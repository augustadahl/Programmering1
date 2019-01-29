package Hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Läsa in en mening
//Skriva ut _____ __ fär ordet/meningen
//Läsa in bokstäver som gissas
//Skriva ut om det är korrekt eller inte
//Skriva ut antalet LIMBS som är kvar
//Kontrollera om man vunnit eller ej


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
		
		status(SecretHidden, limbs, taken);
		System.out.println("None");
		
		while (true) {
			
			
			
		}
		
	}
	
	
	
	public static void status(char[] SecretHidden, int limbs, ArrayList<Character> taken) {
		
		System.out.println("Game Status:");
		
		System.out.print("|");
		
		for (int i = 0; i < SecretHidden.length; i++) {
			System.out.print(SecretHidden[i] + "|");
		}
		
		//System.out.println(SecretHidden);
		
		System.out.println();
		
		System.out.println("Limbs remaining: " + limbs);
		
		System.out.println("Taken Characters:");
		
		System.out.print("|");
		
		for (int i = 0; i < taken.size(); i++) {
			System.out.print(taken.get(i) + "|");
		}
		
		System.out.println();
		
	}
	
	
}
