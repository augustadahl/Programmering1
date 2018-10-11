package Misc;

import java.util.Scanner;

public class metodAgecontroll {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ageControl(input.nextInt());
		
	}
	
	public static void ageControl(int age) {
		
		if(age <= 5) {
			System.out.println("Småbarn får inte göra något.");
		}
		else if(age >= 6 && age <= 12) {
			System.out.println("Du får spela Fortnite");
		}
		else if(age >= 13 && age <= 14) {
			System.out.println("Du är tonåring");
		}
		else if(age >= 15 && age <= 17) {
			System.out.println("Du får köra moppe");
		}
		else if(age >= 18 && age <= 19) {
			System.out.println("Du får köra bil");
		}
		else if(age >= 20 && age <= 67) {
			System.out.println("Du får gå på systemet");
		}
		else if(age >= 68 && age <= 99) {
			System.out.println("Du är pensionär");
		}
		else if(age >= 100) {
			System.out.println("RIP");
		}
		
	}
	
}
