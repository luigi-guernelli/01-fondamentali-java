package biblioteca.model;

import java.time.LocalDate; // Import per calcolare anno corrente (da P17+)
/**
 * SuperClasse atratta per persone nella biblioteca.
 * Calcola età dinamicamente: anno_corrente - anno-nascita;
 * Esempio uso: new Studente ("Mario", "Rossi", 2000) -> Età: 35 se (anno corrente 2025).
 */

public abstract class Persona {
	protected String nome;		// Protected: ereditabile
	protected String cognome;
	protected int annoNascita;
	
	// Costruttore base da (P05)
	public Persona(String nome, String cognome, int annoNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.annoNascita = annoNascita;
	}
	
		// Getter e Setter - incapsulamento
		public String getNome() { return nome; }
		public String getCognome() { return cognome; }
		public int getAnnoNascita() { return annoNascita; }
		
		// Metodo per calcolare e stampare età (usa LocalDate da P17)
		public int calcolaEta() {
			int annoCorrente = LocalDate.now().getYear();
			return annoCorrente - annoNascita;
		}
		
		// toString override da (P07) per output pulito
		@Override
		public String toString() {
	        return "Persona: " + nome + " " + cognome + " (Nato: " + annoNascita + 
	               ", Età: " + calcolaEta() + " anni)";
	    }
			
	}
