import java.util.Scanner;

public class Läxa36 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du");
		
		String name = input.nextLine();
		
		System.out.println("Hur gammal är du?");
		
		String ålder = input.nextLine();
	 
		System.out.println("Vad är din adress?");
		
		String adress = input.nextLine();
		
		System.out.println("Vad är ditt postnummer?");
		
		String postnummer = input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		
		String stad = input.nextLine();
		
		System.out.println("Vad är ditt telefonnummer?");
		
		String telefon = input.nextLine();
		
		input.close();

		
	}
	
	
	
	
	
}
