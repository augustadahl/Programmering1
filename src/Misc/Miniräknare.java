package Misc;

import java.util.Scanner;

public class Miniräknare {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Miniräknare skriv 1 tal sedan +, -, / eller * följt av ett till tal");
		
		double summa;
		
		System.out.println();
		
		double tal1 = input.nextDouble();
		
		String line = input.nextLine();
		
		double tal2 = input.nextDouble();
		input.close();
		
		if (line.equals("plus")) {
			summa = tal1 + tal2;
			System.out.println(tal1 + "+" + tal2 + "=" + summa);
		}
		if (line.equals("minus")) {
			summa = tal1 - tal2;
			System.out.println(tal1 + "-" + tal2 + "=" + summa);
		}
		if (line.equals("delat")) {
			summa = tal1 / tal2;
			System.out.println(tal1 + "/" + tal2 + "=" + summa);
		}
		if (line.equals("ganger")) {
			summa = tal1 * tal2;
			System.out.println(tal1 + "*" + tal2 + "=" + summa);
		}
			
		
		
		
	
	
	}
}
