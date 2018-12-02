package saker;

import java.util.Arrays;
import java.util.Random;

public class Bogosort {

	public static Random random = new Random();

	public static void main(String[] args) {
		int[] bogo = {1,3,2,4,6,5,9,8,7};
		bogosort(bogo);
	}
	
	
	
	
	public static void bogosort(int[] arr) {

		boolean sorted = false;
		
		int swap = 0;
		
		while (!sorted) {

			for (int i = 0; i < arr.length; i++) {
				int index1 = random.nextInt((arr.length - 1) - 0) + 0;

				int temp = arr[index1];

				int index2 = random.nextInt((arr.length - 1) - 0) + 0;

				arr[index1] = arr[index2];
				arr[index2] = temp;

				swap++;

				System.out.println("swaps: " + swap + " Array: " + Arrays.toString(arr));
			}
			
			sorted = true;

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					sorted = false;
				}
			}

		}

	}

}
