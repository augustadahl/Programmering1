import java.util.Scanner;

public class Gangertabell {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("skriv in ett heltal");
		
		int tal = input.nextInt();
		
		for (int i = 1; i <= 15; i++) {
			System.out.println(tal + "*" + i + "=" + tal * i);
		}
		
		
	}
	
}
