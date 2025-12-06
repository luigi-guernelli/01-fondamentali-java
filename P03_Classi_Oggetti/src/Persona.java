/**
 * Classe generica per rappresentare una "persona" semplice.
 * 
 * Attributi: nome (String), eta (int) - dati incapsulati.
 * Metodo: presentati() - azione base per output.
 * 
 * Fondamenti  OOP: Questa è una "blueprint" per creare oggetti riutilizzabili.
 */
public class Persona {
	
	// Attributi (proprietà/dati della classe, visibili pubblicamente per base)
	String nome;
	int eta;
	
	// Metodo (comportamento/azione dell'oggetto)
	void presentati() {
		System.out.println("Mi chiamo " + nome + " e ho " + eta + " anni.");
	}

}
