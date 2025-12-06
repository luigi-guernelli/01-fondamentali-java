/**
 * Classe Persona estesa: Attributi, Costruttori e Metodi.
 * 
 * Attributi: Incapsulati per OOP.
 * Costruttore: Inizializza al new.
 * Metodi: saluta() void; calcoloAnnoNascita(int) return int.
 * 
 */
public class Persona {
	
	// Attributi (proprietà)
	String nome;
	int eta;
	
	// Costruttore: Inizialòizza oggetto con parametri
	public Persona(String nomeInserito, int etaInserita) {
		nome = nomeInserito;
		eta = etaInserita;
	}
	
	// Metodo senza return: Stampa saluto
	public void saluta() {
		System.out.println("Ciao mi chiamo " + nome + " e ho " + eta + " anni.");
	}
	
	// Metodo con parametro e return: Calcola anno nascita
	public int calcolaAnnoNascita(int annoCorente) {
		return annoCorente - eta;
	}

}
