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
	
	public static gubbe hangman = new gubbe();
	
	public static secretword word = new secretword(DocReader());
	
	
	public static void main(String[] args) {
		
		while (hangman.lives > 0) {
			
			char input = console.nextChar();
			
			word.guess(input, hangman, console);
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}
	
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
		
		return lines.get(rd.nextInt(0 + lines.size()));
	}
	
	
	
	
	
}


















