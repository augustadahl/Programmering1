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

	public static gubbe hangman = new gubbe();

	public static secretword word = new secretword(DocReader());

	public static void main(String[] args) {

		
		
		while (hangman.lives > 0 && !word.finished()) {

			
			
			hangman.show(console);
			
			console.println();
			
			console.println(word.showVisible());
			
			console.println();

			console.println(word.showWrong());
			
			char letter = console.nextChar();

			word.guess(letter, hangman);

			
			
			console.clear();
				
		}
		
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
