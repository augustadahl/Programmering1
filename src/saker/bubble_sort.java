package saker;

import java.util.Random;

public class bubble_sort {

	public static void main(String[] args) {

		Random random = new Random();
		
		System.out.println("Unsorted :");

		int[] intArr = new int[random.nextInt(50 - 20) + 20];

		for (int i = 0; i < intArr.length; i++) {

			intArr[i] = random.nextInt(100 - 0) + 0;
			System.out.print(intArr[i] + " ");
		}
		
		System.out.println();


		int temp;
		
		int unsorted = intArr.length - 1;

		while (unsorted > 0) {
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
			}			
		}
		
		System.out.println("Sorted :");
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}

		
		
		
	}

}
