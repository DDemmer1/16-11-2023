package de.demmer.dennis;

public class Hinweis {

	
    static int checkInt(int toCheck) {
		
		//hier kommen jetzt die if blöcke hin
	
		//wenn toCheck größer als 0 ->  +1 zurück geben
    	if(toCheck > 0) {
    		return 1;
    	}

		//wenn toCheck kleiner als 0 ->  -1 zurück geben
    	if(toCheck < 0) {
    		return -1;
    	}
	
		
		// ein Rückgabewert muss auf jedenfall ohne Bedingung erreichbar sein
		// Wenn int toCheck nicht größer oder kleiner 0 ist, dann muss er zwangsläufig den Wert 0 haben
		return 0;

	}
    


    static int checkIntAlternative(int toCheck) {
    	int ergebnis = 0;
    	
    	if(toCheck > 0 ) {
    		ergebnis = 1;
    	} else {
    		ergebnis = -1;
    	}
    		
    	return ergebnis;
    }
    
    
    
    
	

	
	public static void main(String[] args) {
		System.out.println(checkInt(-23));
		
		int i = 123;
		System.out.println("Break");
	}

}
