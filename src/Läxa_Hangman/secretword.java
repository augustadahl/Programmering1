package L�xa_Hangman;

/**
 * Denna class h�ller koll p� hur ordet man gissar p� ser ut samt skriver ut
 * detta, den h�ller �ven koll p� vilka bokst�ver man gissat p�.
 * 
 * @author August �dahl
 *
 */
public class secretword {

	private String hidden;
	private String visible;
	private String taken;
	private String wrong;
//s�tter ordet
	public secretword(String word) {
		hidden = word;
		visible = word;
		taken = "";
		wrong = "";
	}

	/**
	 * returnerar ordet man gissar p�. Streck f�r de man �nnu inte f�tt r�tt och r�tt bokstav f�r det man f�tt r�tt.
	 * @return ordet fast streckat om man inte gissat r�tt �nnu
	 */
	public String showVisible() {
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

	/**
	 * returnerar alla bokst�ver man gissat fel p�
	 * @return Srting wrong
	 */
	public String showWrong() {
		return wrong;
	}

	/**
	 * Visar det heliga ordet
	 * @return jesus
	 */
	public String showHidden() {
		return hidden;
	}

	/**
	 * man gissar p� en bokstav s� s�tts den in d�r den passar i ordet och om den inte passar f�rlorar man ett liv
	 * @param letter gissningen
	 * @param hangman objektet gubbe f�r att kunna ta bort ett liv
	 */
	public void guess(char letter, gubbe hangman) {

		letter = Character.toLowerCase(letter);

		if (letter != ' ' && letter != '-' && notTaken(letter)) {

			String new_vis = "";
			boolean correct = false;

			taken += letter;

			for (int i = 0; i < visible.length(); i++) {
				if (letter == visible.toLowerCase().charAt(i)) {
					new_vis += '-';
					correct = true;
				} else {
					new_vis += visible.charAt(i);
				}
			}

			visible = new_vis;

			if (!correct) {
				hangman.subtract();
				wrong += letter;
			}

		}

	}

	/**
	 * kollar om bokstaven man gissar p� redan har gissats p� och returnerar false respektive true
	 * @param letter
	 * @return boooooolean
	 */
	public boolean notTaken(char letter) {
		boolean notTaken = true;

		if (!taken.isEmpty()) {
			for (int i = 0; i < taken.length(); i++) {
				if (taken.charAt(i) == letter) {
					notTaken = false;
				}
			}

		}
		return notTaken;
	}

	/**
	 * kollar om ordet �r komplett
	 * @return booooooolean
	 */
	public boolean finished() {

		if (showVisible().equals(hidden)) {
			return true;
		} else {
			return false;
		}

	}

}
