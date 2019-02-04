package Prpr;

import java.util.HashMap;
import java.util.Scanner;

public class rekursion {

	public static HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println(sum(10));
		
		System.out.println(reverse("Nils e bäst!"));
		
		System.out.println(fibo(7));
		
	}
	
	public static int sum(int X) {
		
		if (X == 1) {
			return 1;
		} else {
			return X + sum(X - 1);
		}
		
	}
	
	public static String reverse(String Str) {
		
		if (Str.length() == 1) {
			return Str;
		} else {
			return Str.charAt(Str.length() - 1) + reverse(Str.substring(0, Str.length() - 1));
		}
			
	}
	
	public static int fibo(int N) {
		
		if (N <= 2) {
			return 1;
		} else {
			return fibo(N - 1) + fibo(N - 2);
		}
		
	}
	
//	public static int fuck(int X) {
//		
//		if (X == 1) {
//			
//		} else {
//
//		}
//		
//	}
	
//	public static int fib_cache(int N) {
//		
//		fakulitet med hashmap
//		
//		
//		
//	}
	
	
}
