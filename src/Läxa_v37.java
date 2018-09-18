import java.util.Scanner;

public class Läxa_v37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv 10 siffror");
		
		int tal1 = input.nextInt(); //frågar efer 10 tal
		int tal2 = input.nextInt();
		int tal3 = input.nextInt();
		int tal4 = input.nextInt();
		int tal5 = input.nextInt();
		int tal6 = input.nextInt();
		int tal7 = input.nextInt();
		int tal8 = input.nextInt();
		int tal9 = input.nextInt();
		int tal10 = input.nextInt();
		
		input.close();
		
		int summa = tal1+tal2+tal3+tal4+tal5+tal6+tal7+tal8+tal9+tal10; //räknar ut medelvärdet
		double medel = summa / 10.0;
		
		int stor = tal1; //1
		
		if (stor <= tal2) { //2
			stor = tal2;
		}
		if (stor <= tal3) { //3
			stor = tal3;
		}
		if (stor <= tal4) { //4
			stor = tal4;
		}
		if (stor <= tal5) { //5
			stor = tal5;
		}
		if (stor <= tal6) { //6
			stor = tal6;
		}
		if (stor <= tal7) { //7
			stor = tal7;
		}
		if (stor <= tal8) { //8
			stor = tal8;
		}
		if (stor <= tal9) { //9
			stor = tal9;
		}
		if (stor <= tal10) { //10
			stor = tal10;
		}
		
		
		
		// om tal2 >= största tal så är tal2 störst just nu annars testa nästa tal

		System.out.println(summa);
		System.out.println("medel: " + medel);
		System.out.println("största talet är: " + stor);
		
	}
	
}
