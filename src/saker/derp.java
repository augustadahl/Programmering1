package saker;

import java.util.Arrays;

public class derp {
	
	public static void main(String[] args) {
		int[] arr = arr(10);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int[] arr(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;
		}
		return arr;
	}

}
