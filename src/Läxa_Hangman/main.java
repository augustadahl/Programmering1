package Läxa_Hangman;

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
		
		console.println("Välkomen till hänga gubbe!");

		console.println("Regler: Du har 9 liv. Du förlorar ett liv när du gissar fel. Klicka på en bokstav för att gissa på den.");
		
		console.println();
		
		console.println();
		
		console.println("Klicka valfri bokstav för att börja");
		
		//om man klickar går man vidare
		
		console.nextChar();
		
		console.clear();
		
		//loopar tills spelet avslutas
		
		while (true) {
			
			//skapar ett nytt ord och en ny gubbe att avrätta
			
			gubbe hangman = new gubbe();

			secretword word = new secretword(DocReader());
			
			//loopar tills man förlorar eller vinner
			
			while (hangman.lives > 0 && !word.finished()) {

				//visar gubben, ordet och allt annat
				
				hangman.show(console);

				console.println();

				console.println(word.showVisible());

				console.println();

				console.println(word.showWrong());
				
				//tar in ett ord som man gissar på

				char letter = console.nextChar();

				word.guess(letter, hangman);

				console.clear();

			}
			
			//skriver ut att man antingen vunnit eller förlorat + allt annat

			if (word.finished()) {
				console.println("Du vann!!");
			}

			if (hangman.lives == 0) {
				console.println("Du förlorade! Rätt ord var " + word.showHidden());
			}

			console.println();

			hangman.show(console);

			console.println();

			console.println(word.showVisible());

			console.println();

			console.println(word.showWrong());
			
			console.println();
			
			//för att avgöra hur många fler gubbar som ska avrättas får man här ett alternativ
			
			console.println("tryck 1 för att köra igen");
			
			console.println("tryck 2 för att avsluta");
			
			char exit = console.nextChar();
			
			if (exit == '2') {
				break;
			}
			
			console.clear();
		}
		
		console.exit();
		
	}

	/**
	 * Denna metod läser in en massa substantiv från ett separat dokumet och returnerar slumpmässigt ett av dessa
	 * @return en String utan mellanslag
	 */
	public static String DocReader() {

		ArrayList<String> lines = new ArrayList<String>();

		try {
			Scanner file_reader = new Scanner(new File("src/Läxa_Hangman/words.txt"));
			while (file_reader.hasNextLine()) {
				lines.add(file_reader.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("wong");
		}

		//eftersom jag är en lazy ass boi låter jag programet ta bort "en " från orden.
		return lines.get(rd.nextInt(0 + lines.size())).substring(3);
	}

}
