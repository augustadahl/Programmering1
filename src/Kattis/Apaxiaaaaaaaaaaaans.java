package Kattis;

import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nameLong = sc.nextLine();
		
		String nameShort = "";
		
		for (int i = 0; i < nameLong.length() - 1; i++) {
			
			if (nameLong.charAt(i) != nameLong.charAt(i + 1)) {
				nameShort += nameLong.charAt(i);
			}
			
		}
		
		nameShort += nameLong.charAt(nameLong.length() - 1);
		
		System.out.println(nameShort);
		
	}
	
}
