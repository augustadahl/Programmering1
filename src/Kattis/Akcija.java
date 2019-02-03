package Kattis;

import java.util.Arrays;
import java.util.Scanner;

public class Akcija {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] books = new int[N];
		
		for (int i = 0; i < books.length; i++) {
			books[i] = sc.nextInt();
		}
		
		Arrays.sort(books);
		
		int current = 0;
		int price = 0;
		
		for (int i = books.length - 1; i >= 0; i--) {
			current++;
			if (current == 3) {
				current = 0;
			}
			else {
				price += books[i];
			}
		}
		
		System.out.println(price);
		
	}
	
}
