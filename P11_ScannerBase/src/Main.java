import java.util.Scanner;

/**
 * Progetto 11: Interazioni Utente - Scanner Base
 * 
 * Obiettivo:
 * 1. Import Scanner per input da console (nextLine per String, nextInt per int).
 * 2. Combina con if da (P08) per logica dinamica.
 * 3. Concreto: Crea Pesona con input utente, verifica maggiorenne.
 */
public class Main {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// Input nome (String)
	System.out.print("Inserisci il tuo nome: ");
	String nome = input.nextLine();
	
	// Input eta (int)
	System.out.print("Inserisci la tua eta: ");
	int eta = input.nextInt();
	
	// Crea Persona con input (integra P04/P06: costruttore + getter)
	Persona p1 = new Persona(nome, eta);
	
	// If per verificare da (P06)
	if (eta >= 18 ) { System.out.println("Ciao, " + nome + "! Sei maggiaronne (" + p1.getEta() + " anni).");	}
	else { System.out.println("Ciao, " + nome + "! Sei minorenne (" + p1.getEta() + " anni).");	}

	input.close();
}
}
