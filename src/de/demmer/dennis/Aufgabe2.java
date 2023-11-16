package de.demmer.dennis;

public class Aufgabe2 {
	
	static void getInput(String input) {
		
		switch (input) {
		case "exit":
			System.out.println("Das Programm wird beendet");
			break;
		case "start":
			System.out.println("Das Programm wird jetzt ausgeführt. Das kann einige Minuten dauern");
			break;
		case "pause":
			System.out.println("Rechenvorgang pausiert");
		default:
			System.out.println("Befehl `"+ input + "` nicht gefunden");
			break;
		}
		
		
	}
	

	public static void main(String[] args) {
		
		String s = "exit";
		getInput(s);
		

	}

}
