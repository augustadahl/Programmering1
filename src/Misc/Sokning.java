package Misc;

public class Sokning {

	public static void main(String[] args) {

		// Hur många 7:or finns det i numbers?
		//
		// Hur många personer som heter Tom finns det i names?
		//
		// Vilket nummer finns det flest respektive minst utav i numbers?
		//
		// På vilket index finns namnet Drusilla i names?
		//
		// Vad är summan av alla jämna tal i numbers?
		//
		// Hur många finns det av varje tal i numbers?
		// (antal 1:or, antal 2:or ...)
		//
		// Hur många namn börjar på bokstaven L i names?
		//
		// Hur många namn är fem bokstäver långa i names?
		//
		// Svårare uppgifter:
		//
		// Hur många unika namn finns det i names?
		//
		// Vilket är det namn som förekommer flest gånger i names?

		// 100 tal i intervallet [0-9]
		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };

		// 100 namn
		String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
				"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
				"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola",
				"Margie", "Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney",
				"Diana", "Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami",
				"Lashanda", "Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee",
				"Yael", "Kelle", "Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady",
				"Rigoberto", "Felicia", "Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela",
				"Ophelia", "Alesha", "Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin",
				"Emmie", "Mickie", "Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

		// 1
		int summa = 0;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == 7) {
				summa++;
			}

		}

		System.out.println("uppg. 1 = " + summa);

		// 2
		summa = 0;

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Tom")) {
				summa++;
			}
		}
		System.out.println("Uppg. 2 = " + summa);

		// 3
		int[] summa2 = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j == numbers[i]) {
					summa2[j]++;
				}
			}
		}

		int minst = Integer.MAX_VALUE;
		int mindex = 0;
		int storst = Integer.MIN_VALUE;
		int maxdex = 0;

		for (int i = 0; i <= 9; i++) {
			if (summa2[i] < minst) {
				minst = summa2[i];
				mindex = i;
			}
			if (summa2[i] > storst) {
				storst = summa2[i];
				maxdex = i;
			}

		}
		System.out.println("uppg. 3 :");
		System.out.println("Minst = " + mindex);
		System.out.println("Flest = " + maxdex);

		// 4 Drusilla
		System.out.print("Uppg. 4 Index : ");
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Drusilla")) {
				System.out.println(i);
			}
		}

		// 5
		int summa3 = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				summa3 = summa3 + numbers[i];
			}
		}
		System.out.println("uppg. 5 = " + summa3);

		// 6
		System.out.println("uppg. 6 : ");
		int[] summa4 = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j == numbers[i]) {
					summa4[j]++;
				}
			}
		}

		for (int i = 0; i < summa4.length; i++) {
			System.out.println(i + ". " + summa4[i]);
		}

		// 7
		int summa5 = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].charAt(0) == 'L') {
				summa5++;
			}
		}
		System.out.println("uppg. 7 = " + summa5);

		// 8
		int summa6 = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() == 5) {
				summa6++;
			}
		}
		System.out.println("uppg. 8 = " + summa6);

		// 9
		int summa7 = 0;
		boolean temp = true;

		//den som testas = i
		for (int i = 0; i < names.length; i++) { 
			//i testas för varje j
			for (int j = 0; j < names.length; j++) {
				// så länge inte dom är samma index
				if (j != i) {
					//om i och j är samma så betyder det att den inte är unik 
					if (names[i].equals(names[j])) {
						System.out.println(false);
						temp = false;
					}
				}
			}
		}

		if (temp = false) {
			temp = true;
		} else {
			summa7++;
		}
		System.out.println("uppg. 9 = " + summa7);

	}

}
