package l�xor;
import java.util.Scanner;

public class L�xa_v37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//fr�gar efer 10 tal
		
		System.out.println("Skriv 10 heltal:");
		
		int tal1 = input.nextInt(); 
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
		
		// r�knar ut summa och medel
		
		int summa = tal1+tal2+tal3+tal4+tal5+tal6+tal7+tal8+tal9+tal10; //r�knar ut medelv�rdet
		double medel = summa / 10.0;
		
		//testar st�rsta v�rdet
		
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
		
		// testar minsta v�rdet
		
		int minst = tal1; //1
		
		if (minst >= tal2) { //2
			minst = tal2;
		}
		if (minst >= tal3) { //3
			minst = tal3;
		}
		if (minst >= tal4) { //4
			minst = tal4;
		}
		if (minst >= tal5) { //5
			minst = tal5;
		}
		if (minst >= tal6) { //6
			minst = tal6;
		}
		if (minst >= tal7) { //7
			minst = tal7;
		}
		if (minst >= tal8) { //8
			minst = tal8;
		}
		if (minst >= tal9) { //9
			minst = tal9;
		}
		if (minst >= tal10) { //10
			minst = tal10;
		}
		
		
		// output

		System.out.println("Summa: " + summa);
		System.out.println("Medelv�rdet: " + medel);
		System.out.println("St�rsta talet: " + stor);
		System.out.println("Minsta talet: " + minst);
		
	}
	
}
