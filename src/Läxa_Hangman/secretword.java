package Läxa_Hangman;

import hangman.HangmanConsoleWindow;

public class secretword {

	private String hidden;
	private String visible;
	private String taken;

	public secretword(String word) {
		hidden = word;
		visible = word;
	}

	public String showWord() {
		String show = "";
		for (int i = 0; i < visible.length(); i++) {
			if (visible.charAt(i) == '-') {
				show += hidden.charAt(i);
			} else if (visible.charAt(i) == ' ') {
				show += ' ';
			} else {
				show += '-';
			}
		}
		return show;
	}
	
	public String showTaken() {
		return taken;
	}

	public void guess(char letter, gubbe hangman, HangmanConsoleWindow console) {
		if (letter != ' ' && letter != '-' && notTaken(letter)) {

			String new_vis = "";
			boolean correct = false;

			taken += letter;

			for (int i = 0; i < visible.length(); i++) {
				if (letter == visible.charAt(i)) {
					new_vis += '-';
					correct = true;
				} else {
					new_vis += visible.charAt(i);
				}
			}
			visible = new_vis;

			if (!correct) {
				hangman.subtract();
			}

		} else {
			console.println("Invalid guess");
		}
			
		
	}

	public boolean notTaken(char letter) {
		boolean notTaken = true;
		
		if (taken.length() > 0) {
			for (int i = 0; i < taken.length(); i++) {
				if (taken.charAt(i) == letter) {
					notTaken = false;
				}
			}

		}
		return notTaken;
	}

	public boolean finished() {

		if (showWord().equals(hidden)) {
			return true;
		} else {
			return false;
		}

	}

}
