package läxor;

import java.util.Random;
import java.util.Scanner;

public class Gissa_talet_Nils {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("hej och välkomna till gissa talet");
		
		int tal = rd.nextInt(0 + 100) + 1;
		
		int points = 0;
		
		System.out.println("Gissa på ett tal mellan 1 och 100");
		
		while (true) {
			
			int input = sc.nextInt();
			
			if (input == tal) {
				System.out.println("Du vann! poäng: " + (points + 1));
				break;
			}
			
			if (input > tal) {
				System.out.println("Lägre");
				points++;
			}
			else {
				System.out.println("Högre");
				points++;
			}
			
			System.out.println("poäng: " + points);
		}
		
	}
	
}
