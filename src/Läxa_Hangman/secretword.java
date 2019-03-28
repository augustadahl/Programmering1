package Läxa_Hangman;

/**
 * Denna class håller koll på hur ordet man gissar på ser ut samt skriver ut
 * detta, den håller även koll på vilka bokstäver man gissat på.
 * 
 * @author August Ådahl
 *
 */
public class secretword {

	private String hidden;
	private String visible;
	private String taken;
	private String wrong;
//sätter ordet
	public secretword(String word) {
		hidden = word;
		visible = word;
		taken = "";
		wrong = "";
	}

	/**
	 * returnerar ordet man gissar på. Streck för de man ännu inte fått rätt och rätt bokstav för det man fått rätt.
	 * @return ordet fast streckat om man inte gissat rätt ännu
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
	 * returnerar alla bokstäver man gissat fel på
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
	 * man gissar på en bokstav så sätts den in där den passar i ordet och om den inte passar förlorar man ett liv
	 * @param letter gissningen
	 * @param hangman objektet gubbe för att kunna ta bort ett liv
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
	 * kollar om bokstaven man gissar på redan har gissats på och returnerar false respektive true
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
	 * kollar om ordet är komplett
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
