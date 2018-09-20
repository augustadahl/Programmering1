package Misc;
import java.util.Scanner;

public class Minixräknare {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int summa = 0;
		int tal = input.nextInt();
		summa = summa + tal;
		while(tal != 0) {
			tal = input.nextInt();
			summa = summa + tal;
		}
		System.out.println("Summa = " + summa);
		
		
		
	}
}
