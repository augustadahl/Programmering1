package Kattis;

import java.util.Arrays;
import java.util.Scanner;

public class Coloring_Socks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Socks = sc.nextInt();
		
		int Cap = sc.nextInt();
		
		int Diff = sc.nextInt();
		
		int[] SockArr = new int[Socks];
		
		for (int i = 0; i < SockArr.length; i++) {
			SockArr[i] = sc.nextInt();
		}
		
		int machines = 1;
		
		Arrays.sort(SockArr);
		
		int pivot = 0;
		
		for (int i = 1; i < SockArr.length; i++) {
			
			if (i - pivot < Cap) {
				
				if (!(SockArr[i] - SockArr[pivot] <= Diff)) {
					
					machines++;
					pivot = i;
					
				} 
			}
			else {
				pivot = i;
				machines++;
			}
	
		}
		
		System.out.println(machines);
	
	}
}
