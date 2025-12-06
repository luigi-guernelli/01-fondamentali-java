/**
 * Classe Persona con incapsulamento: Getter e Setter
 * 
 * Attributi: Private e protezione.
 * Costruttore: Inizializza con validazione base.
 * Getter: Return valori senza esposizione.
 * Setter: Modifiche controllate es(eta > 0).
 */
public class Persona {
	
	// Attributi privati (incapsulati non accessibili direttamente)
	private String nome;
	private int eta;
	
	// Costruttore con validazione iniziale
	public Persona(String nomeInserito, int etaInserita) {
		this.nome = nomeInserito;
		setEta(etaInserita); // Usa setter per validazione anche qui
	}
	
	// Getter per nome
	public String getNome(){ return this.nome; }
	
	// Setter per nome senza validazione, ma controllato
	public void setNome(String nuovoNome) { this.nome = nuovoNome; }
	
	// Getter per eta
	public int getEta() { return this.eta; }
	
	// Setter per eta con validazione
	public void setEta(int nuovaEta) {
		if (nuovaEta > 0) { this.eta = nuovaEta; 
		} else { System.out.println("Età non valida, deve essere positiva (> 0).");
		}
	}
}

