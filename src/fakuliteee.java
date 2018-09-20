import java.util.Scanner;

public class fakuliteee {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv ett tal du vill multiplicera med fakulitet");
		
		int tal = input.nextInt();
		
		input.close();
		
		int summa = 1;
		
		for(int i = 2; i <= tal; i++) {
			System.out.print(summa + "*" + i + "=");
			summa = summa * i;
			
			System.out.println(summa);
		}
		System.out.println();
		System.out.println("Ditt slutgiltiga resultat är:");
		System.out.print(summa);
	
		
		
	}
	
	
}
