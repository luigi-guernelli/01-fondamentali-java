/**
 * Classe utility per operazioni matematiche base.
 * 
 * Metodi: Senza parametri (saluta), con parametri/return (aritmetica).
 * Gestione errore: Return -1 per divisione per 0
 */
public class Calcolatrice {
	
	// Metodo senza parametri/return
	void saluta() {
		System.out.println("Ciao, sono una calcolatrice!");
	}
	
	// Metodi con parametri e return
	int somma(int a, int b) { return a + b; }
	int sottrazione(int a, int b) { return a - b; }
	int moltiplicazione(int a, int b) { return a * b; }
	
	int divisione(int a, int b) { if (b != 0) { return a / b; 
	} else {
		System.out.println("Errore: il divisore non può essere zero (0)!");
		return -1; // Valore di gestione dell'errore
	}
	
	}

}
