package l�xor;
import java.util.Scanner;

public class L�xa36 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du");
		
		String namn = input.nextLine();
		
		System.out.println("Hur gammal �r du?");
		
		String �lder = input.nextLine();
	 
		System.out.println("Vad �r din adress?");
		
		String adress = input.nextLine();
		
		System.out.println("Vad �r ditt postnummer?");
		
		String postnummer = input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		
		String stad = input.nextLine();
		
		System.out.println("Vad �r ditt telefonnummer?");
		
		String telefon = input.nextLine();
		
		input.close();

		System.out.println("Information:");
	 
		System.out.println("Namn: " + namn);
		
		System.out.println("�lder: " + �lder);
		
		System.out.println("Adress: " + adress + "\r        " + postnummer + " " + stad);
		
		System.out.println("Telefon: " + telefon);

		
	}
	
	
	
	
	
}
