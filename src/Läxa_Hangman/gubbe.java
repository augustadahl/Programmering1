package Läxa_Hangman;

import hangman.HangmanConsoleWindow;

/**
 * Denna class är till för att hålla koll på liv i spelet hänga gubbe, den
 * skriver ut gubben och så många liv man har kvar.
 * 
 * @author August Ådahl
 *
 */
public class gubbe {

	public int lives;
//bestämmer ens liv
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
	 * skriver ut gubben beroende på hur många liv man har kvar
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
