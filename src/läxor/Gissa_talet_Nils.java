package l�xor;

import java.util.Random;
import java.util.Scanner;

public class Gissa_talet_Nils {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("hej och v�lkomna till gissa talet");
		
		int tal = rd.nextInt(0 + 100) + 1;
		
		int points = 0;
		
		System.out.println("Gissa p� ett tal mellan 1 och 100");
		
		while (true) {
			
			int input = sc.nextInt();
			
			if (input == tal) {
				System.out.println("Du vann! po�ng: " + (points + 1));
				break;
			}
			
			if (input > tal) {
				System.out.println("L�gre");
				points++;
			}
			else {
				System.out.println("H�gre");
				points++;
			}
			
			System.out.println("po�ng: " + points);
		}
		
	}
	
}
