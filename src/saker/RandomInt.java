package saker;

import java.util.Arrays;
import java.util.Random;

public class RandomInt {
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(Mixed(5)));
		
		
	}
	
	
	/**
	 * Denna metod tar in en int och skriver ut siffrorna 0 till int i slumpad ordning
	 * @param Int 
	 * @return 0 to Int 
	 */
	public static int[] Mixed(int lenght) {
		
		Random random = new Random();
		
		int[] IntArr = new int[lenght + 1];
		
		for (int i = 0; i < IntArr.length; i++) {
			IntArr[i] = i;
		}
		
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j < IntArr.length; j++) {
				int index1 = j;

				int temp = IntArr[index1];

				int index2 = random.nextInt((IntArr.length - 1) - 0) + 0;

				IntArr[index1] = IntArr[index2];
				IntArr[index2] = temp;
			} 
		}
		
		return IntArr;
		
		
		
		
	}

}
