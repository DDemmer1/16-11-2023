package de.demmer.dennis;

public class Wiederholung {
	
	
	public static void main(String[] args) {
		
		
		// - implizites casting - 
		// 32bit
		int i = 345;
		
		// 64bit
		double d = i;
		
		
		
		// - explizites casting - 
		// 64bit
		double d1 = 600.11;
		
		// 32bit
		int i1 = (int) d1;
		
		System.out.println(i1);
		
		
		
		//Szenario Textmessenger. Max. 40 Zeichen pro Nachricht
		
		String message = "Hallo, das ist meine erste Nachricht!";
		
		// if-else
		
		int messageLength = message.length();
		
		if(messageLength >= 40) {
			System.out.println("Die Nachricht ist zu lang");
		} else if(messageLength != 0){
			System.out.println("Die Nachricht wurde versendet");
		} else if(true) {
			
		} else {
			
		}
		
		
		
		int x = 10;
		
		//STRG + LEERTASTE -> switch-case-statement
		switch (x) {
		case 10:
			System.out.println("Die variable hat den Wert 10");
			break;
		case 11:
			System.out.println("Die var ist 11");
			break;

		default:
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
