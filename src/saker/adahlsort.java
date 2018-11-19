package saker;

import java.util.Random;

public class adahlsort {

	public static void main(String[] args) {

		Random random = new Random();

		System.out.println("Unsorted :");

		int[] intArr = new int[random.nextInt(50 - 20) + 20]; // Skapar en int array som är mellan 50 och 20 stor

		for (int i = 0; i < intArr.length; i++) { // Ger platserna i arrayen en int mellan 0 och 100

			intArr[i] = random.nextInt(100 - 0) + 0;
			System.out.print(intArr[i] + " ");
		}

		System.out.println();

		int compares = 0;
		
		int[] tempArr = new int[intArr.length];
		
		int low = 0;

		int high = intArr.length - 1;
		
		int temp = intArr.length - 1;
		
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[temp] >= intArr[i]) {
				tempArr[low] = intArr[i];
				low++;
			} else {
				tempArr[high] = intArr[i];
				high--;
			}
		}
		tempArr[low] = temp;
		
		System.out.println(temp);
		
		for (int i = 0; i < tempArr.length; i++) {
			System.out.println(tempArr[i]);
		}
	}
}
