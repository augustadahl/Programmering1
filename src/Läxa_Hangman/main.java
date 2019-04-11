package L�xa_Hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import hangman.HangmanConsoleWindow;

public class main {

	public static Random rd = new Random();

	public static HangmanConsoleWindow console = new HangmanConsoleWindow();

	public static void main(String[] args) {

		//skriver ut meddelande
		
		console.println("V�lkomen till h�nga gubbe!");

		console.println("Regler: Du har 9 liv. Du f�rlorar ett liv n�r du gissar fel. Klicka p� en bokstav f�r att gissa p� den.");
		
		console.println();
		
		console.println();
		
		console.println("Klicka valfri bokstav f�r att b�rja");
		
		//om man klickar g�r man vidare
		
		console.nextChar();
		
		console.clear();
		
		//loopar tills spelet avslutas
		
		while (true) {
			
			//skapar ett nytt ord och en ny gubbe att avr�tta
			
			gubbe hangman = new gubbe();

			secretword word = new secretword(DocReader());
			
			//loopar tills man f�rlorar eller vinner
			
			while (hangman.lives > 0 && !word.finished()) {

				//visar gubben, ordet och allt annat
				
				hangman.show(console);

				console.println();

				console.println(word.showVisible());

				console.println();

				console.println(word.showWrong());
				
				//tar in ett ord som man gissar p�

				char letter = console.nextChar();

				word.guess(letter, hangman);

				console.clear();

			}
			
			//skriver ut att man antingen vunnit eller f�rlorat + allt annat

			if (word.finished()) {
				console.println("Du vann!!");
			}

			if (hangman.lives == 0) {
				console.println("Du f�rlorade! R�tt ord var " + word.showHidden());
			}

			console.println();

			hangman.show(console);

			console.println();

			console.println(word.showVisible());

			console.println();

			console.println(word.showWrong());
			
			console.println();
			
			//f�r att avg�ra hur m�nga fler gubbar som ska avr�ttas f�r man h�r ett alternativ
			
			console.println("tryck 1 f�r att k�ra igen");
			
			console.println("tryck 2 f�r att avsluta");
			
			char exit = console.nextChar();
			
			if (exit == '2') {
				break;
			}
			
			console.clear();
		}
		
		console.exit();
		
	}

	/**
	 * Denna metod l�ser in en massa substantiv fr�n ett separat dokumet och returnerar slumpm�ssigt ett av dessa
	 * @return en String utan mellanslag
	 */
	public static String DocReader() {

		ArrayList<String> lines = new ArrayList<String>();

		try {
			Scanner file_reader = new Scanner(new File("src/L�xa_Hangman/words.txt"));
			while (file_reader.hasNextLine()) {
				lines.add(file_reader.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("wong");
		}

		//eftersom jag �r en lazy ass boi l�ter jag programet ta bort "en " fr�n orden.
		return lines.get(rd.nextInt(0 + lines.size())).substring(3);
	}

}
