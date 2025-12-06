/**
 * Progetto fondamentale: Tipi primitivi e Variabili in Java.
 * 
 * Obiettivo:
 * 1. Esplorare i tipi di dati primitivi e oggetti base (String)
 * 2. Dichiarazione, inizializzazione e output di variabili.
 * 3. Esempio pratico: Creare un "profilo utente" semplice.
 * 
 * Tipi coperti: int (intero), double (decimale), boolean (logico),
 * 				 chat (carattere), String (testo, tipo oggetto).
 * 
 * Compilazione: javac Variabili.java
 * Esecuzione: java Variabili
 */
public class Variabili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Tipi primitivi: valori base immutabili e efficienti
		int eta = 35;						// Numero intero da (-2^31 a 2^31-1)
		double altezza = 1.75;				// Numero decimale (floating pointm, precisione doppia)
		boolean maggiorenne = true;			// Valore logico (true/false)
		char iniziale = 'L';				// Singolo carattere (tra apici singoli)
		
		// Tipo ogggetto: Strting per testi complessi
		String nome = "Luigi";
		
		// Output: STampa del profilo: con concatenazione
		System.out.println("Nome: " + nome);
		System.out.println("Età: " + eta);
		System.out.println("Altezza: " + altezza + "m");
		System.out.println("Maggiorenne?: " + maggiorenne);
		System.out.println("Iniziale: " + iniziale);
		

	}

}
