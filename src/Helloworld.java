import java.util.Scanner;

public class Helloworld {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		int y = input.nextInt();
	
		input.close();
	
		if(x>0 && y>0) {
			System.out.println(1);
		}
		
		if(x>0 && y<0) {
			System.out.println(4);
		}
		
		if(x<0 && y>0) {
			System.out.println(2);
		}
		
		if(x<0 && y<0) {
			System.out.println(3);
		}
		
		
	} // End Main 
	
	
} // End Helloworld