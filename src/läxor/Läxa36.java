package läxor;
import java.util.Scanner;

public class Läxa36 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du");
		
		String namn = input.nextLine();
		
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

		System.out.println("Information:");
	 
		System.out.println("Namn: " + namn);
		
		System.out.println("Ålder: " + ålder);
		
		System.out.println("Adress: " + adress + "\r        " + postnummer + " " + stad);
		
		System.out.println("Telefon: " + telefon);

		
	}
	
	
	
	
	
}
