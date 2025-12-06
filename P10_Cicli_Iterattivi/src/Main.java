/**
 * Progetto P10: Controlli di Flusso - Cicli iterattivi.
 * 
 * Obiettivco:
 * 1. For: Ripeti il numero noto un numero di volte: (init; cond; incr).
 * 2. While: Ripeti finchè la condizione diventi vera.
 * 3. Do-While: Esegui almeno una volta, poi verifica.
 * 4. Concreto: Stampa 3 Libro (da P07) con cicli.
 */
import biblioteca.Libro;

public class Main {
	
	public static void main (String[] args) {
		// Array di 3 Libro
		Libro[] biblioteca = {
				new Libro("Libro1", "Autore1"),
				new Libro("Libro2", "Autore2"),
				new Libro("Libro3", "Autore3")
		};
		
		// Ciclo for: Stampa tutti (conosciuto: 3 elementi)
		System.out.println("=== Ciclo For (3 iterazioni) ===");
		for(int i=0; i < 3; i++) {
			biblioteca[i].descriviLibro();
		}
		
		// Ciclo while: Stampa i primi 2 (contatore manuale)
				System.out.println("\n=== Ciclo While (2 iterazioni) ===");
				int j = 0;
				while (j < 2) {
					biblioteca[j].descriviLibro();
					j++;
			}
		// Ciclo do-while: Stampa 1 (almeno una, ma cond falsa dopo)
				System.out.println("\n=== Ciclo Do-Whilòe (1-iterazione) ===");
				int k=0;
				do {
					biblioteca[k].descriviLibro();
					k++;
				} while (k < 1); // Falsa dopo aver verificato la prima
			
		}
	}

