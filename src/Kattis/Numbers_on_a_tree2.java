package Kattis;

import java.util.Scanner;

public class Numbers_on_a_tree2 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		sc.close();
		
		int space = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				space = i;
				break;
			}
		}
		
		int H;
		if(space != 0) {
			H = (Integer.parseInt(input.substring(0, space))) + 1;
			input = input.substring(space + 1, input.length()); 
		}
		else {
			H = (Integer.parseInt(input.substring(0, input.length()))) + 1;
			input = ""; 
		}
		
		int value = 0;
		
		for (int i = 1; i < H; i++) {
			value += Math.pow(2, i);
		}
		
		value++;
		
		int index = 1;
		int max = 1;
		int left = 0;
		
		if (!input.isEmpty()) {
			for (int i = 1; i <= input.length(); i++) {
				if (input.charAt(i - 1) == 'L') {

					value -= left + (index + index - 1);
					
					index = index + index - 1;
					
					max = max + max;
					
					left = max - index;
					
				} else {
					
					value -= left + (index + index);
					
					index = index + index;
					
					max = max + max;
					
					left = max - index;
					
				}
			}
		}
		
		System.out.println(value);
		
	}
}
