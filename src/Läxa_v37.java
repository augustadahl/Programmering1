import java.util.Scanner;

public class L�xa_v37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv 10 siffror");
		
		int tal1 = input.nextInt(); //fr�gar efer 10 tal
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
		
		int summa = tal1+tal2+tal3+tal4+tal5+tal6+tal7+tal8+tal9+tal10; //r�knar ut medelv�rdet
		double medel = summa / 10.0;
		
		int stor =
		
		// om tal2 >= st�rsta tal s� �r tal2 st�rst just nu annars testa n�sta tal
		System.out.println(tal1);
		System.out.println(summa);
		System.out.println(medel);
		
	}
	
}
