package saker;

import java.util.Arrays;

public class bubble_sort {

	public static void main(String[] args) {
		
		System.out.println("Unsorted :");

		int[] intArr = RandomInt.Mixed(100);
				
		System.out.println(Arrays.toString(intArr));
		
		intArr = Bubblesort(intArr);
		
		System.out.println("Sorted :");
		
		System.out.println(Arrays.toString(intArr));
		

		
		
		
	}
	
	public static int[] Bubblesort(int[] intArr) {
		
		//int compares = 0;

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
				//compares++;
			}
		}
		
		return intArr;
		
	}

}

