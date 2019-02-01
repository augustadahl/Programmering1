package Encryption;

import java.util.Random;
import java.util.Scanner;

//Ta in en text
//Skriva ut ett scifer plus 16bit kod
//"AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz_.,:;!?' "

public class Caesar {

	public static Random rd = new Random();
	
	public static void main(String[] args) {
		
		System.out.println(KeySelector());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Decode / Encode to chose mode");
		
		String mode = sc.nextLine();
		
		if (mode == "Decode") {
			System.out.println("Input the text:");
			
			System.out.println("Input the 16 letter code");
		}
		else if (mode == "Encode") {
			
		}
		else {
			System.out.println("Wrong input... restart program");
		}
	}
	
	public static char KeySelector() {
		
		int place = rd.nextInt(61 - 0);
		
		String variables = "1234567890abcdefghijklmnopqrstuvwxyz!#%&/()=?+$£@{[]},.-;:*<>";
		//61
		char code = variables.charAt(place);
		
		return code;
	}
	
	public static int Valuefinder(char chr) {
		String variables = "1234567890abcdefghijklmnopqrstuvwxyz!#%&/()=?+$£@{[]},.-;:*<>";
		
		int value = 0;
		
		for (int i = 0; i < variables.length(); i++) {
			if (chr == variables.charAt(i)) {
				value = i + 1;
				break;
			}
		}
		return value;
	}
	
}
