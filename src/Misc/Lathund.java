package Misc;

public class Lathund {

	public static void main(String[] args) {
		
		for(int vertical = 1; vertical <= 10; vertical++) {
			
			for(int horizontal = 1; horizontal <= 10; horizontal++) {
				
				if(vertical * horizontal < 10) {
					System.out.print(vertical * horizontal + "  ");
				}
				else {
					System.out.print(vertical * horizontal + " ");
				}
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
	}

}
