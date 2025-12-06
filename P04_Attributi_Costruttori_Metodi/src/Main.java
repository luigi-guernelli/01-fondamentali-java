/**
 * Classe principale per eseguire il programma OOP esteso.
 * 
 * Obittivo:
 * 1. Usare costruttori per inizializzare oggetti
 * 2. Metodi con/ senza parametri e return.
 * 3. Calcolo dinamico es.(anno nascita da eta e anno corrente).
 * 
 * Esecuzione: java Main
 */
public class Main {
	
	public static void main(String[] args) {
		
		// Creazione oggetti con costruttore (init automatica)
		Persona p1 = new Persona("Luigi", 35);
		Persona p2 = new Persona("Anna", 25);
		
		// Metodi
		p1.saluta();
		int annoNascita1 = p1.calcolaAnnoNascita(2025); // Anno corrente: 30/11/2025
		System.out.println("Sono nato nel " + annoNascita1);
		
		System.out.println(); // Separatore per chiarezza
		
		p2.saluta();
		int annoNascita2 = p2.calcolaAnnoNascita(2025);
		System.out.println("Sono nato nel " + annoNascita2);
		
	}

}
