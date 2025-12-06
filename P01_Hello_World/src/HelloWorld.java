

/** Primo programma in Java: Hello World con tipi promitivi.
 *  Introduce la sintassi base, variabili e output
 *  
 *  Fondamenti coperti:
 *  - Struttra: classe pubblica con metodo main.
 *  - Tipi primitivi: int, double, boolean, char.
 *  - Reference type: String (non primitivo).
 
 */
public class HelloWorld {

	public static void main(String[] args) {
		
	    // Tipi primitivi e reference type
		int numeroIntero = 10;							// Primitivo: intero
		double numeroDecimale = 3.14;               	// Primitivo: decimale
		boolean condizione = true;						// Primitivo: vero/falso
		char iniziale = 'L';							// Primitivo: singolo carattere
		
		// Reference type (non primitiv)
		String messaggio = "Ciao nel mondo Java"; 		// String: testo
		
	     // Output a console
        System.out.println("Hello World!");
        System.out.println("Numero intero: " + numeroIntero);
        System.out.println("Numero decimale: " + numeroDecimale);
        System.out.println("Messaggio: " + messaggio);
        System.out.println("Condizione: " + condizione);
        System.out.println("Iniziale: " + iniziale);


	}

}
