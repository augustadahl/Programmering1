package Tävling;

import java.util.Arrays;
import java.util.Scanner;


public class Renoveringen {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int need = sc.nextInt();
		
		int has = sc.nextInt();
		
		
		int[] needlenght = new int[need];
		
		for (int i = 0; i < needlenght.length; i++) {
			needlenght[i] = sc.nextInt();
		}
		
		Arrays.sort(needlenght);
		
		
		int[] haslenght = new int[has];
		
		for (int i = 0; i < haslenght.length; i++) {
			haslenght[i] = sc.nextInt();
		}
		
		Arrays.sort(haslenght);
		
		
		int temp = needlenght.length - 1;
		
		for (int i = haslenght.length - 1; i >= 0; i--) {
			while (true) {
				if (temp < 0) {
					break;
				}
				
				if (needlenght[temp] <= haslenght[i]) {
					needlenght[temp] = 0;
					temp--;
					break;
				} else {
					temp--;
				}

			}
		
		}
		
		
		
		int buy = 0;
		
		for (int i = 0; i < needlenght.length; i++) {
			if (needlenght[i] != 0) {
				buy++;
			}
		}
		
		System.out.println("Antal: " + buy);
		
		System.out.print("Längder: ");
		
		for (int i = 0; i < needlenght.length; i++) {
			if (needlenght[i] != 0) {
				System.out.print(needlenght[i] + " ");
			}
			
		}
	
	}	
	
}
