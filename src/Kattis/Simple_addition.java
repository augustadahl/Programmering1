package Kattis;

import java.math.BigInteger;
import java.util.Scanner;

public class Simple_addition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger x = new BigInteger(sc.next());
		
		BigInteger y = new BigInteger(sc.next());
		
		System.out.println(x.add(y));
		
	}
	
}
