package saker;

import java.io.Console;
import java.util.Random;

public class bubble_sort {

	public static void main(String[] args) {

		Random random = new Random();
		
		System.out.println("Unsorted :");

		int[] intArr = new int[random.nextInt(50 - 20) + 20]; //Skapar en int array som är mellan 50 och 20 stor

		for (int i = 0; i < intArr.length; i++) { //Ger platserna i arrayen en int mellan 0 och 100

			intArr[i] = random.nextInt(100 - 0) + 0;
			System.out.print(intArr[i] + " ");
		}
		
		System.out.println();

		int compares = 0;

		int temp;
		
		int unsorted = intArr.length - 1;

		while (unsorted > 0) { //Använder bubblesort för att sortera dessa värden efter storleksordning
			unsorted = intArr.length - 1;
			for (int i = 0; i < intArr.length - 1; i++) {
				if (intArr[i] > intArr[i + 1]) {
					temp = intArr[i];
					intArr[i] = intArr[i + 1];
					intArr[i +1] = temp;
				}
				else {
					unsorted--;
				}
				compares++;
			}
		}
		
		System.out.println("Sorted :");
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		System.out.println("Compares = " + compares);
		

		
		
		
	}

}
