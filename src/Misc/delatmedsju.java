package Misc;

public class delatmedsju {
	
	public static void main(String[] args) {
		
		int summa = 0;
		
		for(int i = 0; i <= 10000; i++) {
			if(i % 7 == 0) {
				summa = summa + i;
				System.out.println(i);
			}
			
		}
		
		System.out.println(summa);
		
	}

}
