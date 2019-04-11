package L�xa_Hangman;

import hangman.HangmanConsoleWindow;

/**
 * Denna class �r till f�r att h�lla koll p� liv i spelet h�nga gubbe, den
 * skriver ut gubben och s� m�nga liv man har kvar.
 * 
 * @author August �dahl
 *
 */
public class gubbe {

	public int lives;
//best�mmer ens liv
	public gubbe() {
		lives = 9;
	}
	
	/**
	 * tar bort ett liv
	 */
	public void subtract() {
		lives--;
	}
	
	/**
	 * skriver ut gubben beroende p� hur m�nga liv man har kvar
	 */
	public void show(HangmanConsoleWindow console) {

		switch (lives) {

		case 9:
			console.print("               \n");
			console.print("               \n");
			console.print("               \n");
			console.print("               \n");
			console.print("               \n");
			console.print("               \n");
			console.print("               \n");
			break;
		case 8:
			console.print("               \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			break;
		case 7:
			console.print(" _________     \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			break;
		case 6:
			console.print(" _________     \n");
			console.print("|         |    \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			break;
		case 5:
			console.print(" _________     \n");
			console.print("|         |    \n");
			console.print("|         0    \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			break;
		case 4:
			console.print(" _________     \n");
			console.print("|         |    \n");
			console.print("|         0    \n");
			console.print("|         |    \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			break;
		case 3:
			console.print(" _________     \n");
			console.print("|         |    \n");
			console.print("|         0    \n");
			console.print("|        /|    \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			break;

		case 2:
			console.print(" _________     \n");
			console.print("|         |    \n");
			console.print("|         0    \n");
			console.print("|        /|\\  \n");
			console.print("|              \n");
			console.print("|              \n");
			console.print("|              \n");
			break;
		case 1:
			console.print(" _________     \n");
			console.print("|         |    \n");
			console.print("|         0    \n");
			console.print("|        /|\\  \n");
			console.print("|        /     \n");
			console.print("|              \n");
			console.print("|              \n");
			break;
		case 0:
			console.print(" _________     \n");
			console.print("|         |    \n");
			console.print("|         0    \n");
			console.print("|        /|\\  \n");
			console.print("|        / \\  \n");
			console.print("|              \n");
			console.print("|              \n");
			break;
		default:
			break;
		}

		console.println("Gissningar kvar: " + lives);

	}

}
