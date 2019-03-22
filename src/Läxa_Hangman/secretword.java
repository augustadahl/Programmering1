package Läxa_Hangman;

public class secretword {

	private String hidden;
	private String visible;
	
	public secretword(String word){
		hidden = word;
		visible = word;
	}
	
	public String show() {
		String show = "";
		for (int i = 0; i < visible.length(); i++) {
			if (visible.charAt(i) == '-') {
				show += hidden.charAt(i);
			} else if(visible.charAt(i) == ' '){
				show += ' ';
			} else {
				show += '-';
			}
		}
		return show;
	}
	
	public void guess(char guess) {
		if (guess != ' ' && guess != '-') {
			String new_vis = "";
			boolean correct = false;
			
			for (int i = 0; i < visible.length(); i++) {
				if (guess == visible.charAt(i)) {
					new_vis += '-';
					correct = true;
				}
				else {
					new_vis += visible.charAt(i);
				}
			}
			visible = new_vis;
			
			if (!correct) {
				//lägg till en på gubbe
			}
			
		}	
	}
	
	public boolean finished(){
		
		if (show().equals(hidden)) {
			return true;
		} else {
			return false;
		}
		
	}	
	
}
